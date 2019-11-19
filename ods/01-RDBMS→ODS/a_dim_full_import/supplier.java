// ORM class for table 'supplier'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 17:40:11 CST 2019
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

public class supplier extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("supplier_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        supplier.this.supplier_code = (String)value;
      }
    });
    setters.put("supplier_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        supplier.this.supplier_name = (String)value;
      }
    });
    setters.put("supplier_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        supplier.this.supplier_type = (Integer)value;
      }
    });
    setters.put("supplier_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        supplier.this.supplier_status = (Integer)value;
      }
    });
    setters.put("supplier_utime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        supplier.this.supplier_utime = (Long)value;
      }
    });
  }
  public supplier() {
    init0();
  }
  private String supplier_code;
  public String get_supplier_code() {
    return supplier_code;
  }
  public void set_supplier_code(String supplier_code) {
    this.supplier_code = supplier_code;
  }
  public supplier with_supplier_code(String supplier_code) {
    this.supplier_code = supplier_code;
    return this;
  }
  private String supplier_name;
  public String get_supplier_name() {
    return supplier_name;
  }
  public void set_supplier_name(String supplier_name) {
    this.supplier_name = supplier_name;
  }
  public supplier with_supplier_name(String supplier_name) {
    this.supplier_name = supplier_name;
    return this;
  }
  private Integer supplier_type;
  public Integer get_supplier_type() {
    return supplier_type;
  }
  public void set_supplier_type(Integer supplier_type) {
    this.supplier_type = supplier_type;
  }
  public supplier with_supplier_type(Integer supplier_type) {
    this.supplier_type = supplier_type;
    return this;
  }
  private Integer supplier_status;
  public Integer get_supplier_status() {
    return supplier_status;
  }
  public void set_supplier_status(Integer supplier_status) {
    this.supplier_status = supplier_status;
  }
  public supplier with_supplier_status(Integer supplier_status) {
    this.supplier_status = supplier_status;
    return this;
  }
  private Long supplier_utime;
  public Long get_supplier_utime() {
    return supplier_utime;
  }
  public void set_supplier_utime(Long supplier_utime) {
    this.supplier_utime = supplier_utime;
  }
  public supplier with_supplier_utime(Long supplier_utime) {
    this.supplier_utime = supplier_utime;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof supplier)) {
      return false;
    }
    supplier that = (supplier) o;
    boolean equal = true;
    equal = equal && (this.supplier_code == null ? that.supplier_code == null : this.supplier_code.equals(that.supplier_code));
    equal = equal && (this.supplier_name == null ? that.supplier_name == null : this.supplier_name.equals(that.supplier_name));
    equal = equal && (this.supplier_type == null ? that.supplier_type == null : this.supplier_type.equals(that.supplier_type));
    equal = equal && (this.supplier_status == null ? that.supplier_status == null : this.supplier_status.equals(that.supplier_status));
    equal = equal && (this.supplier_utime == null ? that.supplier_utime == null : this.supplier_utime.equals(that.supplier_utime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof supplier)) {
      return false;
    }
    supplier that = (supplier) o;
    boolean equal = true;
    equal = equal && (this.supplier_code == null ? that.supplier_code == null : this.supplier_code.equals(that.supplier_code));
    equal = equal && (this.supplier_name == null ? that.supplier_name == null : this.supplier_name.equals(that.supplier_name));
    equal = equal && (this.supplier_type == null ? that.supplier_type == null : this.supplier_type.equals(that.supplier_type));
    equal = equal && (this.supplier_status == null ? that.supplier_status == null : this.supplier_status.equals(that.supplier_status));
    equal = equal && (this.supplier_utime == null ? that.supplier_utime == null : this.supplier_utime.equals(that.supplier_utime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.supplier_code = JdbcWritableBridge.readString(1, __dbResults);
    this.supplier_name = JdbcWritableBridge.readString(2, __dbResults);
    this.supplier_type = JdbcWritableBridge.readInteger(3, __dbResults);
    this.supplier_status = JdbcWritableBridge.readInteger(4, __dbResults);
    this.supplier_utime = JdbcWritableBridge.readLong(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.supplier_code = JdbcWritableBridge.readString(1, __dbResults);
    this.supplier_name = JdbcWritableBridge.readString(2, __dbResults);
    this.supplier_type = JdbcWritableBridge.readInteger(3, __dbResults);
    this.supplier_status = JdbcWritableBridge.readInteger(4, __dbResults);
    this.supplier_utime = JdbcWritableBridge.readLong(5, __dbResults);
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
    JdbcWritableBridge.writeString(supplier_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(supplier_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(supplier_type, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(supplier_status, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(supplier_utime, 5 + __off, -5, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(supplier_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(supplier_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(supplier_type, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(supplier_status, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(supplier_utime, 5 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.supplier_code = null;
    } else {
    this.supplier_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.supplier_name = null;
    } else {
    this.supplier_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.supplier_type = null;
    } else {
    this.supplier_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.supplier_status = null;
    } else {
    this.supplier_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.supplier_utime = null;
    } else {
    this.supplier_utime = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.supplier_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, supplier_code);
    }
    if (null == this.supplier_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, supplier_name);
    }
    if (null == this.supplier_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.supplier_type);
    }
    if (null == this.supplier_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.supplier_status);
    }
    if (null == this.supplier_utime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.supplier_utime);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.supplier_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, supplier_code);
    }
    if (null == this.supplier_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, supplier_name);
    }
    if (null == this.supplier_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.supplier_type);
    }
    if (null == this.supplier_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.supplier_status);
    }
    if (null == this.supplier_utime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.supplier_utime);
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
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_code==null?"null":supplier_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_name==null?"null":supplier_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_type==null?"null":"" + supplier_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_status==null?"null":"" + supplier_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_utime==null?"null":"" + supplier_utime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_code==null?"null":supplier_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_name==null?"null":supplier_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_type==null?"null":"" + supplier_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_status==null?"null":"" + supplier_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supplier_utime==null?"null":"" + supplier_utime, delimiters));
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
    if (__cur_str.equals("null")) { this.supplier_code = null; } else {
      this.supplier_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.supplier_name = null; } else {
      this.supplier_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supplier_type = null; } else {
      this.supplier_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supplier_status = null; } else {
      this.supplier_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supplier_utime = null; } else {
      this.supplier_utime = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.supplier_code = null; } else {
      this.supplier_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.supplier_name = null; } else {
      this.supplier_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supplier_type = null; } else {
      this.supplier_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supplier_status = null; } else {
      this.supplier_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supplier_utime = null; } else {
      this.supplier_utime = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    supplier o = (supplier) super.clone();
    return o;
  }

  public void clone0(supplier o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("supplier_code", this.supplier_code);
    __sqoop$field_map.put("supplier_name", this.supplier_name);
    __sqoop$field_map.put("supplier_type", this.supplier_type);
    __sqoop$field_map.put("supplier_status", this.supplier_status);
    __sqoop$field_map.put("supplier_utime", this.supplier_utime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("supplier_code", this.supplier_code);
    __sqoop$field_map.put("supplier_name", this.supplier_name);
    __sqoop$field_map.put("supplier_type", this.supplier_type);
    __sqoop$field_map.put("supplier_status", this.supplier_status);
    __sqoop$field_map.put("supplier_utime", this.supplier_utime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
