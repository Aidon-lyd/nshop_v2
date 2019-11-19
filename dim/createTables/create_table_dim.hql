use 1902_wzh_nshop_dim

###��Ʒ�����
create table if not exists dim_pub_category (
 category_code string COMMENT '�������',
 category_name string COMMENT '��������',
 category_parent_id string COMMENT '������ID',
 category_status TINYINT  COMMENT '����״̬��0��ֹ��1����',
 category_utime bigint COMMENT  '����޸�ʱ��'
)
location '/data/nshop/dim/dim_pub_category/';




#### ��Ӧ����Ϣ��
create table if not exists  dim_pub_supplier(
 supplier_code string COMMENT '��Ӧ�̱���',
 supplier_name string COMMENT '��Ӧ������',
 supplier_type TINYINT  COMMENT '��Ӧ�����ͣ�1.��Ӫ��2.�ٷ� 3����',
 supplier_status TINYINT  COMMENT '״̬��0��ֹ��1����',
 supplier_utime bigint  COMMENT  '����޸�ʱ��'
)
location '/data/nshop/dim/dim_pub_supplier/';




#### ��Ʒ��Ϣ��
create table if not exists dim_pub_product(
  product_code string COMMENT '��ƷID(�������+��Ӧ�̱���+���)',
  product_name string COMMENT '��Ʒ����',
  product_remark string  COMMENT '��Ʒ����',
  category_code string COMMENT '����ID',
  supplier_code string COMMENT '��Ʒ�Ĺ�Ӧ�̱���', 
  product_price DECIMAL COMMENT '��Ʒ���ۼ۸�',
  product_weighing_cost DECIMAL(2,1)  COMMENT '��Ʒ��Ȩ�۸�',
  product_publish_status TINYINT  COMMENT '���¼�״̬��0�¼� 1�ϼ�',
  product_audit_status TINYINT  COMMENT '���״̬��0δ��ˣ�1�����',
  product_bar_code string COMMENT '������',
  product_weight FLOAT  COMMENT '��Ʒ����',
  product_length FLOAT  COMMENT '��Ʒ����',
  product_height FLOAT  COMMENT '��Ʒ�߶�',
  product_width FLOAT  COMMENT '��Ʒ���',
  product_colors SMALLINT  COMMENT '0:��|1:��|2:��|3:��|4:��|5:��|6:��|7:��|8:��|9:��ɫ',
  product_date string COMMENT '��������',
  product_shelf_life bigint  COMMENT '��Ʒ��Ч��',
  product_ctime bigint  COMMENT '��Ʒ¼��ʱ��',
  product_utime bigint  COMMENT '����޸�ʱ��'
)
location '/data/nshop/dim/dim_pub_product/';




#### ҳ�沼��
create table if not exists dim_pub_page (
 page_code string COMMENT 'ҳ�����',
 page_remark string COMMENT 'ҳ������',
 page_type string COMMENT 'ҳ������(1:����ҳ 2������ҳ 3������ҳ 4����Ʒҳ)',
 page_target string COMMENT 'ҳ���Ӧʵ����(���Ʒ������)',
 page_ctime bigint COMMENT '����ʱ��'
)
location '/data/nshop/dim/dim_pub_page/';




#### �����
create table if not exists dim_pub_area (
 region_code string COMMENT '�������� ��110105  | 130406 ',
 region_code_desc string COMMENT '�������� �糯���� | ������',
 region_city string COMMENT '�������� ��1101 �����г����� | 1304 ����',
 region_city_desc string COMMENT '�������� ��1101 | 1304 ������',
 region_province string COMMENT '�������� ��11 ������ | 13 �ӱ�ʡ',
 region_province_desc string COMMENT '�������� �� ������ | �ӱ�'
)
location '/data/nshop/dim/dim_pub_area/';




#### ����ά�ȱ�
create table if not exists dim_pub_date (
date_day string COMMENT '���ڣ�yyyyMMdd ��20190520',
date_day_desc string COMMENT '���ڸ�ʽ��yyyy��MM��dd�� ��2019��05��20��',
date_day_month string COMMENT '���ڣ�20 ���µڼ��� ��2019��5��20��Ϊ5�µ�20��',
date_day_year string COMMENT '���ڣ�139 ����ڼ��� ��2019��5��20��Ϊ139��',
date_day_en string COMMENT '���ڣ�monday ���ڼ�',
date_week string COMMENT '�ܣ����µڼ��� 4 �� 20190520Ϊ���µ�4��',
date_week_desc string COMMENT '�ܣ����µڼ��� �� 20190504',
date_month string COMMENT '��: 5 �� 20190520Ϊ����5��',
date_month_en string COMMENT '��: may ',
date_month_desc string COMMENT '�£��� 201905',
date_quarter string COMMENT '����:2',
date_quarter_en string COMMENT '����:Q2',
date_quarter_desc string COMMENT '����:2019Q2 �� 20190520Ϊ2019Q2',
date_year string COMMENT '��:2019'
)
location '/data/nshop/dim/dim_pub_date/';




#### ͨ��ά��
create table if not exists dim_pub_comm (
  dim_type string COMMENT '�ֵ�����',
  dim_code string COMMENT '�ֵ����',
  dim_remark string COMMENT '�ֵ�����',
  dim_ext1 string COMMENT '��չ1',
  dim_ext2 string COMMENT '��չ2',
  dim_ext3 string COMMENT '��չ3',
  dim_ext4 string COMMENT '��չ4'
)
location '/data/nshop/dim/dim_pub_comm/';
