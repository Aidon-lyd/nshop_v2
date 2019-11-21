# 执行具体操作命令
# 创建表
hive -f ./a_create_user_log_tb.sql
# 加载数据
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191101');"
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191102');"
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191103');"
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191104');"
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191105');"
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191106');"
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191107');"
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191108');"
hive -e "alter table 1902_g1_ods_nsshop.ods_nshop_01_useractlog add partition (bdp_day='20191109');"