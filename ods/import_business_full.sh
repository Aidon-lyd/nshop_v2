sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table customer \
--hive-import \
--hive-overwrite \
--hive-table 1902_tzg_ods_nshop.ods_nshop_02_customer \
-m 10

sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table customer_consignee \
--hive-import \
--hive-overwrite \
--hive-table 1902_tzg_ods_nshop.ods_nshop_02_customer_consignee \
-m 10
