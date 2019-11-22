set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.exec.max.dynamic.partitions=100000;
set hive.exec.max.dynamic.partitions.pernode=100000;

insert overwrite  table 1902_gxj_dwd_nshop.dwd_nshop_actlog_pdtsearch partition(bdp_day)
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
	get_json_object(extinfo,'$.target_order') as target_order,
	get_json_object(extinfo,'$.target_keys') as target_keys,
    target_id,
	ct,
	bdp_day
from 1902_gxj_ods_nshop.ods_nshop_01_useractlog1
lateral view explode(split(regexp_replace(get_json_object(extinfo,'$.target_ids'),'[\\[\\"\\]]',''),',')) t as target_id
where
	action = '${hiveconf:action}'
and
    event_type in ('01','04')
and 
	bdp_day = '${hiveconf:bdp_day};
