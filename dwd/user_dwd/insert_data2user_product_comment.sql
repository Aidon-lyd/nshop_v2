-- 向user表中添加数据
-- 设置一些动态参数
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.exec.max.dynamic.partitions=100000;
set hive.exec.max.dynamic.partitions.pernode=100000;

-- 使用临时表存储数据
with log_attend as (
select
    customer_id,
    device_num,
    device_type,
    os,
    os_version,
    manufacturer,
    carrier,
    network_type,
    area_code,
    get_json_object(extinfo,'$.target_action') as target_action,
    get_json_object(extinfo,'$.target_id') as target_id,
    ct,
    bdp_day
from 1902_g1_ods_nsshop.ods_nshop_01_useractlog
where
    bdp_day='${hiveconf:bdp_day}'
and
    action = '${hiveconf:action}'
and 
    event_type='${hiveconf:event_type}'
)
-- 向用户关注产品表添加数据
insert overwrite table 1902_g1_dwd_nsshop.dwd_actlog_product_comment partition (bdp_day='${hiveconf:bdp_day}')
select
customer_id,
device_num,
device_type,
os,
os_version,
manufacturer,
carrier,
network_type,
area_code,
target_id,
ct
from log_attend
where 
target_action='${hiveconf:target_action}';
