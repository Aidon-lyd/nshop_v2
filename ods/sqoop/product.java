// ORM class for table 'product'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 16:19:23 CST 2019
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

public class product extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("product_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_code = (String)value;
      }
    });
    setters.put("product_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_name = (String)value;
      }
    });
    setters.put("product_remark", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_remark = (String)value;
      }
    });
    setters.put("category_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.category_code = (String)value;
      }
    });
    setters.put("supplier_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.supplier_code = (String)value;
      }
    });
    setters.put("product_price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_price = (java.math.BigDecimal)value;
      }
    });
    setters.put("product_weighing_cost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_weighing_cost = (java.math.BigDecimal)value;
      }
    });
    setters.put("product_publish_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_publish_status = (Integer)value;
      }
    });
    setters.put("product_audit_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_audit_status = (Integer)value;
      }
    });
    setters.put("product_bar_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_bar_code = (String)value;
      }
    });
    setters.put("product_weight", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_weight = (String)value;
      }
    });
    setters.put("product_length", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_length = (String)value;
      }
    });
    setters.put("product_height", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_height = (String)value;
      }
    });
    setters.put("product_width", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_width = (String)value;
      }
    });
    setters.put("product_colors", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_colors = (Integer)value;
      }
    });
    setters.put("product_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_date = (java.sql.Timestamp)value;
      }
    });
    setters.put("product_shelf_life", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_shelf_life = (Integer)value;
      }
    });
    setters.put("product_ctime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_ctime = (Long)value;
      }
    });
    setters.put("product_utime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product.this.product_utime = (Long)value;
      }
    });
  }
  public product() {
    init0();
  }
  private String product_code;
  public String get_product_code() {
    return product_code;
  }
  public void set_product_code(String product_code) {
    this.product_code = product_code;
  }
  public product with_product_code(String product_code) {
    this.product_code = product_code;
    return this;
  }
  private String product_name;
  public String get_product_name() {
    return product_name;
  }
  public void set_product_name(String product_name) {
    this.product_name = product_name;
  }
  public product with_product_name(String product_name) {
    this.product_name = product_name;
    return this;
  }
  private String product_remark;
  public String get_product_remark() {
    return product_remark;
  }
  public void set_product_remark(String product_remark) {
    this.product_remark = product_remark;
  }
  public product with_product_remark(String product_remark) {
    this.product_remark = product_remark;
    return this;
  }
  private String category_code;
  public String get_category_code() {
    return category_code;
  }
  public void set_category_code(String category_code) {
    this.category_code = category_code;
  }
  public product with_category_code(String category_code) {
    this.category_code = category_code;
    return this;
  }
  private String supplier_code;
  public String get_supplier_code() {
    return supplier_code;
  }
  public void set_supplier_code(String supplier_code) {
    this.supplier_code = supplier_code;
  }
  public product with_supplier_code(String supplier_code) {
    this.supplier_code = supplier_code;
    return this;
  }
  private java.math.BigDecimal product_price;
  public java.math.BigDecimal get_product_price() {
    return product_price;
  }
  public void set_product_price(java.math.BigDecimal product_price) {
    this.product_price = product_price;
  }
  public product with_product_price(java.math.BigDecimal product_price) {
    this.product_price = product_price;
    return this;
  }
  private java.math.BigDecimal product_weighing_cost;
  public java.math.BigDecimal get_product_weighing_cost() {
    return product_weighing_cost;
  }
  public void set_product_weighing_cost(java.math.BigDecimal product_weighing_cost) {
    this.product_weighing_cost = product_weighing_cost;
  }
  public product with_product_weighing_cost(java.math.BigDecimal product_weighing_cost) {
    this.product_weighing_cost = product_weighing_cost;
    return this;
  }
  private Integer product_publish_status;
  public Integer get_product_publish_status() {
    return product_publish_status;
  }
  public void set_product_publish_status(Integer product_publish_status) {
    this.product_publish_status = product_publish_status;
  }
  public product with_product_publish_status(Integer product_publish_status) {
    this.product_publish_status = product_publish_status;
    return this;
  }
  private Integer product_audit_status;
  public Integer get_product_audit_status() {
    return product_audit_status;
  }
  public void set_product_audit_status(Integer product_audit_status) {
    this.product_audit_status = product_audit_status;
  }
  public product with_product_audit_status(Integer product_audit_status) {
    this.product_audit_status = product_audit_status;
    return this;
  }
  private String product_bar_code;
  public String get_product_bar_code() {
    return product_bar_code;
  }
  public void set_product_bar_code(String product_bar_code) {
    this.product_bar_code = product_bar_code;
  }
  public product with_product_bar_code(String product_bar_code) {
    this.product_bar_code = product_bar_code;
    return this;
  }
  private String product_weight;
  public String get_product_weight() {
    return product_weight;
  }
  public void set_product_weight(String product_weight) {
    this.product_weight = product_weight;
  }
  public product with_product_weight(String product_weight) {
    this.product_weight = product_weight;
    return this;
  }
  private String product_length;
  public String get_product_length() {
    return product_length;
  }
  public void set_product_length(String product_length) {
    this.product_length = product_length;
  }
  public product with_product_length(String product_length) {
    this.product_length = product_length;
    return this;
  }
  private String product_height;
  public String get_product_height() {
    return product_height;
  }
  public void set_product_height(String product_height) {
    this.product_height = product_height;
  }
  public product with_product_height(String product_height) {
    this.product_height = product_height;
    return this;
  }
  private String product_width;
  public String get_product_width() {
    return product_width;
  }
  public void set_product_width(String product_width) {
    this.product_width = product_width;
  }
  public product with_product_width(String product_width) {
    this.product_width = product_width;
    return this;
  }
  private Integer product_colors;
  public Integer get_product_colors() {
    return product_colors;
  }
  public void set_product_colors(Integer product_colors) {
    this.product_colors = product_colors;
  }
  public product with_product_colors(Integer product_colors) {
    this.product_colors = product_colors;
    return this;
  }
  private java.sql.Timestamp product_date;
  public java.sql.Timestamp get_product_date() {
    return product_date;
  }
  public void set_product_date(java.sql.Timestamp product_date) {
    this.product_date = product_date;
  }
  public product with_product_date(java.sql.Timestamp product_date) {
    this.product_date = product_date;
    return this;
  }
  private Integer product_shelf_life;
  public Integer get_product_shelf_life() {
    return product_shelf_life;
  }
  public void set_product_shelf_life(Integer product_shelf_life) {
    this.product_shelf_life = product_shelf_life;
  }
  public product with_product_shelf_life(Integer product_shelf_life) {
    this.product_shelf_life = product_shelf_life;
    return this;
  }
  private Long product_ctime;
  public Long get_product_ctime() {
    return product_ctime;
  }
  public void set_product_ctime(Long product_ctime) {
    this.product_ctime = product_ctime;
  }
  public product with_product_ctime(Long product_ctime) {
    this.product_ctime = product_ctime;
    return this;
  }
  private Long product_utime;
  public Long get_product_utime() {
    return product_utime;
  }
  public void set_product_utime(Long product_utime) {
    this.product_utime = product_utime;
  }
  public product with_product_utime(Long product_utime) {
    this.product_utime = product_utime;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof product)) {
      return false;
    }
    product that = (product) o;
    boolean equal = true;
    equal = equal && (this.product_code == null ? that.product_code == null : this.product_code.equals(that.product_code));
    equal = equal && (this.product_name == null ? that.product_name == null : this.product_name.equals(that.product_name));
    equal = equal && (this.product_remark == null ? that.product_remark == null : this.product_remark.equals(that.product_remark));
    equal = equal && (this.category_code == null ? that.category_code == null : this.category_code.equals(that.category_code));
    equal = equal && (this.supplier_code == null ? that.supplier_code == null : this.supplier_code.equals(that.supplier_code));
    equal = equal && (this.product_price == null ? that.product_price == null : this.product_price.equals(that.product_price));
    equal = equal && (this.product_weighing_cost == null ? that.product_weighing_cost == null : this.product_weighing_cost.equals(that.product_weighing_cost));
    equal = equal && (this.product_publish_status == null ? that.product_publish_status == null : this.product_publish_status.equals(that.product_publish_status));
    equal = equal && (this.product_audit_status == null ? that.product_audit_status == null : this.product_audit_status.equals(that.product_audit_status));
    equal = equal && (this.product_bar_code == null ? that.product_bar_code == null : this.product_bar_code.equals(that.product_bar_code));
    equal = equal && (this.product_weight == null ? that.product_weight == null : this.product_weight.equals(that.product_weight));
    equal = equal && (this.product_length == null ? that.product_length == null : this.product_length.equals(that.product_length));
    equal = equal && (this.product_height == null ? that.product_height == null : this.product_height.equals(that.product_height));
    equal = equal && (this.product_width == null ? that.product_width == null : this.product_width.equals(that.product_width));
    equal = equal && (this.product_colors == null ? that.product_colors == null : this.product_colors.equals(that.product_colors));
    equal = equal && (this.product_date == null ? that.product_date == null : this.product_date.equals(that.product_date));
    equal = equal && (this.product_shelf_life == null ? that.product_shelf_life == null : this.product_shelf_life.equals(that.product_shelf_life));
    equal = equal && (this.product_ctime == null ? that.product_ctime == null : this.product_ctime.equals(that.product_ctime));
    equal = equal && (this.product_utime == null ? that.product_utime == null : this.product_utime.equals(that.product_utime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof product)) {
      return false;
    }
    product that = (product) o;
    boolean equal = true;
    equal = equal && (this.product_code == null ? that.product_code == null : this.product_code.equals(that.product_code));
    equal = equal && (this.product_name == null ? that.product_name == null : this.product_name.equals(that.product_name));
    equal = equal && (this.product_remark == null ? that.product_remark == null : this.product_remark.equals(that.product_remark));
    equal = equal && (this.category_code == null ? that.category_code == null : this.category_code.equals(that.category_code));
    equal = equal && (this.supplier_code == null ? that.supplier_code == null : this.supplier_code.equals(that.supplier_code));
    equal = equal && (this.product_price == null ? that.product_price == null : this.product_price.equals(that.product_price));
    equal = equal && (this.product_weighing_cost == null ? that.product_weighing_cost == null : this.product_weighing_cost.equals(that.product_weighing_cost));
    equal = equal && (this.product_publish_status == null ? that.product_publish_status == null : this.product_publish_status.equals(that.product_publish_status));
    equal = equal && (this.product_audit_status == null ? that.product_audit_status == null : this.product_audit_status.equals(that.product_audit_status));
    equal = equal && (this.product_bar_code == null ? that.product_bar_code == null : this.product_bar_code.equals(that.product_bar_code));
    equal = equal && (this.product_weight == null ? that.product_weight == null : this.product_weight.equals(that.product_weight));
    equal = equal && (this.product_length == null ? that.product_length == null : this.product_length.equals(that.product_length));
    equal = equal && (this.product_height == null ? that.product_height == null : this.product_height.equals(that.product_height));
    equal = equal && (this.product_width == null ? that.product_width == null : this.product_width.equals(that.product_width));
    equal = equal && (this.product_colors == null ? that.product_colors == null : this.product_colors.equals(that.product_colors));
    equal = equal && (this.product_date == null ? that.product_date == null : this.product_date.equals(that.product_date));
    equal = equal && (this.product_shelf_life == null ? that.product_shelf_life == null : this.product_shelf_life.equals(that.product_shelf_life));
    equal = equal && (this.product_ctime == null ? that.product_ctime == null : this.product_ctime.equals(that.product_ctime));
    equal = equal && (this.product_utime == null ? that.product_utime == null : this.product_utime.equals(that.product_utime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.product_code = JdbcWritableBridge.readString(1, __dbResults);
    this.product_name = JdbcWritableBridge.readString(2, __dbResults);
    this.product_remark = JdbcWritableBridge.readString(3, __dbResults);
    this.category_code = JdbcWritableBridge.readString(4, __dbResults);
    this.supplier_code = JdbcWritableBridge.readString(5, __dbResults);
    this.product_price = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.product_weighing_cost = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.product_publish_status = JdbcWritableBridge.readInteger(8, __dbResults);
    this.product_audit_status = JdbcWritableBridge.readInteger(9, __dbResults);
    this.product_bar_code = JdbcWritableBridge.readString(10, __dbResults);
    this.product_weight = JdbcWritableBridge.readString(11, __dbResults);
    this.product_length = JdbcWritableBridge.readString(12, __dbResults);
    this.product_height = JdbcWritableBridge.readString(13, __dbResults);
    this.product_width = JdbcWritableBridge.readString(14, __dbResults);
    this.product_colors = JdbcWritableBridge.readInteger(15, __dbResults);
    this.product_date = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.product_shelf_life = JdbcWritableBridge.readInteger(17, __dbResults);
    this.product_ctime = JdbcWritableBridge.readLong(18, __dbResults);
    this.product_utime = JdbcWritableBridge.readLong(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.product_code = JdbcWritableBridge.readString(1, __dbResults);
    this.product_name = JdbcWritableBridge.readString(2, __dbResults);
    this.product_remark = JdbcWritableBridge.readString(3, __dbResults);
    this.category_code = JdbcWritableBridge.readString(4, __dbResults);
    this.supplier_code = JdbcWritableBridge.readString(5, __dbResults);
    this.product_price = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.product_weighing_cost = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.product_publish_status = JdbcWritableBridge.readInteger(8, __dbResults);
    this.product_audit_status = JdbcWritableBridge.readInteger(9, __dbResults);
    this.product_bar_code = JdbcWritableBridge.readString(10, __dbResults);
    this.product_weight = JdbcWritableBridge.readString(11, __dbResults);
    this.product_length = JdbcWritableBridge.readString(12, __dbResults);
    this.product_height = JdbcWritableBridge.readString(13, __dbResults);
    this.product_width = JdbcWritableBridge.readString(14, __dbResults);
    this.product_colors = JdbcWritableBridge.readInteger(15, __dbResults);
    this.product_date = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.product_shelf_life = JdbcWritableBridge.readInteger(17, __dbResults);
    this.product_ctime = JdbcWritableBridge.readLong(18, __dbResults);
    this.product_utime = JdbcWritableBridge.readLong(19, __dbResults);
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
    JdbcWritableBridge.writeString(product_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_remark, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(category_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(supplier_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(product_price, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(product_weighing_cost, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(product_publish_status, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(product_audit_status, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(product_bar_code, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_weight, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_length, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_height, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_width, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(product_colors, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(product_date, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(product_shelf_life, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(product_ctime, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(product_utime, 19 + __off, -5, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(product_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_remark, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(category_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(supplier_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(product_price, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(product_weighing_cost, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(product_publish_status, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(product_audit_status, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(product_bar_code, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_weight, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_length, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_height, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_width, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(product_colors, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(product_date, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(product_shelf_life, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(product_ctime, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(product_utime, 19 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.product_code = null;
    } else {
    this.product_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_name = null;
    } else {
    this.product_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_remark = null;
    } else {
    this.product_remark = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category_code = null;
    } else {
    this.category_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.supplier_code = null;
    } else {
    this.supplier_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_price = null;
    } else {
    this.product_price = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_weighing_cost = null;
    } else {
    this.product_weighing_cost = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_publish_status = null;
    } else {
    this.product_publish_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.product_audit_status = null;
    } else {
    this.product_audit_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.product_bar_code = null;
    } else {
    this.product_bar_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_weight = null;
    } else {
    this.product_weight = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_length = null;
    } else {
    this.product_length = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_height = null;
    } else {
    this.product_height = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_width = null;
    } else {
    this.product_width = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_colors = null;
    } else {
    this.product_colors = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.product_date = null;
    } else {
    this.product_date = new Timestamp(__dataIn.readLong());
    this.product_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.product_shelf_life = null;
    } else {
    this.product_shelf_life = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.product_ctime = null;
    } else {
    this.product_ctime = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.product_utime = null;
    } else {
    this.product_utime = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.product_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_code);
    }
    if (null == this.product_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_name);
    }
    if (null == this.product_remark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_remark);
    }
    if (null == this.category_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_code);
    }
    if (null == this.supplier_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, supplier_code);
    }
    if (null == this.product_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.product_price, __dataOut);
    }
    if (null == this.product_weighing_cost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.product_weighing_cost, __dataOut);
    }
    if (null == this.product_publish_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_publish_status);
    }
    if (null == this.product_audit_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_audit_status);
    }
    if (null == this.product_bar_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_bar_code);
    }
    if (null == this.product_weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_weight);
    }
    if (null == this.product_length) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_length);
    }
    if (null == this.product_height) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_height);
    }
    if (null == this.product_width) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_width);
    }
    if (null == this.product_colors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_colors);
    }
    if (null == this.product_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.product_date.getTime());
    __dataOut.writeInt(this.product_date.getNanos());
    }
    if (null == this.product_shelf_life) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_shelf_life);
    }
    if (null == this.product_ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.product_ctime);
    }
    if (null == this.product_utime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.product_utime);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.product_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_code);
    }
    if (null == this.product_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_name);
    }
    if (null == this.product_remark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_remark);
    }
    if (null == this.category_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_code);
    }
    if (null == this.supplier_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, supplier_code);
    }
    if (null == this.product_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.product_price, __dataOut);
    }
    if (null == this.product_weighing_cost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.product_weighing_cost, __dataOut);
    }
    if (null == this.product_publish_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_publish_status);
    }
    if (null == this.product_audit_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_audit_status);
    }
    if (null == this.product_bar_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_bar_code);
    }
    if (null == this.product_weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_weight);
    }
    if (null == this.product_length) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_length);
    }
    if (null == this.product_height) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_height);
    }
    if (null == this.product_width) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_width);
    }
    if (null == this.product_colors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_colors);
    }
    if (null == this.product_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.product_date.getTime());
    __dataOut.writeInt(this.product_date.getNanos());
    }
    if (null == this.product_shelf_life) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_shelf_life);
    }
    if (null == this.product_ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.product_ctime);
    }
    if (null == this.product_utime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.product_utime);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(product_code==null?"null":product_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_name==null?"null":product_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_remark==null?"null":product_remark, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_code==null?"null":category_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_code==null?"null":supplier_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_price==null?"null":product_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_weighing_cost==null?"null":product_weighing_cost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_publish_status==null?"null":"" + product_publish_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_audit_status==null?"null":"" + product_audit_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_bar_code==null?"null":product_bar_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_weight==null?"null":product_weight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_length==null?"null":product_length, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_height==null?"null":product_height, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_width==null?"null":product_width, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_colors==null?"null":"" + product_colors, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_date==null?"null":"" + product_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_shelf_life==null?"null":"" + product_shelf_life, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_ctime==null?"null":"" + product_ctime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_utime==null?"null":"" + product_utime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(product_code==null?"null":product_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_name==null?"null":product_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_remark==null?"null":product_remark, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_code==null?"null":category_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_code==null?"null":supplier_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_price==null?"null":product_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_weighing_cost==null?"null":product_weighing_cost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_publish_status==null?"null":"" + product_publish_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_audit_status==null?"null":"" + product_audit_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_bar_code==null?"null":product_bar_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_weight==null?"null":product_weight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_length==null?"null":product_length, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_height==null?"null":product_height, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_width==null?"null":product_width, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_colors==null?"null":"" + product_colors, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_date==null?"null":"" + product_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_shelf_life==null?"null":"" + product_shelf_life, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_ctime==null?"null":"" + product_ctime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_utime==null?"null":"" + product_utime, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null")) { this.product_code = null; } else {
      this.product_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_name = null; } else {
      this.product_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_remark = null; } else {
      this.product_remark = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_code = null; } else {
      this.category_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.supplier_code = null; } else {
      this.supplier_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_price = null; } else {
      this.product_price = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_weighing_cost = null; } else {
      this.product_weighing_cost = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_publish_status = null; } else {
      this.product_publish_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_audit_status = null; } else {
      this.product_audit_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_bar_code = null; } else {
      this.product_bar_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_weight = null; } else {
      this.product_weight = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_length = null; } else {
      this.product_length = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_height = null; } else {
      this.product_height = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_width = null; } else {
      this.product_width = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_colors = null; } else {
      this.product_colors = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_date = null; } else {
      this.product_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_shelf_life = null; } else {
      this.product_shelf_life = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_ctime = null; } else {
      this.product_ctime = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_utime = null; } else {
      this.product_utime = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.product_code = null; } else {
      this.product_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_name = null; } else {
      this.product_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_remark = null; } else {
      this.product_remark = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_code = null; } else {
      this.category_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.supplier_code = null; } else {
      this.supplier_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_price = null; } else {
      this.product_price = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_weighing_cost = null; } else {
      this.product_weighing_cost = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_publish_status = null; } else {
      this.product_publish_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_audit_status = null; } else {
      this.product_audit_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_bar_code = null; } else {
      this.product_bar_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_weight = null; } else {
      this.product_weight = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_length = null; } else {
      this.product_length = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_height = null; } else {
      this.product_height = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.product_width = null; } else {
      this.product_width = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_colors = null; } else {
      this.product_colors = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_date = null; } else {
      this.product_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_shelf_life = null; } else {
      this.product_shelf_life = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_ctime = null; } else {
      this.product_ctime = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_utime = null; } else {
      this.product_utime = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    product o = (product) super.clone();
    o.product_date = (o.product_date != null) ? (java.sql.Timestamp) o.product_date.clone() : null;
    return o;
  }

  public void clone0(product o) throws CloneNotSupportedException {
    o.product_date = (o.product_date != null) ? (java.sql.Timestamp) o.product_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("product_code", this.product_code);
    __sqoop$field_map.put("product_name", this.product_name);
    __sqoop$field_map.put("product_remark", this.product_remark);
    __sqoop$field_map.put("category_code", this.category_code);
    __sqoop$field_map.put("supplier_code", this.supplier_code);
    __sqoop$field_map.put("product_price", this.product_price);
    __sqoop$field_map.put("product_weighing_cost", this.product_weighing_cost);
    __sqoop$field_map.put("product_publish_status", this.product_publish_status);
    __sqoop$field_map.put("product_audit_status", this.product_audit_status);
    __sqoop$field_map.put("product_bar_code", this.product_bar_code);
    __sqoop$field_map.put("product_weight", this.product_weight);
    __sqoop$field_map.put("product_length", this.product_length);
    __sqoop$field_map.put("product_height", this.product_height);
    __sqoop$field_map.put("product_width", this.product_width);
    __sqoop$field_map.put("product_colors", this.product_colors);
    __sqoop$field_map.put("product_date", this.product_date);
    __sqoop$field_map.put("product_shelf_life", this.product_shelf_life);
    __sqoop$field_map.put("product_ctime", this.product_ctime);
    __sqoop$field_map.put("product_utime", this.product_utime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("product_code", this.product_code);
    __sqoop$field_map.put("product_name", this.product_name);
    __sqoop$field_map.put("product_remark", this.product_remark);
    __sqoop$field_map.put("category_code", this.category_code);
    __sqoop$field_map.put("supplier_code", this.supplier_code);
    __sqoop$field_map.put("product_price", this.product_price);
    __sqoop$field_map.put("product_weighing_cost", this.product_weighing_cost);
    __sqoop$field_map.put("product_publish_status", this.product_publish_status);
    __sqoop$field_map.put("product_audit_status", this.product_audit_status);
    __sqoop$field_map.put("product_bar_code", this.product_bar_code);
    __sqoop$field_map.put("product_weight", this.product_weight);
    __sqoop$field_map.put("product_length", this.product_length);
    __sqoop$field_map.put("product_height", this.product_height);
    __sqoop$field_map.put("product_width", this.product_width);
    __sqoop$field_map.put("product_colors", this.product_colors);
    __sqoop$field_map.put("product_date", this.product_date);
    __sqoop$field_map.put("product_shelf_life", this.product_shelf_life);
    __sqoop$field_map.put("product_ctime", this.product_ctime);
    __sqoop$field_map.put("product_utime", this.product_utime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
