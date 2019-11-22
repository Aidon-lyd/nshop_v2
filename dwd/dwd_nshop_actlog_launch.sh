#!/bin/bash
yesterday=`date -d "-1 day" +"%Y%m%d"`
action=02

/home/framework/hive-2.1.1/bin/hive \
-hiveconf action=$action \
-hiveconf bdp_day=$yesterday \ 
-f dwd_nshop_actlog_launch.hql
