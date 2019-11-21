-- 向user表中添加数据
-- 设置一些动态参数
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.exec.max.dynamic.partitions=100000;
set hive.exec.max.dynamic.partitions.pernode=100000;

-- 向用户浏览表中添加数据
insert overwrite table 1902_g1_dwd_nsshop.dwd_nshop_actlog_pdtview partition(bdp_day='${hiveconf:bdp_day}')
select 
onu.customer_id user_id,
onu.device_num device_num,
onu.device_type device_type,
onu.os os,
onu.os_version os_version,
onu.manufacturer manufacturer,
onu.carrier carrier,
onu.network_type network_type,
onu.area_code area_code,
get_json_object(onu.extinfo,'$.target_id') target_id,
onu.duration duration,
onu.ct ct
from 1902_g1_ods_nsshop.ods_nshop_01_useractlog onu
where onu.bdp_day='${hiveconf:bdp_day}'
and onu.action in ('07','08')
;
