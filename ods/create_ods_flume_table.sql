create external table if not exists 1902_g1_ods_nsshop.ods_02_releasedatas(
  customer_id string comment '用户id',
  device_num string comment '设备号',
  device_type string comment '设备类型',
  os string comment '手机系统',
  os_version string comment '手机系统版本',
  manufacturer string comment '手机制造商',
  area_code string comment '地区编码',
  release_sid string comment '投放请求id',
  release_session string comment '投放会话id',
  release_sources string comment '投放渠道',
  release_params string comment '投放请求参数',
  ct bigint comment '创建时间'
) partitioned by (bdp_day string)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
stored as textfile
location '/1902_g1_nsshop/ods/release/';

alter table 1902_g1_ods_nsshop.ods_02_releasedatas add partition (bdp_day='20191119');
