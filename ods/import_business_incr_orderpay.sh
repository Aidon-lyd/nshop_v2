--bdp_day=`date -d "-1 day" +"%Y%m%d"`  
-- 原本应写昨天日期但此时因为没有昨天数据的原因自行设置时间范围
--有关增加分区的问题可以单独的程序处理也可以在处理sqoop导入时如下处理
bdp_day=20191102

/home/framework/sqoop-1.4.7/bin/sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/nshop/ods/ods_nshop_02_orders_pay_records/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM orders_pay_records WHERE FROM_UNIXTIME(pay_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 


/home/framework/hive-2.1.1/bin/hive -e "alter table 1902_lp_ods_nshop.ods_nshop_02_orders_pay_records add partition(bdp_day='${bdp_day}')"
