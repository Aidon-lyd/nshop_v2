--������Ϣ
sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table category \
--hive-import \
--hive-overwrite \
--hive-table 1902_wzh_dim_nshop.dim_pub_category \
-m 1

--������Ϣ
sqoop import  \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table supplier \
--hive-import \
--hive-overwrite \
--hive-table 1902_dim_nshop.dim_pub_supplier \
-m 1

--��Ʒ��Ϣ
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table product \
--hive-import \
--hive-overwrite \
--hive-table 1902_wzh_dim_nshop.dim_pub_product \
-m 10

--ҳ�沼��
sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table page_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_wzh_dim_nshop.dim_pub_page \
-m 10


--����ά��
sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table area_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_wzh_dim_nshop.dim_pub_area \
-m 1

--ʱ��
sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table date_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_wzh_dim_nshop.dim_pub_date \
-m 1

--������Ϣ
sqoop import \
--connect jdbc:mysql://node245:3306/nshop \
--username root \
--password 12345678 \
--table comm_dim \
--hive-import \
--hive-overwrite \
--hive-table 1902_wzh_dim_nshop.dim_pub_comm \
-m 10