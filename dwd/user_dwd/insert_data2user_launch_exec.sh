#!/bin/bash
#yesterday=`date -d "-1 day" +"%Y%m%d"`
action=02
yesterday=20191102

/home/framework/hive-2.1.1/bin/hive \
-hiveconf action=$action \
-hiveconf bdp_day=$yesterday \
-f insert_data2user_launch.sql
