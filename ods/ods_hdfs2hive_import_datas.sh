for dir in `ls ./customer_release`
do
hdfs dfs -put "./customer_release/$dir"  /data/liupei/nshop/ods/release/
hive -e "alter table 1902_lp_ods_nshop.ods_01_releasedatas add partition ($dir);"
done

for dir in `ls ./user_action_log2/`
do
hdfs dfs -put "./user_action_log2/$dir"  /data/liupei/nshop/ods/user_action_log/
hive -e "alter table 1902_lp_ods_nshop.ods_nshop_01_useractlog add partition ($dir);"
done
