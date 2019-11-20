###################################
##将nshop的mysql业务库增量导入到ods层。
##该脚本每天执行一次
###################################
bdp_day=20191102
tablename='order_'+bdp_day

#
/home/framework/sqoop-1.4.7/bin/sqoop import \
 --connect jdbc:mysql://node242:3306/nshop \
 --username root \
 --password 12345678 \
 --hive-import \
 --hive-overwrite \
 --hive-partition-key 'bdp_day' \
 --hive-partition-value '20190919' \
 --target-dir /data/nshop/ods/ods_02_orders_incr2_tmp \
 --hive-table g11_ods_nshop.ods_02_orders_incr2 \
 --num-mappers 1 \
 --query 'SELECT * FROM orders WHERE FROM_UNIXTIME(order_ctime/1000,"%Y%m%d")=20190901 and $CONDITIONS;'

 #
/home/framework/sqoop-1.4.7/bin/sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node242:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/nshop/ods/g11_ods_nshop_02_orders/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM orders WHERE FROM_UNIXTIME(order_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 

/home/framework/hive-2.1.1/bin/hive -e "alter table g11_ods_nshop.g11_ods_nshop_02_orders add partition(bdp_day='${bdp_day}')"

#
/home/framework/sqoop-1.4.7/bin/sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node242:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/nshop/ods/g11_ods_nshop_02_order_detail/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM order_detail WHERE FROM_UNIXTIME(order_detail_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 

/home/framework/hive-2.1.1/bin/hive -e "alter table g11_ods_nshop.g11_ods_nshop_02_order_detail add partition(bdp_day='${bdp_day}')"

#flume采集的
/home/framework/hive-2.1.1/bin/hive -e "alter table g11_ods_nshop.ods_01_releasedatas add partition(bdp_day='${bdp_day}')"