set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.exec.max.dynamic.partitions=100000;
set hive.exec.max.dynamic.partitions.pernode=100000;

insert overwrite table 1902_gxj_dwd_nshop.dwd_nshop_actlog_pdtview partition (bdp_day)
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
    get_json_object(extinfo,'$.target_id') as target_id,
    duration,
    ct,
    bdp_day
from 1902_gxj_ods_nshop.ods_01_useractlog
where
	bdp_day = '${hiveconf:bdp_day}'
and
	action in ('07','08');
