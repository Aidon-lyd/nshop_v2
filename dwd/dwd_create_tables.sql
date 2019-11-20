drop table if exists 1902_lp_dwd_nshop.dwd_nshop_actlog_launch;
drop table if exists 1902_lp_dwd_nshop.dwd_nshop_actlog_pdtview;
drop table if exists 1902_lp_dwd_nshop.dwd_nshop_actlog_pdtsearch;
drop table if exists 1902_lp_dwd_nshop.dwd_actlog_product_comment;

create external table if not exists 1902_lp_dwd_nshop.dwd_nshop_actlog_launch(
  user_id string comment '用户id',
  device_num string comment '设备号',
  device_type string comment '设备类型',
  os string comment '手机系统',
  os_version string comment '手机系统版本',
  manufacturer string comment '手机制造商',
  carrier string comment '电信运营商',
  network_type string comment '网络类型',
  area_code string comment '地区编码',
  launch_time_segment string comment '启动时间段',
  ct bigint comment '产生时间'
) partitioned by (bdp_day string)
stored as parquet
location '/data/liupei/nshop/dwd/user/dwd_nshop_actlog_launch/';

create external table if not exists 1902_lp_dwd_nshop.dwd_nshop_actlog_pdtview(
  user_id string comment '用户id',
  device_num string comment '设备号',
  device_type string comment '设备类型',
  os string comment '手机系统',
  os_version string comment '手机系统版本',
  manufacturer string comment '手机制造商',
  carrier string comment '电信运营商',
  network_type string comment '网络类型',
  area_code string comment '地区编码',
  target_id string comment '产品ID',
  duration int comment '停留时长',
  ct bigint comment '产生时间'
) partitioned by (bdp_day string)
stored as parquet
location '/data/liupei/nshop/dwd/user/dwd_nshop_actlog_pdtview/';

create external table if not exists 1902_lp_dwd_nshop.dwd_nshop_actlog_pdtsearch(
  user_id string comment '用户id',
  device_num string comment '设备号',
  device_type string comment '设备类型',
  os string comment '手机系统',
  os_version string comment '手机系统版本',
  manufacturer string comment '手机制造商',
  carrier string comment '电信运营商',
  network_type string comment '网络类型',
  area_code string comment '地区编码',
  target_order string comment '查询排序方式',
  target_keys string comment '查询内容',
  target_id string comment '产品ID',
  ct bigint comment '产生时间'
) partitioned by (bdp_day string)
stored as parquet
location '/data/liupei/nshop/dwd/user/dwd_nshop_actlog_pdtsearch/';

create external table if not exists 1902_lp_dwd_nshop.dwd_actlog_product_comment(
  user_id string comment '用户id',
  device_num string comment '设备号',
  device_type string comment '设备类型',
  os string comment '手机系统',
  os_version string comment '手机系统版本',
  manufacturer string comment '手机制造商',
  carrier string comment '电信运营商',
  network_type string comment '网络类型',
  area_code string comment '地区编码',
  target_id string comment '产品ID',
  ct bigint comment '产生时间'
) partitioned by (bdp_day string)
stored as parquet
location '/data/liupei/nshop/dwd/user/dwd_actlog_product_comment/';
