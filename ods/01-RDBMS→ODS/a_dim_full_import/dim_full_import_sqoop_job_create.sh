#!/bin/bash
###################################
##1、该脚本是创建sqoop的job脚本，原则上只需要执行一次即可，以后不需要执行该脚本，只需要执行sqoop job -exec "jobname"。
##2、该文件中的全部为非增量表的sqoop的job语句----（维度表sqoop全量导入job的脚本创建）。
##3、如果需要重新运行，则运行方式:  ./dim_full_import_sqoop_job_create.sh
################################

#1. 分类信息：商品分类表  从MySQL的 nshop.category  到Hive的 1902_zrb_nshop_dim.dim_pub_category
sqoop import \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table category \
--hive-import \
--hive-overwrite \
--hive-table 1902_zrb_nshop_dim.dim_pub_category \
-m 1

#2. 店铺信息：供应商信息表  从MySQL的 nshop.supplier  到Hive的 1902_zrb_nshop_dim.dim_pub_supplier
sqoop import  \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table supplier \
--hive-import \
--hive-overwrite \
--hive-table 1902_zrb_nshop_dim.dim_pub_supplier \
-m 1

#3. 产品信息：商品信息表  从MySQL的 nshop.product  到Hive的 1902_zrb_nshop_dim.dim_pub_product 
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table product \
--hive-import \
--hive-overwrite \
--hive-table 1902_zrb_nshop_dim.dim_pub_product \
-m 10

#4. 页面布局：页面布局表  从MySQL的 nshop.page_dim  到Hive的 1902_zrb_nshop_dim.dim_pub_page 
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table page_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_zrb_nshop_dim.dim_pub_page \
-m 10

#5. 地区维度：地域字典表  从MySQL的 nshop.area_dim  到Hive的 1902_zrb_nshop_dim.dim_pub_area
sqoop import \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table area_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_zrb_nshop_dim.dim_pub_area \
-m 1

#6. 时间：时间字典表 从MySQL的 nshop.date_dim 到Hive的 1902_zrb_nshop_dim.dim_pub_date
sqoop import \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table date_dim \
--hive-import \
--hive-overwrite \
--hive-table dim_nshop.dim_pub_date \
-m 1

#7. 常用信息：通用字典表 从MySQL的 nshop.comm_dim 到Hive的 1902_zrb_nshop_dim.dim_pub_comm
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table comm_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_zrb_nshop_dim.dim_pub_comm \
-m 10
