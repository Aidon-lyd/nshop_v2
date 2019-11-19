
drop table if exists 1902_wm_ods_nshop.ods_nshop_02_customer;
drop table if exists 1902_wm_ods_nshop.ods_nshop_02_customer_consignee;

create external table if not exists 1902_wm_ods_nshop.ods_nshop_02_customer (
 customer_id string COMMENT '用户ID',
 customer_login string COMMENT '用户登录名',
 customer_nickname string COMMENT '用户名(昵称)',
 customer_name string COMMENT '用户真实姓名',
 customer_pass string COMMENT '用户密码',
 customer_mobile string COMMENT '用户手机',
 customer_idcard string COMMENT '身份证',
 customer_gender TINYINT COMMENT '性别：1男 0女',
 customer_birthday string COMMENT '出生年月',
 customer_age TINYINT COMMENT '性别：1男 0女',
 customer_age_range string COMMENT '年龄段(01->[0,17],02->[18-45],03->[46-60],04->[60-100])',
 customer_email string COMMENT '用户邮箱',
 customer_natives string COMMENT '所在地区',
 customer_ctime bigint COMMENT '创建时间',
 customer_utime bigint COMMENT '修改时间',
 customer_device_num string COMMENT '用户手机设备号'
)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' 
LINES TERMINATED BY '\n'
location '/data/wangmeng/nshop/ods/ods_nshop_02_customer/';

create external table if not exists 1902_wm_ods_nshop.ods_nshop_02_customer_consignee (
 consignee_id string COMMENT '收货地址ID',
 customer_id string COMMENT '用户ID',
 consignee_name string COMMENT '收货人',
 consignee_mobile string COMMENT '收货人电话',
 consignee_zipcode string COMMENT '收货人地区',
 consignee_addr string COMMENT '收货人详细地址',
 consignee_tag string COMMENT '标签：1家 2公司 3学校',
 ctime bigint COMMENT '创建时间'
)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' 
LINES TERMINATED BY '\n'
location '/data/wangmeng/nshop/ods/ods_nshop_02_customer_consignee/';
