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
from 1902_gxj_ods_nshop.ods_nshop_01_useractlog1
where
    bdp_day='${hiveconf:bdp_day}'
and
	action = '${hiveconf:action}'
and 
    event_type='${hiveconf:event_type}'
)

insert overwrite table 1902_gxj_dwd_nshop.dwd_nshop_actlog_product_comment partition (bdp_day)
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
    ct,
    bdp_day
from log_attend where target_action='${hiveconf:target_action}'；
