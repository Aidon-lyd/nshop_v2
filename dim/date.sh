sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table date_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_wm_dim_nshop.dim_pub_date \
-m 1
