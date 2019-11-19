--bdp_day=`date -d "-1 day" +"%Y%m%d"`  
-- ԭ��Ӧд�������ڵ���ʱ��Ϊû���������ݵ�ԭ����������ʱ�䷶Χ
--�й����ӷ�����������Ե����ĳ�����Ҳ�����ڴ���sqoop����ʱ���´���
bdp_day=20191118
tablename='order_'+bdp_day

/home/framework/sqoop-1.4.7/bin/sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop?characterEncoding=UTF-8 \
--username root \
--password 12345678 \
--delete-target-dir \
--target-dir /data/liupei/nshop/ods/ods_nshop_02_orders/bdp_day=${bdp_day} \
--num-mappers 1 \
--query 'SELECT * FROM orders WHERE FROM_UNIXTIME(order_ctime/1000,"%Y%m%d")='${bdp_day}' and $CONDITIONS' 


/home/framework/hive-2.1.1/bin/hive -e "alter table 1902_wzh_ods_nshop.ods_nshop_02_orders add partition(bdp_day='${bdp_day}')"