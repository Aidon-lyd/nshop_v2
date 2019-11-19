hdfs dfs -rmr /data/liupei
hdfs dfs -rmr /data/liupei_datax
# dim_create_table_full.sql  ods_create_table_full.sql  ods_create_table_incr.sql
hive -f dim_create_table_full.sql
hive -f ods_create_table_full.sql
hive -f ods_create_table_incr.sql
