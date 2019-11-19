#分类信息
sqoop import \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table category \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_dim_nshop.dim_pub_category1 \
-m 1

#店铺信息
sqoop import  \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table supplier \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_dim_nshop.dim_pub_supplier1 \
-m 1

#产品信息
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table product \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_dim_nshop.dim_pub_product1 \
-m 10

#页面布局
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table page_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_dim_nshop.dim_pub_page1 \
-m 10


#地区维度
sqoop import \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table area_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_dim_nshop.dim_pub_area1 \
-m 1

#时间
sqoop import \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table date_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_dim_nshop.dim_pub_date1 \
-m 1

#常用信息
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table comm_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_gxj_dim_nshop.dim_pub_comm1 \
-m 10
