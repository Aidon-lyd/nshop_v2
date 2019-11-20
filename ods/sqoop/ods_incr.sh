### bdp_day=`date -d "-1 day" +"%Y%m%d"` 
### 原本应写昨天日期但此时因为没有昨天数据的原因自行设置时间范围
### 有关增加分区的问题可以单独的程序处理也可以在处理sqoop导入时如下处理
bdp_day=20191102

sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/1902_zx/nshop/ods/ods_nshop_02_orders/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM orders WHERE FROM_UNIXTIME(order_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 
hive -e "alter table 1902_zx_nshop_ods.ods_nshop_02_orders add partition(bdp_day='${bdp_day}')"



sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/1902_zx/nshop/ods/ods_nshop_02_order_detail/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM order_detail WHERE FROM_UNIXTIME(order_detail_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 
hive -e "alter table 1902_zx_nshop_ods.ods_nshop_02_order_detail add partition(bdp_day='${bdp_day}')"



sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://10.0.88.245:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/1902_zx/nshop/ods/ods_nshop_02_orders_pay_records/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM orders_pay_records WHERE FROM_UNIXTIME(pay_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS'
 hive -e "alter table 1902_zx_nshop_ods.ods_nshop_02_orders_pay_records add partition(bdp_day='${bdp_day}')"


