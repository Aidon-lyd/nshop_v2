ADD JAR /home/framework/hive-2.1.1/hcatalog/share/hcatalog/hive-hcatalog-core-2.1.1.jar;

drop table if exists 1902_lp_ods_nshop.ods_01_releasedatas;
drop table if exists 1902_lp_ods_nshop.ods_nshop_01_useractlog;
create external table if not exists 1902_lp_ods_nshop.ods_01_releasedatas(
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
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
stored as textfile
location '/data/liupei/nshop/ods/release/';

create external table if not exists 1902_lp_ods_nshop.ods_nshop_01_useractlog(
  action string comment '行为类型:install安装|launch启动|interactive交互|page_enter_h5页面曝光|page_enter_native页面进入|exit退出',
  event_type string comment '行为类型:click点击|view浏览|slide滑动|input输入',
  customer_id string comment '用户id',
  device_num string comment '设备号',
  device_type string comment '设备类型',
  os string comment '手机系统',
  os_version string comment '手机系统版本',
  manufacturer string comment '手机制造商',
  carrier string comment '电信运营商',
  network_type string comment '网络类型',
  area_code string comment '地区编码',
  longitude string comment '经度',
  latitude string comment '纬度',
  extinfo string comment '扩展信息(json格式)',
  duration string comment '停留时长',
  ct bigint comment '创建时间'
) partitioned by (bdp_day string)
ROW FORMAT SERDE 'org.apache.hive.hcatalog.data.JsonSerDe'
STORED AS TEXTFILE
location '/data/liupei/nshop/ods/user_action_log/';
