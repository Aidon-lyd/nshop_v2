set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.exec.max.dynamic.partitions=100000;
set hive.exec.max.dynamic.partitions.pernode=100000;

with temp as(
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
    from_unixtime(cast(ct/1000 as bigint), 'HH') as launch_time_segment,
    ct
from 1902_lp_ods_nshop.ods_nshop_01_useractlog
where
	bdp_day = '${hiveconf:bdp_day}'
and
	action in ('07','08')
)
insert overwrite table 1902_lp_dwd_nshop.dwd_nshop_actlog_launch partition (bdp_day= '${hiveconf:bdp_day}' )
select * from temp
;
