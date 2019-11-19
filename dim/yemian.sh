sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table page_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_wm_dim_nshop.dim_pub_page \
-m 10
