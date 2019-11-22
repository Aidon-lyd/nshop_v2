set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.exec.max.dynamic.partitions=100000;
set hive.exec.max.dynamic.partitions.pernode=100000;

insert overwrite table dwd_nshop.dwd_nshop_actlog_launch partition (bdp_day)
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
    from_unixtime(ct/1000, 'HH') as launch_time_segment,
    ct,
    bdp_day
from ods_nshop.ods_01_useractlog1
where
	bdp_day = '${hiveconf:bdp_day}'
and
	action = '${hiveconf:action}';
