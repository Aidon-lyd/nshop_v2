-- 用户基本信息表

create table if not exists 1902_gxj_ods_nshop.ods_nshop_02_customer1 (
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
location '/data/nshop/ods/ods_nshop_02_customer1/';

-- 收货地址管理表
create table if not exists 1902_gxj_ods_nshop.ods_nshop_02_customer_consignee1 (
 consignee_id string COMMENT '收货地址ID',
 customer_id string COMMENT '用户ID',
 consignee_name string COMMENT '收货人',
 consignee_mobile string COMMENT '收货人电话',
 consignee_zipcode string COMMENT '收货人地区',
 consignee_addr string COMMENT '收货人详细地址',
 consignee_tag string COMMENT '标签：1家 2公司 3学校',
 ctime bigint COMMENT '创建时间'
)
location '/data/nshop/ods/ods_nshop_02_customer_consignee1/';



create external table if not exists 1902_gxj_ods_nshop.ods_nshop_02_orders_pay_records1 (
 pay_id string COMMENT '支付记录ID',
 order_id string COMMENT '订单ID',
 customer_id string COMMENT '用户ID',
 pay_status string COMMENT '支付状态：0 支付失败| 1 支付成功',
 pay_type string COMMENT '支付类型：线上支付 10 网上银行 11 微信 12 支付宝 | 线下支付(货到付款) 20 ',
 pay_code string COMMENT '支付对应唯一标识，如微信号、支付宝号',
 pay_nettype string COMMENT '支付网络方式：1 wifi | 2 4g | 3 3g |4 线下支付',
 pay_amount double COMMENT '支付金额',
 pay_ctime bigint  COMMENT '创建时间'
) partitioned by (bdp_day string)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
location '/data/nshop/ods/ods_nshop_02_orders_pay_records1/';


create external table if not exists 1902_gxj_ods_nshop.ods_nshop_02_order_detail1(
 order_detail_id string COMMENT '订单详情表ID',
 order_id string COMMENT '订单表ID',
 product_id string COMMENT '订单商品ID',
 product_name string COMMENT '商品名称',
 product_remark string COMMENT '商品描述',
 product_cnt INT  COMMENT '购买商品数量',
 product_price DECIMAL(5,1)  COMMENT '购买商品单价',
 weighing_cost DECIMAL(2,1)  COMMENT '商品加权价格',
 district_money DECIMAL(4,1)  COMMENT '优惠金额',
 is_activity bigint COMMENT '1:参加活动|0：没有参加活动',
 order_detail_ctime bigint COMMENT '下单时间'
) partitioned by (bdp_day string)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
location '/data/nshop/ods/ods_nshop_02_order_detail1/';



create external table if not exists 1902_gxj_ods_nshop.ods_nshop_02_orders1 (
 order_id string COMMENT '订单ID(时间+商品ID+4位随机)',
 customer_id string COMMENT '下单用户ID',
 order_status TINYINT COMMENT '订单状态',
 customer_ip string COMMENT '下单用户IP',
 user_longitude string COMMENT '用户地理：经度',
 user_latitude string COMMENT '用户地理：纬度',
 user_areacode string COMMENT '用户所在地区',
 consignee_name string COMMENT '收货人',
 consignee_mobile string COMMENT '收货人电话',
 consignee_zipcode string COMMENT '收货人地址',
 pay_type string COMMENT '支付类型：线上支付 10 网上银行 11 微信 12 支付宝 | 线下支付(货到付款) 20 ',
 pay_code string COMMENT '支付对应唯一标识，如微信号、支付宝号',
 pay_nettype string COMMENT '支付网络方式：0 wifi | 1 4g | 2 3g |3 线下支付',
 district_money DECIMAL(8,1) COMMENT '优惠金额',
 shipping_money DECIMAL(8,1)  COMMENT '运费金额',
 payment_money DECIMAL(10,1) COMMENT '支付金额',
 order_ctime bigint  COMMENT '创建时间',
 shipping_time bigint  COMMENT '发货时间',
 receive_time bigint  COMMENT '收货时间'
)partitioned by (bdp_day string)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
location '/data/nshop/ods/ods_nshop_02_orders1/';

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
location '/data/nshop/ods/release1/';
