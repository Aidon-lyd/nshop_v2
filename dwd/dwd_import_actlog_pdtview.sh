#!/bin/bash
#yesterday=`date -d "-1 day" +"%Y%m%d"`

yesterday=20191109

/home/framework/hive-2.1.1/bin/hive \
--hiveconf bdp_day=$yesterday \
-f dwd_import_actlog_pdtview.sql
