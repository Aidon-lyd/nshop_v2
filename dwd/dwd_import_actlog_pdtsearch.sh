#!/bin/bash
#yesterday=`date -d "-1 day" +"%Y%m%d"`
yesterday=20191109
action=05

/home/framework/hive-2.1.1/bin/hive \
--hiveconf action=$action \
--hiveconf bdp_day=$yesterday \
-f dwd_import_actlog_pdtsearch.sql
