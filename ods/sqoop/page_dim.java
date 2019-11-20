// ORM class for table 'page_dim'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 16:20:14 CST 2019
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

public class page_dim extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("page_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        page_dim.this.page_code = (String)value;
      }
    });
    setters.put("page_remark", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        page_dim.this.page_remark = (String)value;
      }
    });
    setters.put("page_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        page_dim.this.page_type = (String)value;
      }
    });
    setters.put("page_target", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        page_dim.this.page_target = (String)value;
      }
    });
    setters.put("page_ctime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        page_dim.this.page_ctime = (Long)value;
      }
    });
  }
  public page_dim() {
    init0();
  }
  private String page_code;
  public String get_page_code() {
    return page_code;
  }
  public void set_page_code(String page_code) {
    this.page_code = page_code;
  }
  public page_dim with_page_code(String page_code) {
    this.page_code = page_code;
    return this;
  }
  private String page_remark;
  public String get_page_remark() {
    return page_remark;
  }
  public void set_page_remark(String page_remark) {
    this.page_remark = page_remark;
  }
  public page_dim with_page_remark(String page_remark) {
    this.page_remark = page_remark;
    return this;
  }
  private String page_type;
  public String get_page_type() {
    return page_type;
  }
  public void set_page_type(String page_type) {
    this.page_type = page_type;
  }
  public page_dim with_page_type(String page_type) {
    this.page_type = page_type;
    return this;
  }
  private String page_target;
  public String get_page_target() {
    return page_target;
  }
  public void set_page_target(String page_target) {
    this.page_target = page_target;
  }
  public page_dim with_page_target(String page_target) {
    this.page_target = page_target;
    return this;
  }
  private Long page_ctime;
  public Long get_page_ctime() {
    return page_ctime;
  }
  public void set_page_ctime(Long page_ctime) {
    this.page_ctime = page_ctime;
  }
  public page_dim with_page_ctime(Long page_ctime) {
    this.page_ctime = page_ctime;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof page_dim)) {
      return false;
    }
    page_dim that = (page_dim) o;
    boolean equal = true;
    equal = equal && (this.page_code == null ? that.page_code == null : this.page_code.equals(that.page_code));
    equal = equal && (this.page_remark == null ? that.page_remark == null : this.page_remark.equals(that.page_remark));
    equal = equal && (this.page_type == null ? that.page_type == null : this.page_type.equals(that.page_type));
    equal = equal && (this.page_target == null ? that.page_target == null : this.page_target.equals(that.page_target));
    equal = equal && (this.page_ctime == null ? that.page_ctime == null : this.page_ctime.equals(that.page_ctime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof page_dim)) {
      return false;
    }
    page_dim that = (page_dim) o;
    boolean equal = true;
    equal = equal && (this.page_code == null ? that.page_code == null : this.page_code.equals(that.page_code));
    equal = equal && (this.page_remark == null ? that.page_remark == null : this.page_remark.equals(that.page_remark));
    equal = equal && (this.page_type == null ? that.page_type == null : this.page_type.equals(that.page_type));
    equal = equal && (this.page_target == null ? that.page_target == null : this.page_target.equals(that.page_target));
    equal = equal && (this.page_ctime == null ? that.page_ctime == null : this.page_ctime.equals(that.page_ctime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.page_code = JdbcWritableBridge.readString(1, __dbResults);
    this.page_remark = JdbcWritableBridge.readString(2, __dbResults);
    this.page_type = JdbcWritableBridge.readString(3, __dbResults);
    this.page_target = JdbcWritableBridge.readString(4, __dbResults);
    this.page_ctime = JdbcWritableBridge.readLong(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.page_code = JdbcWritableBridge.readString(1, __dbResults);
    this.page_remark = JdbcWritableBridge.readString(2, __dbResults);
    this.page_type = JdbcWritableBridge.readString(3, __dbResults);
    this.page_target = JdbcWritableBridge.readString(4, __dbResults);
    this.page_ctime = JdbcWritableBridge.readLong(5, __dbResults);
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
    JdbcWritableBridge.writeString(page_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(page_remark, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(page_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(page_target, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(page_ctime, 5 + __off, -5, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(page_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(page_remark, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(page_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(page_target, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(page_ctime, 5 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.page_code = null;
    } else {
    this.page_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.page_remark = null;
    } else {
    this.page_remark = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.page_type = null;
    } else {
    this.page_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.page_target = null;
    } else {
    this.page_target = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.page_ctime = null;
    } else {
    this.page_ctime = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.page_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_code);
    }
    if (null == this.page_remark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_remark);
    }
    if (null == this.page_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_type);
    }
    if (null == this.page_target) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_target);
    }
    if (null == this.page_ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.page_ctime);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.page_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_code);
    }
    if (null == this.page_remark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_remark);
    }
    if (null == this.page_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_type);
    }
    if (null == this.page_target) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_target);
    }
    if (null == this.page_ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.page_ctime);
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
    __sb.append(FieldFormatter.escapeAndEnclose(page_code==null?"null":page_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_remark==null?"null":page_remark, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_type==null?"null":page_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_target==null?"null":page_target, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_ctime==null?"null":"" + page_ctime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(page_code==null?"null":page_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_remark==null?"null":page_remark, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_type==null?"null":page_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_target==null?"null":page_target, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_ctime==null?"null":"" + page_ctime, delimiters));
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
    if (__cur_str.equals("null")) { this.page_code = null; } else {
      this.page_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.page_remark = null; } else {
      this.page_remark = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.page_type = null; } else {
      this.page_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.page_target = null; } else {
      this.page_target = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.page_ctime = null; } else {
      this.page_ctime = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.page_code = null; } else {
      this.page_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.page_remark = null; } else {
      this.page_remark = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.page_type = null; } else {
      this.page_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.page_target = null; } else {
      this.page_target = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.page_ctime = null; } else {
      this.page_ctime = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    page_dim o = (page_dim) super.clone();
    return o;
  }

  public void clone0(page_dim o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("page_code", this.page_code);
    __sqoop$field_map.put("page_remark", this.page_remark);
    __sqoop$field_map.put("page_type", this.page_type);
    __sqoop$field_map.put("page_target", this.page_target);
    __sqoop$field_map.put("page_ctime", this.page_ctime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("page_code", this.page_code);
    __sqoop$field_map.put("page_remark", this.page_remark);
    __sqoop$field_map.put("page_type", this.page_type);
    __sqoop$field_map.put("page_target", this.page_target);
    __sqoop$field_map.put("page_ctime", this.page_ctime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
