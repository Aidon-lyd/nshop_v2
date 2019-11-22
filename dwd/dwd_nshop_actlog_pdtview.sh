#!/bin/bash
yesterday=`date -d "-1 day" +"%Y%m%d"`

/home/framework/hive-2.1.1/bin/hive \
--hiveconf bdp_day=$yesterday \
-f dwd_nshop_actlog_pdtview.hql
