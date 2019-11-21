-- 向user表中添加数据
-- 设置一些动态参数
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.exec.max.dynamic.partitions=100000;
set hive.exec.max.dynamic.partitions.pernode=100000;

-- 向用户启动日志表中添加数据
insert overwrite table 1902_g1_dwd_nsshop.dwd_nshop_actlog_launch partition (bdp_day='20191109')
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
from_unixtime(ct, 'HH') as launch_time_segment,
ct
from 1902_g1_ods_nsshop.ods_nshop_01_useractlog
where bdp_day='${hiveconf:bdp_day}'
and action = '${hiveconf:action}'
;
