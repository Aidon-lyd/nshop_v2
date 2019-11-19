// ORM class for table 'customer_consignee'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 17:17:09 CST 2019
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

public class customer_consignee extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("consignee_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_consignee.this.consignee_id = (String)value;
      }
    });
    setters.put("customer_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_consignee.this.customer_id = (String)value;
      }
    });
    setters.put("consignee_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_consignee.this.consignee_name = (String)value;
      }
    });
    setters.put("consignee_mobile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_consignee.this.consignee_mobile = (String)value;
      }
    });
    setters.put("consignee_zipcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_consignee.this.consignee_zipcode = (String)value;
      }
    });
    setters.put("consignee_addr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_consignee.this.consignee_addr = (String)value;
      }
    });
    setters.put("consignee_tag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_consignee.this.consignee_tag = (String)value;
      }
    });
    setters.put("ctime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_consignee.this.ctime = (Long)value;
      }
    });
  }
  public customer_consignee() {
    init0();
  }
  private String consignee_id;
  public String get_consignee_id() {
    return consignee_id;
  }
  public void set_consignee_id(String consignee_id) {
    this.consignee_id = consignee_id;
  }
  public customer_consignee with_consignee_id(String consignee_id) {
    this.consignee_id = consignee_id;
    return this;
  }
  private String customer_id;
  public String get_customer_id() {
    return customer_id;
  }
  public void set_customer_id(String customer_id) {
    this.customer_id = customer_id;
  }
  public customer_consignee with_customer_id(String customer_id) {
    this.customer_id = customer_id;
    return this;
  }
  private String consignee_name;
  public String get_consignee_name() {
    return consignee_name;
  }
  public void set_consignee_name(String consignee_name) {
    this.consignee_name = consignee_name;
  }
  public customer_consignee with_consignee_name(String consignee_name) {
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
  public customer_consignee with_consignee_mobile(String consignee_mobile) {
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
  public customer_consignee with_consignee_zipcode(String consignee_zipcode) {
    this.consignee_zipcode = consignee_zipcode;
    return this;
  }
  private String consignee_addr;
  public String get_consignee_addr() {
    return consignee_addr;
  }
  public void set_consignee_addr(String consignee_addr) {
    this.consignee_addr = consignee_addr;
  }
  public customer_consignee with_consignee_addr(String consignee_addr) {
    this.consignee_addr = consignee_addr;
    return this;
  }
  private String consignee_tag;
  public String get_consignee_tag() {
    return consignee_tag;
  }
  public void set_consignee_tag(String consignee_tag) {
    this.consignee_tag = consignee_tag;
  }
  public customer_consignee with_consignee_tag(String consignee_tag) {
    this.consignee_tag = consignee_tag;
    return this;
  }
  private Long ctime;
  public Long get_ctime() {
    return ctime;
  }
  public void set_ctime(Long ctime) {
    this.ctime = ctime;
  }
  public customer_consignee with_ctime(Long ctime) {
    this.ctime = ctime;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customer_consignee)) {
      return false;
    }
    customer_consignee that = (customer_consignee) o;
    boolean equal = true;
    equal = equal && (this.consignee_id == null ? that.consignee_id == null : this.consignee_id.equals(that.consignee_id));
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.consignee_name == null ? that.consignee_name == null : this.consignee_name.equals(that.consignee_name));
    equal = equal && (this.consignee_mobile == null ? that.consignee_mobile == null : this.consignee_mobile.equals(that.consignee_mobile));
    equal = equal && (this.consignee_zipcode == null ? that.consignee_zipcode == null : this.consignee_zipcode.equals(that.consignee_zipcode));
    equal = equal && (this.consignee_addr == null ? that.consignee_addr == null : this.consignee_addr.equals(that.consignee_addr));
    equal = equal && (this.consignee_tag == null ? that.consignee_tag == null : this.consignee_tag.equals(that.consignee_tag));
    equal = equal && (this.ctime == null ? that.ctime == null : this.ctime.equals(that.ctime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customer_consignee)) {
      return false;
    }
    customer_consignee that = (customer_consignee) o;
    boolean equal = true;
    equal = equal && (this.consignee_id == null ? that.consignee_id == null : this.consignee_id.equals(that.consignee_id));
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.consignee_name == null ? that.consignee_name == null : this.consignee_name.equals(that.consignee_name));
    equal = equal && (this.consignee_mobile == null ? that.consignee_mobile == null : this.consignee_mobile.equals(that.consignee_mobile));
    equal = equal && (this.consignee_zipcode == null ? that.consignee_zipcode == null : this.consignee_zipcode.equals(that.consignee_zipcode));
    equal = equal && (this.consignee_addr == null ? that.consignee_addr == null : this.consignee_addr.equals(that.consignee_addr));
    equal = equal && (this.consignee_tag == null ? that.consignee_tag == null : this.consignee_tag.equals(that.consignee_tag));
    equal = equal && (this.ctime == null ? that.ctime == null : this.ctime.equals(that.ctime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.consignee_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_id = JdbcWritableBridge.readString(2, __dbResults);
    this.consignee_name = JdbcWritableBridge.readString(3, __dbResults);
    this.consignee_mobile = JdbcWritableBridge.readString(4, __dbResults);
    this.consignee_zipcode = JdbcWritableBridge.readString(5, __dbResults);
    this.consignee_addr = JdbcWritableBridge.readString(6, __dbResults);
    this.consignee_tag = JdbcWritableBridge.readString(7, __dbResults);
    this.ctime = JdbcWritableBridge.readLong(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.consignee_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_id = JdbcWritableBridge.readString(2, __dbResults);
    this.consignee_name = JdbcWritableBridge.readString(3, __dbResults);
    this.consignee_mobile = JdbcWritableBridge.readString(4, __dbResults);
    this.consignee_zipcode = JdbcWritableBridge.readString(5, __dbResults);
    this.consignee_addr = JdbcWritableBridge.readString(6, __dbResults);
    this.consignee_tag = JdbcWritableBridge.readString(7, __dbResults);
    this.ctime = JdbcWritableBridge.readLong(8, __dbResults);
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
    JdbcWritableBridge.writeString(consignee_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_mobile, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_zipcode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_addr, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_tag, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(ctime, 8 + __off, -5, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(consignee_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_mobile, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_zipcode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_addr, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consignee_tag, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(ctime, 8 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.consignee_id = null;
    } else {
    this.consignee_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_id = null;
    } else {
    this.customer_id = Text.readString(__dataIn);
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
        this.consignee_addr = null;
    } else {
    this.consignee_addr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.consignee_tag = null;
    } else {
    this.consignee_tag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ctime = null;
    } else {
    this.ctime = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.consignee_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_id);
    }
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
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
    if (null == this.consignee_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_addr);
    }
    if (null == this.consignee_tag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_tag);
    }
    if (null == this.ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ctime);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.consignee_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_id);
    }
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
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
    if (null == this.consignee_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_addr);
    }
    if (null == this.consignee_tag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consignee_tag);
    }
    if (null == this.ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ctime);
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
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_id==null?"null":consignee_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_name==null?"null":consignee_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_mobile==null?"null":consignee_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_zipcode==null?"null":consignee_zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_addr==null?"null":consignee_addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_tag==null?"null":consignee_tag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ctime==null?"null":"" + ctime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_id==null?"null":consignee_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_name==null?"null":consignee_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_mobile==null?"null":consignee_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_zipcode==null?"null":consignee_zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_addr==null?"null":consignee_addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consignee_tag==null?"null":consignee_tag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ctime==null?"null":"" + ctime, delimiters));
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
    if (__cur_str.equals("null")) { this.consignee_id = null; } else {
      this.consignee_id = __cur_str;
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
    if (__cur_str.equals("null")) { this.consignee_addr = null; } else {
      this.consignee_addr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.consignee_tag = null; } else {
      this.consignee_tag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ctime = null; } else {
      this.ctime = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.consignee_id = null; } else {
      this.consignee_id = __cur_str;
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
    if (__cur_str.equals("null")) { this.consignee_addr = null; } else {
      this.consignee_addr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.consignee_tag = null; } else {
      this.consignee_tag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ctime = null; } else {
      this.ctime = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    customer_consignee o = (customer_consignee) super.clone();
    return o;
  }

  public void clone0(customer_consignee o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("consignee_id", this.consignee_id);
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("consignee_name", this.consignee_name);
    __sqoop$field_map.put("consignee_mobile", this.consignee_mobile);
    __sqoop$field_map.put("consignee_zipcode", this.consignee_zipcode);
    __sqoop$field_map.put("consignee_addr", this.consignee_addr);
    __sqoop$field_map.put("consignee_tag", this.consignee_tag);
    __sqoop$field_map.put("ctime", this.ctime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("consignee_id", this.consignee_id);
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("consignee_name", this.consignee_name);
    __sqoop$field_map.put("consignee_mobile", this.consignee_mobile);
    __sqoop$field_map.put("consignee_zipcode", this.consignee_zipcode);
    __sqoop$field_map.put("consignee_addr", this.consignee_addr);
    __sqoop$field_map.put("consignee_tag", this.consignee_tag);
    __sqoop$field_map.put("ctime", this.ctime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
