drop table if exists 1902_lp_ods_nshop.ods_02_customer_datax;
create table if not exists 1902_lp_ods_nshop.ods_02_customer_datax (
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
row format delimited fields terminated by ','
location '/data/liupei_datax/nshop/ods/ods_02_customer_datax';
