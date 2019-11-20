增量导入
订单
1.内部表_单分区模式下场景处理
create table if not exists 1902_zs_ods_nshop.ods_02_orders_incr2 (
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
location '/data/zhoushuai/ods/ods_02_orders_incr2/'

编写脚本

./sqoop import 
 --connect jdbc:mysql://node242:3306/nshop \
 --username root \
 --password 12345678 \
 --hive-import \
 --hive-overwrite \
 --hive-partition-key 'bdp_day' \
 --hive-partition-value '20190919' \
 --target-dir /data/nshop/ods/ods_02_orders_incr2_tmp \
 --hive-table ods_nshop.ods_02_orders_incr2 \
 --num-mappers 1 \
 --query 'SELECT * FROM orders WHERE FROM_UNIXTIME(order_ctime/1000,"%Y%m%d")=20190901 and $CONDITIONS;'


 第二种 利用外部表 _多分区进行场景进行处理
 create external table if not exists 1902_zs_ods_nshop.ods_nshop_02_orders (
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
location '/data/zhoushuai/ods/ods_nshop_02_orders/'


订单详情表

create external table if not exists 1902_zs_ods_nshop.ods_nshop_02_order_detail(
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
location '/data/zhoushuai/ods/ods_nshop_02_order_detail/'

--bdp_day=`date -d "-1 day" +"%Y%m%d"`  
-- 原本应写昨天日期但此时因为没有昨天数据的原因自行设置时间范围
--有关增加分区的问题可以单独的程序处理也可以在处理sqoop导入时如下处理
bdp_day=20191102

/home/framework/sqoop-1.4.7/bin/sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node242:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/zhoushuai/ods/ods_nshop_02_order_detail/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM order_detail WHERE FROM_UNIXTIME(order_detail_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 

/home/framework/hive-2.1.1/bin/hive -e "alter table 1902_zs_ods_nshop.ods_nshop_02_order_detail add partition(bdp_day='${bdp_day}')"

-- 订单支付
create external table if not exists 1902_zs_ods_nshop.ods_nshop_02_orders_pay_records (
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
location '/data/zhoushuai/ods/ods_nshop_02_orders_pay_records/'



--bdp_day=`date -d "-1 day" +"%Y%m%d"`  
#原本应写昨天日期但此时因为没有昨天数据的原因自行设置时间范围
#有关增加分区的问题可以单独的程序处理也可以在处理sqoop导入时如下处理
bdp_day=20191102

/home/framework/sqoop-1.4.7/bin/sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node242:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/zhoushuai/ods/ods_nshop_02_orders_pay_records/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM orders_pay_records WHERE FROM_UNIXTIME(pay_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 


/home/framework/hive-2.1.1/bin/hive -e "alter table 1902_zs_ods_nshop.ods_nshop_02_orders_pay_records add partition(bdp_day='${bdp_day}')"