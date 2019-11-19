#bdp_day=`date -d "-1 day" +"%Y%m%d"`  
#原本应写昨天日期但此时因为没有昨天数据的原因自行设置时间范围
#有关增加分区的问题可以单独的程序处理也可以在处理sqoop导入时如下处理
bdp_day=20191102
tablename='order_'+bdp_day

/home/framework/sqoop-1.4.7/bin/sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /1902_g1_nsshop/ods/ods_nshop_02_orders/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM orders WHERE FROM_UNIXTIME(order_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 


/home/framework/hive-2.1.1/bin/hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_02_orders add partition(bdp_day='${bdp_day}')"
