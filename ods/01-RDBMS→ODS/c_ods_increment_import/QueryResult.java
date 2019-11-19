// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 20:34:54 CST 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("order_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.order_id = (String)value;
      }
    });
    setters.put("customer_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.customer_id = (String)value;
      }
    });
    setters.put("order_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.order_status = (Integer)value;
      }
    });
    setters.put("customer_ip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.customer_ip = (String)value;
      }
    });
    setters.put("customer_longitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.customer_longitude = (String)value;
      }
    });
    setters.put("customer_latitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.customer_latitude = (String)value;
      }
    });
    setters.put("customer_areacode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.customer_areacode = (String)value;
      }
    });
    setters.put("consignee_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.consignee_name = (String)value;
      }
    });
    setters.put("consignee_mobile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.consignee_mobile = (String)value;
      }
    });
    setters.put("consignee_zipcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.consignee_zipcode = (String)value;
      }
    });
    setters.put("pay_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.pay_type = (String)value;
      }
    });
    setters.put("pay_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.pay_code = (String)value;
      }
    });
    setters.put("pay_nettype", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.pay_nettype = (String)value;
      }
    });
    setters.put("district_money", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.district_money = (java.math.BigDecimal)value;
      }
    });
    setters.put("shipping_money", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.shipping_money = (java.math.BigDecimal)value;
      }
    });
    setters.put("payment_money", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.payment_money = (java.math.BigDecimal)value;
      }
    });
    setters.put("order_ctime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.order_ctime = (String)value;
      }
    });
    setters.put("shipping_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.shipping_time = (Long)value;
      }
    });
    setters.put("receive_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.receive_time = (Long)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private String order_id;
  public String get_order_id() {
    return order_id;
  }
  public void set_order_id(String order_id) {
    this.order_id = order_id;
  }
  public QueryResult with_order_id(String order_id) {
    this.order_id = order_id;
    return this;
  }
  private String customer_id;
  public String get_customer_id() {
    return customer_id;
  }
  public void set_customer_id(String customer_id) {
    this.customer_id = customer_id;
  }
  public QueryResult with_customer_id(String customer_id) {
    this.customer_id = customer_id;
    return this;
  }
  private Integer order_status;
  public Integer get_order_status() {
    return order_status;
  }
  public void set_order_status(Integer order_status) {
    this.order_status = order_status;
  }
  public QueryResult with_order_status(Integer order_status) {
    this.order_status = order_status;
    return this;
  }
  private String customer_ip;
  public String get_customer_ip() {
    return customer_ip;
  }
  public void set_customer_ip(String customer_ip) {
    this.customer_ip = customer_ip;
  }
  public QueryResult with_customer_ip(String customer_ip) {
    this.customer_ip = customer_ip;
    return this;
  }
  private String customer_longitude;
  public String get_customer_longitude() {
    return customer_longitude;
  }
  public void set_customer_longitude(String customer_longitude) {
    this.customer_longitude = customer_longitude;
  }
  public QueryResult with_customer_longitude(String customer_longitude) {
    this.customer_longitude = customer_longitude;
    return this;
  }
  private String customer_latitude;
  public String get_customer_latitude() {
    return customer_latitude;
  }
  public void set_customer_latitude(String customer_latitude) {
    this.customer_latitude = customer_latitude;
  }
  public QueryResult with_customer_latitude(String customer_latitude) {
    this.customer_latitude = customer_latitude;
    return this;
  }
  private String customer_areacode;
  public String get_customer_areacode() {
    return customer_areacode;
  }
  public void set_customer_areacode(String customer_areacode) {
    this.customer_areacode = customer_areacode;
  }
  public QueryResult with_customer_areacode(String customer_areacode) {
    this.customer_areacode = customer_areacode;
    return this;
  }
  private String consignee_name;
  public String get_consignee_name() {
    return consignee_name;
  }
  public void set_consignee_name(String consignee_name) {
    this.consignee_name = consignee_name;
  }
  public QueryResult with_consignee_name(String consignee_name) {
    this.consignee_name = consignee_name;
    return this;
  }
  private String consignee_mobile;
  public String get_consignee_mobile() {
    return consignee_mobile;
  }
  public void set_consignee_mobile(String consignee_mobile) {
    this.consignee_mobile = consignee_mobile;
  }
  public QueryResult with_consignee_mobile(String consignee_mobile) {
    this.consignee_mobile = consignee_mobile;
    return this;
  }
  private String consignee_zipcode;
  public String get_consignee_zipcode() {
    return consignee_zipcode;
  }
  public void set_consignee_zipcode(String consignee_zipcode) {
    this.consignee_zipcode = consignee_zipcode;
  }
  public QueryResult with_consignee_zipcode(String consignee_zipcode) {
    this.consignee_zipcode = consignee_zipcode;
    return this;
  }
  private String pay_type;
  public String get_pay_type() {
    return pay_type;
  }
  public void set_pay_type(String pay_type) {
    this.pay_type = pay_type;
  }
  public QueryResult with_pay_type(String pay_type) {
    this.pay_type = pay_type;
    return this;
  }
  private String pay_code;
  public String get_pay_code() {
    return pay_code;
  }
  public void set_pay_code(String pay_code) {
    this.pay_code = pay_code;
  }
  public QueryResult with_pay_code(String pay_code) {
    this.pay_code = pay_code;
    return this;
  }
  private String pay_nettype;
  public String get_pay_nettype() {
    return pay_nettype;
  }
  public void set_pay_nettype(String pay_nettype) {
    this.pay_nettype = pay_nettype;
  }
  public QueryResult with_pay_nettype(String pay_nettype) {
    this.pay_nettype = pay_nettype;
    return this;
  }
  private java.math.BigDecimal district_money;
  public java.math.BigDecimal get_district_money() {
    return district_money;
  }
  public void set_district_money(java.math.BigDecimal district_money) {
    this.district_money = district_money;
  }
  public QueryResult with_district_money(java.math.BigDecimal district_money) {
    this.district_money = district_money;
    return this;
  }
  private java.math.BigDecimal shipping_money;
  public java.math.BigDecimal get_shipping_money() {
    return shipping_money;
  }
  public void set_shipping_money(java.math.BigDecimal shipping_money) {
    this.shipping_money = shipping_money;
  }
  public QueryResult with_shipping_money(java.math.BigDecimal shipping_money) {
    this.shipping_money = shipping_money;
    return this;
  }
  private java.math.BigDecimal payment_money;
  public java.math.BigDecimal get_payment_money() {
    return payment_money;
  }
  public void set_payment_money(java.math.BigDecimal payment_money) {
    this.payment_money = payment_money;
  }
  public QueryResult with_payment_money(java.math.BigDecimal payment_money) {
    this.payment_money = payment_money;
    return this;
  }
  private String order_ctime;
  public String get_order_ctime() {
    return order_ctime;
  }
  public void set_order_ctime(String order_ctime) {
    this.order_ctime = order_ctime;
  }
  public QueryResult with_order_ctime(String order_ctime) {
    this.order_ctime = order_ctime;
    return this;
  }
  private Long shipping_time;
  public Long get_shipping_time() {
    return shipping_time;
  }
  public void set_shipping_time(Long shipping_time) {
    this.shipping_time = shipping_time;
  }
  public QueryResult with_shipping_time(Long shipping_time) {
    this.shipping_time = shipping_time;
    return this;
  }
  private Long receive_time;
  public Long get_receive_time() {
    return receive_time;
  }
  public void set_receive_time(Long receive_time) {
    this.receive_time = receive_time;
  }
  public QueryResult with_receive_time(Long receive_time) {
    this.receive_time = receive_time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.order_status == null ? that.order_status == null : this.order_status.equals(that.order_status));
    equal = equal && (this.customer_ip == null ? that.customer_ip == null : this.customer_ip.equals(that.customer_ip));
    equal = equal && (this.customer_longitude == null ? that.customer_longitude == null : this.customer_longitude.equals(that.customer_longitude));
    equal = equal && (this.customer_latitude == null ? that.customer_latitude == null : this.customer_latitude.equals(that.customer_latitude));
    equal = equal && (this.customer_areacode == null ? that.customer_areacode == null : this.customer_areacode.equals(that.customer_areacode));
    equal = equal && (this.consignee_name == null ? that.consignee_name == null : this.consignee_name.equals(that.consignee_name));
    equal = equal && (this.consignee_mobile == null ? that.consignee_mobile == null : this.consignee_mobile.equals(that.consignee_mobile));
    equal = equal && (this.consignee_zipcode == null ? that.consignee_zipcode == null : this.consignee_zipcode.equals(that.consignee_zipcode));
    equal = equal && (this.pay_type == null ? that.pay_type == null : this.pay_type.equals(that.pay_type));
    equal = equal && (this.pay_code == null ? that.pay_code == null : this.pay_code.equals(that.pay_code));
    equal = equal && (this.pay_nettype == null ? that.pay_nettype == null : this.pay_nettype.equals(that.pay_nettype));
    equal = equal && (this.district_money == null ? that.district_money == null : this.district_money.equals(that.district_money));
    equal = equal && (this.shipping_money == null ? that.shipping_money == null : this.shipping_money.equals(that.shipping_money));
    equal = equal && (this.payment_money == null ? that.payment_money == null : this.payment_money.equals(that.payment_money));
    equal = equal && (this.order_ctime == null ? that.order_ctime == null : this.order_ctime.equals(that.order_ctime));
    equal = equal && (this.shipping_time == null ? that.shipping_time == null : this.shipping_time.equals(that.shipping_time));
    equal = equal && (this.receive_time == null ? that.receive_time == null : this.receive_time.equals(that.receive_time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.order_status == null ? that.order_status == null : this.order_status.equals(that.order_status));
    equal = equal && (this.customer_ip == null ? that.customer_ip == null : this.customer_ip.equals(that.customer_ip));
    equal = equal && (this.customer_longitude == null ? that.customer_longitude == null : this.customer_longitude.equals(that.customer_longitude));
    equal = equal && (this.customer_latitude == null ? that.customer_latitude == null : this.customer_latitude.equals(that.customer_latitude));
    equal = equal && (this.customer_areacode == null ? that.customer_areacode == null : this.customer_areacode.equals(that.customer_areacode));
    equal = equal && (this.consignee_name == null ? that.consignee_name == null : this.consignee_name.equals(that.consignee_name));
    equal = equal && (this.consignee_mobile == null ? that.consignee_mobile == null : this.consignee_mobile.equals(that.consignee_mobile));
    equal = equal && (this.consignee_zipcode == null ? that.consignee_zipcode == null : this.consignee_zipcode.equals(that.consignee_zipcode));
    equal = equal && (this.pay_type == null ? that.pay_type == null : this.pay_type.equals(that.pay_type));
    equal = equal && (this.pay_code == null ? that.pay_code == null : this.pay_code.equals(that.pay_code));
    equal = equal && (this.pay_nettype == null ? that.pay_nettype == null : this.pay_nettype.equals(that.pay_nettype));
    equal = equal && (this.district_money == null ? that.district_money == null : this.district_money.equals(that.district_money));
    equal = equal && (this.shipping_money == null ? that.shipping_money == null : this.shipping_money.equals(that.shipping_money));
    equal = equal && (this.payment_money == null ? that.payment_money == null : this.payment_money.equals(that.payment_money));
    equal = equal && (this.order_ctime == null ? that.order_ctime == null : this.order_ctime.equals(that.order_ctime));
    equal = equal && (this.shipping_time == null ? that.shipping_time == null : this.shipping_time.equals(that.shipping_time));
    equal = equal && (this.receive_time == null ? that.receive_time == null : this.receive_time.equals(that.receive_time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.order_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_id = JdbcWritableBridge.readString(2, __dbResults);
    this.order_status = JdbcWritableBridge.readInteger(3, __dbResults);
    this.customer_ip = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_longitude = JdbcWritableBridge.readString(5, __dbResults);
    this.customer_latitude = JdbcWritableBridge.readString(6, __dbResults);
    this.customer_areacode = JdbcWritableBridge.readString(7, __dbResults);
    this.consignee_name = JdbcWritableBridge.readString(8, __dbResults);
    this.consignee_mobile = JdbcWritableBridge.readString(9, __dbResults);
    this.consignee_zipcode = JdbcWritableBridge.readString(10, __dbResults);
    this.pay_type = JdbcWritableBridge.readString(11, __dbResults);
    this.pay_code = JdbcWritableBridge.readString(12, __dbResults);
    this.pay_nettype = JdbcWritableBridge.readString(13, __dbResults);
    this.district_money = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.shipping_money = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.payment_money = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.order_ctime = JdbcWritableBridge.readString(17, __dbResults);
    this.shipping_time = JdbcWritableBridge.readLong(18, __dbResults);
    this.receive_time = JdbcWritableBridge.readLong(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.order_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_id = JdbcWritableBridge.readString(2, __dbResults);
    this.order_status = JdbcWritableBridge.readInteger(3, __dbResults);
    this.customer_ip = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_longitude = JdbcWritableBridge.readString(5, __dbResults);
    this.customer_latitude = JdbcWritableBridge.readString(6, __dbResults);
    this.customer_areacode = JdbcWritableBridge.readString(7, __dbResults);
    this.consignee_name = JdbcWritableBridge.readString(8, __dbResults);
    this.consignee_mobile = JdbcWritableBridge.readString(9, __dbResults);
    this.consignee_zipcode = JdbcWritableBridge.readString(10, __dbResults);
    this.pay_type = JdbcWritableBridge.readString(11, __dbResults);
    this.pay_code = JdbcWritableBridge.readString(12, __dbResults);
    this.pay_nettype = JdbcWritableBridge.readString(13, __dbResults);
    this.district_money = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.shipping_money = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.payment_money = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.order_ctime = JdbcWritableBridge.readString(17, __dbResults);
    this.shipping_time = JdbcWritableBridge.readLong(18, __dbResults);
    this.receive_time = JdbcWritableBridge.readLong(19, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(order_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(order_status, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(customer_ip, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_longitude, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_latitude, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_areacode, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_name, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_mobile, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_zipcode, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pay_type, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pay_code, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pay_nettype, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(district_money, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(shipping_money, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(payment_money, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(order_ctime, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(shipping_time, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(receive_time, 19 + __off, -5, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(order_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(order_status, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(customer_ip, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_longitude, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_latitude, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_areacode, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_name, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_mobile, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_zipcode, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pay_type, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pay_code, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pay_nettype, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(district_money, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(shipping_money, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(payment_money, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(order_ctime, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(shipping_time, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(receive_time, 19 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.order_id = null;
    } else {
    this.order_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_id = null;
    } else {
    this.customer_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_status = null;
    } else {
    this.order_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.customer_ip = null;
    } else {
    this.customer_ip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_longitude = null;
    } else {
    this.customer_longitude = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_latitude = null;
    } else {
    this.customer_latitude = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_areacode = null;
    } else {
    this.customer_areacode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.consignee_name = null;
    } else {
    this.consignee_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.consignee_mobile = null;
    } else {
    this.consignee_mobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.consignee_zipcode = null;
    } else {
    this.consignee_zipcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pay_type = null;
    } else {
    this.pay_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pay_code = null;
    } else {
    this.pay_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pay_nettype = null;
    } else {
    this.pay_nettype = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.district_money = null;
    } else {
    this.district_money = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.shipping_money = null;
    } else {
    this.shipping_money = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.payment_money = null;
    } else {
    this.payment_money = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_ctime = null;
    } else {
    this.order_ctime = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.shipping_time = null;
    } else {
    this.shipping_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.receive_time = null;
    } else {
    this.receive_time = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
    }
    if (null == this.order_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_status);
    }
    if (null == this.customer_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_ip);
    }
    if (null == this.customer_longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_longitude);
    }
    if (null == this.customer_latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_latitude);
    }
    if (null == this.customer_areacode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_areacode);
    }
    if (null == this.consignee_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_name);
    }
    if (null == this.consignee_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_mobile);
    }
    if (null == this.consignee_zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_zipcode);
    }
    if (null == this.pay_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_type);
    }
    if (null == this.pay_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_code);
    }
    if (null == this.pay_nettype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_nettype);
    }
    if (null == this.district_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.district_money, __dataOut);
    }
    if (null == this.shipping_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.shipping_money, __dataOut);
    }
    if (null == this.payment_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.payment_money, __dataOut);
    }
    if (null == this.order_ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_ctime);
    }
    if (null == this.shipping_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.shipping_time);
    }
    if (null == this.receive_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.receive_time);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
    }
    if (null == this.order_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_status);
    }
    if (null == this.customer_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_ip);
    }
    if (null == this.customer_longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_longitude);
    }
    if (null == this.customer_latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_latitude);
    }
    if (null == this.customer_areacode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_areacode);
    }
    if (null == this.consignee_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_name);
    }
    if (null == this.consignee_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_mobile);
    }
    if (null == this.consignee_zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_zipcode);
    }
    if (null == this.pay_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_type);
    }
    if (null == this.pay_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_code);
    }
    if (null == this.pay_nettype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_nettype);
    }
    if (null == this.district_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.district_money, __dataOut);
    }
    if (null == this.shipping_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.shipping_money, __dataOut);
    }
    if (null == this.payment_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.payment_money, __dataOut);
    }
    if (null == this.order_ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_ctime);
    }
    if (null == this.shipping_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.shipping_time);
    }
    if (null == this.receive_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.receive_time);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_status==null?"null":"" + order_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_ip==null?"null":customer_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_longitude==null?"null":customer_longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_latitude==null?"null":customer_latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_areacode==null?"null":customer_areacode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_name==null?"null":consignee_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_mobile==null?"null":consignee_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_zipcode==null?"null":consignee_zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_type==null?"null":pay_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_code==null?"null":pay_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_nettype==null?"null":pay_nettype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(district_money==null?"null":district_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shipping_money==null?"null":shipping_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_money==null?"null":payment_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_ctime==null?"null":order_ctime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shipping_time==null?"null":"" + shipping_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(receive_time==null?"null":"" + receive_time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_status==null?"null":"" + order_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_ip==null?"null":customer_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_longitude==null?"null":customer_longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_latitude==null?"null":customer_latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_areacode==null?"null":customer_areacode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_name==null?"null":consignee_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_mobile==null?"null":consignee_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_zipcode==null?"null":consignee_zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_type==null?"null":pay_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_code==null?"null":pay_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_nettype==null?"null":pay_nettype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(district_money==null?"null":district_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shipping_money==null?"null":shipping_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_money==null?"null":payment_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_ctime==null?"null":order_ctime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shipping_time==null?"null":"" + shipping_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(receive_time==null?"null":"" + receive_time, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.order_id = null; } else {
      this.order_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_id = null; } else {
      this.customer_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_status = null; } else {
      this.order_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_ip = null; } else {
      this.customer_ip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_longitude = null; } else {
      this.customer_longitude = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_latitude = null; } else {
      this.customer_latitude = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_areacode = null; } else {
      this.customer_areacode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.consignee_name = null; } else {
      this.consignee_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.consignee_mobile = null; } else {
      this.consignee_mobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.consignee_zipcode = null; } else {
      this.consignee_zipcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pay_type = null; } else {
      this.pay_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pay_code = null; } else {
      this.pay_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pay_nettype = null; } else {
      this.pay_nettype = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.district_money = null; } else {
      this.district_money = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shipping_money = null; } else {
      this.shipping_money = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_money = null; } else {
      this.payment_money = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.order_ctime = null; } else {
      this.order_ctime = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shipping_time = null; } else {
      this.shipping_time = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.receive_time = null; } else {
      this.receive_time = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.order_id = null; } else {
      this.order_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_id = null; } else {
      this.customer_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_status = null; } else {
      this.order_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_ip = null; } else {
      this.customer_ip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_longitude = null; } else {
      this.customer_longitude = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_latitude = null; } else {
      this.customer_latitude = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_areacode = null; } else {
      this.customer_areacode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.consignee_name = null; } else {
      this.consignee_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.consignee_mobile = null; } else {
      this.consignee_mobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.consignee_zipcode = null; } else {
      this.consignee_zipcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pay_type = null; } else {
      this.pay_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pay_code = null; } else {
      this.pay_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pay_nettype = null; } else {
      this.pay_nettype = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.district_money = null; } else {
      this.district_money = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shipping_money = null; } else {
      this.shipping_money = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_money = null; } else {
      this.payment_money = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.order_ctime = null; } else {
      this.order_ctime = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shipping_time = null; } else {
      this.shipping_time = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.receive_time = null; } else {
      this.receive_time = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("order_status", this.order_status);
    __sqoop$field_map.put("customer_ip", this.customer_ip);
    __sqoop$field_map.put("customer_longitude", this.customer_longitude);
    __sqoop$field_map.put("customer_latitude", this.customer_latitude);
    __sqoop$field_map.put("customer_areacode", this.customer_areacode);
    __sqoop$field_map.put("consignee_name", this.consignee_name);
    __sqoop$field_map.put("consignee_mobile", this.consignee_mobile);
    __sqoop$field_map.put("consignee_zipcode", this.consignee_zipcode);
    __sqoop$field_map.put("pay_type", this.pay_type);
    __sqoop$field_map.put("pay_code", this.pay_code);
    __sqoop$field_map.put("pay_nettype", this.pay_nettype);
    __sqoop$field_map.put("district_money", this.district_money);
    __sqoop$field_map.put("shipping_money", this.shipping_money);
    __sqoop$field_map.put("payment_money", this.payment_money);
    __sqoop$field_map.put("order_ctime", this.order_ctime);
    __sqoop$field_map.put("shipping_time", this.shipping_time);
    __sqoop$field_map.put("receive_time", this.receive_time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("order_status", this.order_status);
    __sqoop$field_map.put("customer_ip", this.customer_ip);
    __sqoop$field_map.put("customer_longitude", this.customer_longitude);
    __sqoop$field_map.put("customer_latitude", this.customer_latitude);
    __sqoop$field_map.put("customer_areacode", this.customer_areacode);
    __sqoop$field_map.put("consignee_name", this.consignee_name);
    __sqoop$field_map.put("consignee_mobile", this.consignee_mobile);
    __sqoop$field_map.put("consignee_zipcode", this.consignee_zipcode);
    __sqoop$field_map.put("pay_type", this.pay_type);
    __sqoop$field_map.put("pay_code", this.pay_code);
    __sqoop$field_map.put("pay_nettype", this.pay_nettype);
    __sqoop$field_map.put("district_money", this.district_money);
    __sqoop$field_map.put("shipping_money", this.shipping_money);
    __sqoop$field_map.put("payment_money", this.payment_money);
    __sqoop$field_map.put("order_ctime", this.order_ctime);
    __sqoop$field_map.put("shipping_time", this.shipping_time);
    __sqoop$field_map.put("receive_time", this.receive_time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
