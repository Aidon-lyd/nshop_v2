###################################
##将nshop的mysql业务库全量导入到ods层。
##该脚本每天执行一次
###################################

#用户基本信息表
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table customer \
--hive-import \
--hive-overwrite \
--hive-table g11_ods_nshop.g11_ods_nshop_02_customer \
-m 1


#收货地址管理表
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table customer_consignee \
--hive-import \
--hive-overwrite \
--hive-table g11_ods_nshop.g11_ods_nshop_02_customer_consignee \
-m 10


#维度
#分类信息
sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table category \
--hive-import \
--hive-overwrite \
--hive-table g11_dim_nshop.dim_pub_category \
-m 1

#店铺信息
sqoop import  \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table supplier \
--hive-import \
--hive-overwrite \
--hive-table g11_dim_nshop.dim_pub_supplier \
-m 1

#产品信息
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table product \
--hive-import \
--hive-overwrite \
--hive-table g11_dim_nshop.dim_pub_product \
-m 10

#页面布局
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table page_dim \
--hive-import \
--hive-overwrite \
--hive-table g11_dim_nshop.dim_pub_page \
-m 10


#地区维度
sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table area_dim \
--hive-import \
--hive-overwrite \
--hive-table g11_dim_nshop.dim_pub_area \
-m 1

#时间
sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table date_dim \
--hive-import \
--hive-overwrite \
--hive-table g11_dim_nshop.dim_pub_date \
-m 1

#常用信息
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table comm_dim \
--hive-import \
--hive-overwrite \
--hive-table g11_dim_nshop.dim_pub_comm \
-m 10