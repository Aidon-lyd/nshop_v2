#!/bin/bash
###################################

##1、该脚本是创建sqoop的job脚本，原则上只需要执行一次即可，以后不需要执行该脚本，只需要执行sqoop job -exec "jobname"。
##2、该文件中的全部为非增量表的sqoop的job语句----（业务表sqoop全量导入job的脚本创建）。
##3、如果需要重新运行，则运行方式:  ./ods_full_import_sqoop_job_create.sh
################################

#1. 用户基本信息表  从MySQL的 nshop.customer  到Hive的 1902_zrb_nshop_ods.ods_nshop_02_customer
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop \
--username root \
--password 12345678 \
--table customer \
--hive-import \
--hive-overwrite \
--hive-table 1902_zrb_nshop_ods.ods_nshop_02_customer \
-m 10

#1. 收货地址管理表  从MySQL的 nshop.customer_consignee  到Hive的 1902_zrb_nshop_ods.ods_nshop_02_customer_consignee
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table customer_consignee \
--hive-import \
--hive-overwrite \
--hive-table 1902_zrb_nshop_ods.ods_nshop_02_customer_consignee \
-m 10
