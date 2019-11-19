-- 分类信息
sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table category \
--hive-import \
--hive-overwrite \
--hive-table 1902_wm_dim_nshop.dim_pub_category \
-m 1
