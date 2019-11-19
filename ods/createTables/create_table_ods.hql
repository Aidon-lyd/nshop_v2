use 1902_wzh_nshop_ods

###�û�������Ϣ��
create table if not exists ods_nshop_02_customer (
 customer_id string COMMENT '�û�ID',
 customer_login string COMMENT '�û���¼��',
 customer_nickname string COMMENT '�û���(�ǳ�)',
 customer_name string COMMENT '�û���ʵ����',
 customer_pass string COMMENT '�û�����',
 customer_mobile string COMMENT '�û��ֻ�',
 customer_idcard string COMMENT '���֤',
 customer_gender TINYINT COMMENT '�Ա�1�� 0Ů',
 customer_birthday string COMMENT '��������',
 customer_age TINYINT COMMENT '�Ա�1�� 0Ů',
 customer_age_range string COMMENT '�����(01->[0,17],02->[18-45],03->[46-60],04->[60-100])',
 customer_email string COMMENT '�û�����',
 customer_natives string COMMENT '���ڵ���',
 customer_ctime bigint COMMENT '����ʱ��',
 customer_utime bigint COMMENT '�޸�ʱ��',
 customer_device_num string COMMENT '�û��ֻ��豸��'
)
location '/data/nshop/ods/ods_nshop_02_customer/';



#### �ջ���ַ�����
create table if not exists ods_nshop_02_customer_consignee (
 consignee_id string COMMENT '�ջ���ַID',
 customer_id string COMMENT '�û�ID',
 consignee_name string COMMENT '�ջ���',
 consignee_mobile string COMMENT '�ջ��˵绰',
 consignee_zipcode string COMMENT '�ջ��˵���',
 consignee_addr string COMMENT '�ջ�����ϸ��ַ',
 consignee_tag string COMMENT '��ǩ��1�� 2��˾ 3ѧУ',
 ctime bigint COMMENT '����ʱ��'
)
location '/data/nshop/ods/ods_nshop_02_customer_consignee/';




#### ������
create table if not exists ods_nshop_02_orders (
 order_id string COMMENT '����ID(ʱ��+��ƷID+4λ���)',
 customer_id string COMMENT '�µ��û�ID',
 order_status TINYINT COMMENT '����״̬',
 customer_ip string COMMENT '�µ��û�IP',
 user_longitude string COMMENT '�û���������',
 user_latitude string COMMENT '�û�����γ��',
 user_areacode string COMMENT '�û����ڵ���',
 consignee_name string COMMENT '�ջ���',
 consignee_mobile string COMMENT '�ջ��˵绰',
 consignee_zipcode string COMMENT '�ջ��˵�ַ',
 pay_type string COMMENT '֧�����ͣ�����֧�� 10 �������� 11 ΢�� 12 ֧���� | ����֧��(��������) 20 ',
 pay_code string COMMENT '֧����ӦΨһ��ʶ����΢�źš�֧������',
 pay_nettype string COMMENT '֧�����緽ʽ��0 wifi | 1 4g | 2 3g |3 ����֧��',
 district_money DECIMAL(8,1) COMMENT '�Żݽ��',
 shipping_money DECIMAL(8,1)  COMMENT '�˷ѽ��',
 payment_money DECIMAL(10,1) COMMENT '֧�����',
 order_ctime bigint  COMMENT '����ʱ��',
 shipping_time bigint  COMMENT '����ʱ��',
 receive_time bigint  COMMENT '�ջ�ʱ��'
) partitioned by (bdp_day string)
location '/data/nshop/ods/ods_nshop_02_orders/';


#### ���������
create table if not exists ods_nshop_02_order_detail(
 order_detail_id string COMMENT '���������ID',
 order_id string COMMENT '������ID',
 product_id string COMMENT '������ƷID',
 product_name string COMMENT '��Ʒ����',
 product_remark string COMMENT '��Ʒ����',
 product_cnt INT  COMMENT '������Ʒ����',
 product_price DECIMAL(5,1)  COMMENT '������Ʒ����',
 weighing_cost DECIMAL(2,1)  COMMENT '��Ʒ��Ȩ�۸�',
 district_money DECIMAL(4,1)  COMMENT '�Żݽ��',
 is_activity bigint COMMENT '1:�μӻ|0��û�вμӻ',
 order_detail_ctime bigint COMMENT '�µ�ʱ��'
)partitioned by (bdp_day string)
location '/data/nshop/ods/ods_nshop_02_order_detail/';


#### ����֧����¼��
create table if not exists ods_nshop_02_orders_pay_records (
 pay_id string COMMENT '֧����¼ID',
 order_id string COMMENT '����ID',
 customer_id string COMMENT '�û�ID',
 pay_status string COMMENT '֧��״̬��0 ֧��ʧ��| 1 ֧���ɹ�',
 pay_type string COMMENT '֧�����ͣ�����֧�� 10 �������� 11 ΢�� 12 ֧���� | ����֧��(��������) 20 ',
 pay_code string COMMENT '֧����ӦΨһ��ʶ����΢�źš�֧������',
 pay_nettype string COMMENT '֧�����緽ʽ��1 wifi | 2 4g | 3 3g |4 ����֧��',
 pay_amount double COMMENT '֧�����',
 pay_ctime bigint  COMMENT '����ʱ��'
)partitioned by (bdp_day string)
location '/data/nshop/ods/ods_nshop_02_orders_pay_records/';

