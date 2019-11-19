#用户基本信息表
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table customer \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_ods_nshop.ods_nshop_02_customer1 \
-m 10


#收货地址管理表
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table customer_consignee \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_ods_nshop.ods_nshop_02_customer_consignee1 \
-m 10

create external table if not exists 1902_gxj_ods_nshop.ods_01_releasedatas1(
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
location '/data/nshop/ods/release_gxj/';
