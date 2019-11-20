use 1902_zx_nshop_dim;

--商品分类表
create table if not exists dim_pub_category (
 category_code string COMMENT '分类编码',
 category_name string COMMENT '分类名称',
 category_parent_id string COMMENT '父分类ID',
 category_status TINYINT  COMMENT '分类状态：0禁止，1启用',
 category_utime bigint COMMENT  '最后修改时间'
)
location '/data/1902_zx/nshop/dim/dim_pub_category/';

-- 供应商信息表

create table if not exists  dim_pub_supplier(
 supplier_code string COMMENT '供应商编码',
 supplier_name string COMMENT '供应商名称',
 supplier_type TINYINT  COMMENT '供应商类型：1.自营，2.官方 3其他',
 supplier_status TINYINT  COMMENT '状态：0禁止，1启用',
 supplier_utime bigint  COMMENT  '最后修改时间'
)
location '/data/1902_zx/nshop/dim/dim_pub_supplier/';

-- 商品信息表
create table if not exists dim_pub_product(
  product_code string COMMENT '商品ID(分类编码+供应商编码+编号)',
  product_name string COMMENT '商品名称',
  product_remark string  COMMENT '商品描述',
  category_code string COMMENT '分类ID',
  supplier_code string COMMENT '商品的供应商编码', 
  product_price DECIMAL COMMENT '商品销售价格',
  product_weighing_cost DECIMAL(2,1)  COMMENT '商品加权价格',
  product_publish_status TINYINT  COMMENT '上下架状态：0下架 1上架',
  product_audit_status TINYINT  COMMENT '审核状态：0未审核，1已审核',
  product_bar_code string COMMENT '国条码',
  product_weight FLOAT  COMMENT '商品重量',
  product_length FLOAT  COMMENT '商品长度',
  product_height FLOAT  COMMENT '商品高度',
  product_width FLOAT  COMMENT '商品宽度',
  product_colors SMALLINT  COMMENT '0:白|1:赤|2:红|3:黄|4:绿|5:青|6:蓝|7:紫|8:黑|9:彩色',
  product_date string COMMENT '生产日期',
  product_shelf_life bigint  COMMENT '商品有效期',
  product_ctime bigint  COMMENT '商品录入时间',
  product_utime bigint  COMMENT '最后修改时间'
)
location '/data/1902_zx/nshop/dim/dim_pub_product/';




-- 页面布局

create table if not exists dim_pub_page (
 page_code string COMMENT '页面编码',
 page_remark string COMMENT '页面描述',
 page_type string COMMENT '页面类型(1:导航页 2：分类页 3：店铺页 4：产品页)',
 page_target string COMMENT '页面对应实体编号(如产品、店铺)',
 page_ctime bigint COMMENT '创建时间'
)
location '/data/1902_zx/nshop/dim/dim_pub_page/';


-- 地域表
create table if not exists dim_pub_area (
 region_code string COMMENT '地区编码 如110105  | 130406 ',
 region_code_desc string COMMENT '地区编码 如朝阳区 | 峰峰矿区',
 region_city string COMMENT '地区编码 如1101 北京市朝阳区 | 1304 邯郸',
 region_city_desc string COMMENT '地区编码 如1101 | 1304 邯郸市',
 region_province string COMMENT '地区编码 如11 北京市 | 13 河北省',
 region_province_desc string COMMENT '地区编码 如 北京市 | 河北'
)
location '/data/1902_zx/nshop/dim/dim_pub_area/';




-- 日期维度表


create table if not exists dim_pub_date (
date_day string COMMENT '日期：yyyyMMdd 如20190520',
date_day_desc string COMMENT '日期格式：yyyy年MM月dd日 如2019年05月20日',
date_day_month string COMMENT '日期：20 本月第几天 如2019年5月20日为5月第20天',
date_day_year string COMMENT '日期：139 本年第几天 如2019年5月20日为139天',
date_day_en string COMMENT '日期：monday 星期几',
date_week string COMMENT '周：本月第几周 4 如 20190520为本月第4周',
date_week_desc string COMMENT '周：本月第几周 如 20190504',
date_month string COMMENT '月: 5 如 20190520为本年5月',
date_month_en string COMMENT '月: may ',
date_month_desc string COMMENT '月：如 201905',
date_quarter string COMMENT '季度:2',
date_quarter_en string COMMENT '季度:Q2',
date_quarter_desc string COMMENT '季度:2019Q2 如 20190520为2019Q2',
date_year string COMMENT '年:2019'
)
location '/data/1902_zx/nshop/dim/dim_pub_date/';



-- 通用维表


create table if not exists dim_pub_comm (
  dim_type string COMMENT '字典类型',
  dim_code string COMMENT '字典编码',
  dim_remark string COMMENT '字典描述',
  dim_ext1 string COMMENT '扩展1',
  dim_ext2 string COMMENT '扩展2',
  dim_ext3 string COMMENT '扩展3',
  dim_ext4 string COMMENT '扩展4'
)
location '/data/1902_zx/nshop/dim/dim_pub_comm/';
