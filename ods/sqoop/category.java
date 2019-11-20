// ORM class for table 'category'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 16:17:44 CST 2019
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

public class category extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("category_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        category.this.category_code = (String)value;
      }
    });
    setters.put("category_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        category.this.category_name = (String)value;
      }
    });
    setters.put("category_parent_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        category.this.category_parent_id = (String)value;
      }
    });
    setters.put("category_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        category.this.category_status = (Integer)value;
      }
    });
    setters.put("category_utime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        category.this.category_utime = (Long)value;
      }
    });
  }
  public category() {
    init0();
  }
  private String category_code;
  public String get_category_code() {
    return category_code;
  }
  public void set_category_code(String category_code) {
    this.category_code = category_code;
  }
  public category with_category_code(String category_code) {
    this.category_code = category_code;
    return this;
  }
  private String category_name;
  public String get_category_name() {
    return category_name;
  }
  public void set_category_name(String category_name) {
    this.category_name = category_name;
  }
  public category with_category_name(String category_name) {
    this.category_name = category_name;
    return this;
  }
  private String category_parent_id;
  public String get_category_parent_id() {
    return category_parent_id;
  }
  public void set_category_parent_id(String category_parent_id) {
    this.category_parent_id = category_parent_id;
  }
  public category with_category_parent_id(String category_parent_id) {
    this.category_parent_id = category_parent_id;
    return this;
  }
  private Integer category_status;
  public Integer get_category_status() {
    return category_status;
  }
  public void set_category_status(Integer category_status) {
    this.category_status = category_status;
  }
  public category with_category_status(Integer category_status) {
    this.category_status = category_status;
    return this;
  }
  private Long category_utime;
  public Long get_category_utime() {
    return category_utime;
  }
  public void set_category_utime(Long category_utime) {
    this.category_utime = category_utime;
  }
  public category with_category_utime(Long category_utime) {
    this.category_utime = category_utime;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof category)) {
      return false;
    }
    category that = (category) o;
    boolean equal = true;
    equal = equal && (this.category_code == null ? that.category_code == null : this.category_code.equals(that.category_code));
    equal = equal && (this.category_name == null ? that.category_name == null : this.category_name.equals(that.category_name));
    equal = equal && (this.category_parent_id == null ? that.category_parent_id == null : this.category_parent_id.equals(that.category_parent_id));
    equal = equal && (this.category_status == null ? that.category_status == null : this.category_status.equals(that.category_status));
    equal = equal && (this.category_utime == null ? that.category_utime == null : this.category_utime.equals(that.category_utime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof category)) {
      return false;
    }
    category that = (category) o;
    boolean equal = true;
    equal = equal && (this.category_code == null ? that.category_code == null : this.category_code.equals(that.category_code));
    equal = equal && (this.category_name == null ? that.category_name == null : this.category_name.equals(that.category_name));
    equal = equal && (this.category_parent_id == null ? that.category_parent_id == null : this.category_parent_id.equals(that.category_parent_id));
    equal = equal && (this.category_status == null ? that.category_status == null : this.category_status.equals(that.category_status));
    equal = equal && (this.category_utime == null ? that.category_utime == null : this.category_utime.equals(that.category_utime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.category_code = JdbcWritableBridge.readString(1, __dbResults);
    this.category_name = JdbcWritableBridge.readString(2, __dbResults);
    this.category_parent_id = JdbcWritableBridge.readString(3, __dbResults);
    this.category_status = JdbcWritableBridge.readInteger(4, __dbResults);
    this.category_utime = JdbcWritableBridge.readLong(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.category_code = JdbcWritableBridge.readString(1, __dbResults);
    this.category_name = JdbcWritableBridge.readString(2, __dbResults);
    this.category_parent_id = JdbcWritableBridge.readString(3, __dbResults);
    this.category_status = JdbcWritableBridge.readInteger(4, __dbResults);
    this.category_utime = JdbcWritableBridge.readLong(5, __dbResults);
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
    JdbcWritableBridge.writeString(category_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category_parent_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(category_status, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(category_utime, 5 + __off, -5, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(category_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category_parent_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(category_status, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(category_utime, 5 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.category_code = null;
    } else {
    this.category_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category_name = null;
    } else {
    this.category_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category_parent_id = null;
    } else {
    this.category_parent_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category_status = null;
    } else {
    this.category_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.category_utime = null;
    } else {
    this.category_utime = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.category_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_code);
    }
    if (null == this.category_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_name);
    }
    if (null == this.category_parent_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_parent_id);
    }
    if (null == this.category_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_status);
    }
    if (null == this.category_utime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.category_utime);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.category_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_code);
    }
    if (null == this.category_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_name);
    }
    if (null == this.category_parent_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_parent_id);
    }
    if (null == this.category_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_status);
    }
    if (null == this.category_utime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.category_utime);
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
    __sb.append(FieldFormatter.escapeAndEnclose(category_code==null?"null":category_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_name==null?"null":category_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_parent_id==null?"null":category_parent_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_status==null?"null":"" + category_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_utime==null?"null":"" + category_utime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(category_code==null?"null":category_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_name==null?"null":category_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_parent_id==null?"null":category_parent_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_status==null?"null":"" + category_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_utime==null?"null":"" + category_utime, delimiters));
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
    if (__cur_str.equals("null")) { this.category_code = null; } else {
      this.category_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_name = null; } else {
      this.category_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_parent_id = null; } else {
      this.category_parent_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_status = null; } else {
      this.category_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_utime = null; } else {
      this.category_utime = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.category_code = null; } else {
      this.category_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_name = null; } else {
      this.category_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_parent_id = null; } else {
      this.category_parent_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_status = null; } else {
      this.category_status = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_utime = null; } else {
      this.category_utime = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    category o = (category) super.clone();
    return o;
  }

  public void clone0(category o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("category_code", this.category_code);
    __sqoop$field_map.put("category_name", this.category_name);
    __sqoop$field_map.put("category_parent_id", this.category_parent_id);
    __sqoop$field_map.put("category_status", this.category_status);
    __sqoop$field_map.put("category_utime", this.category_utime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("category_code", this.category_code);
    __sqoop$field_map.put("category_name", this.category_name);
    __sqoop$field_map.put("category_parent_id", this.category_parent_id);
    __sqoop$field_map.put("category_status", this.category_status);
    __sqoop$field_map.put("category_utime", this.category_utime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
