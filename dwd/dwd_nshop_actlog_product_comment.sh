#!/bin/bash
yesterday=`date -d "-1 day" +"%Y%m%d"`
action=05
event_type=02
target_action=01

/home/framework/hive-2.1.1/bin/hive \
--hiveconf action=$action \
--hiveconf bdp_day=$yesterday \ 
--hiveconf event_type=$event_type \ 
--hiveconf target_action=$target_action \
-S \
-f dwd_nshop_actlog_product_comment.hql
