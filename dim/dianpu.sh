-- 店铺信息
sqoop import  \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table supplier \
--hive-import \
--hive-overwrite \
--hive-table 1902_wm_dim_nshop.dim_pub_supplier \
-m 1
