// ORM class for table 'area_dim'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 16:21:16 CST 2019
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

public class area_dim extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("region_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        area_dim.this.region_code = (String)value;
      }
    });
    setters.put("region_code_desc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        area_dim.this.region_code_desc = (String)value;
      }
    });
    setters.put("region_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        area_dim.this.region_city = (String)value;
      }
    });
    setters.put("region_city_desc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        area_dim.this.region_city_desc = (String)value;
      }
    });
    setters.put("region_province", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        area_dim.this.region_province = (String)value;
      }
    });
    setters.put("region_province_desc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        area_dim.this.region_province_desc = (String)value;
      }
    });
  }
  public area_dim() {
    init0();
  }
  private String region_code;
  public String get_region_code() {
    return region_code;
  }
  public void set_region_code(String region_code) {
    this.region_code = region_code;
  }
  public area_dim with_region_code(String region_code) {
    this.region_code = region_code;
    return this;
  }
  private String region_code_desc;
  public String get_region_code_desc() {
    return region_code_desc;
  }
  public void set_region_code_desc(String region_code_desc) {
    this.region_code_desc = region_code_desc;
  }
  public area_dim with_region_code_desc(String region_code_desc) {
    this.region_code_desc = region_code_desc;
    return this;
  }
  private String region_city;
  public String get_region_city() {
    return region_city;
  }
  public void set_region_city(String region_city) {
    this.region_city = region_city;
  }
  public area_dim with_region_city(String region_city) {
    this.region_city = region_city;
    return this;
  }
  private String region_city_desc;
  public String get_region_city_desc() {
    return region_city_desc;
  }
  public void set_region_city_desc(String region_city_desc) {
    this.region_city_desc = region_city_desc;
  }
  public area_dim with_region_city_desc(String region_city_desc) {
    this.region_city_desc = region_city_desc;
    return this;
  }
  private String region_province;
  public String get_region_province() {
    return region_province;
  }
  public void set_region_province(String region_province) {
    this.region_province = region_province;
  }
  public area_dim with_region_province(String region_province) {
    this.region_province = region_province;
    return this;
  }
  private String region_province_desc;
  public String get_region_province_desc() {
    return region_province_desc;
  }
  public void set_region_province_desc(String region_province_desc) {
    this.region_province_desc = region_province_desc;
  }
  public area_dim with_region_province_desc(String region_province_desc) {
    this.region_province_desc = region_province_desc;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof area_dim)) {
      return false;
    }
    area_dim that = (area_dim) o;
    boolean equal = true;
    equal = equal && (this.region_code == null ? that.region_code == null : this.region_code.equals(that.region_code));
    equal = equal && (this.region_code_desc == null ? that.region_code_desc == null : this.region_code_desc.equals(that.region_code_desc));
    equal = equal && (this.region_city == null ? that.region_city == null : this.region_city.equals(that.region_city));
    equal = equal && (this.region_city_desc == null ? that.region_city_desc == null : this.region_city_desc.equals(that.region_city_desc));
    equal = equal && (this.region_province == null ? that.region_province == null : this.region_province.equals(that.region_province));
    equal = equal && (this.region_province_desc == null ? that.region_province_desc == null : this.region_province_desc.equals(that.region_province_desc));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof area_dim)) {
      return false;
    }
    area_dim that = (area_dim) o;
    boolean equal = true;
    equal = equal && (this.region_code == null ? that.region_code == null : this.region_code.equals(that.region_code));
    equal = equal && (this.region_code_desc == null ? that.region_code_desc == null : this.region_code_desc.equals(that.region_code_desc));
    equal = equal && (this.region_city == null ? that.region_city == null : this.region_city.equals(that.region_city));
    equal = equal && (this.region_city_desc == null ? that.region_city_desc == null : this.region_city_desc.equals(that.region_city_desc));
    equal = equal && (this.region_province == null ? that.region_province == null : this.region_province.equals(that.region_province));
    equal = equal && (this.region_province_desc == null ? that.region_province_desc == null : this.region_province_desc.equals(that.region_province_desc));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.region_code = JdbcWritableBridge.readString(1, __dbResults);
    this.region_code_desc = JdbcWritableBridge.readString(2, __dbResults);
    this.region_city = JdbcWritableBridge.readString(3, __dbResults);
    this.region_city_desc = JdbcWritableBridge.readString(4, __dbResults);
    this.region_province = JdbcWritableBridge.readString(5, __dbResults);
    this.region_province_desc = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.region_code = JdbcWritableBridge.readString(1, __dbResults);
    this.region_code_desc = JdbcWritableBridge.readString(2, __dbResults);
    this.region_city = JdbcWritableBridge.readString(3, __dbResults);
    this.region_city_desc = JdbcWritableBridge.readString(4, __dbResults);
    this.region_province = JdbcWritableBridge.readString(5, __dbResults);
    this.region_province_desc = JdbcWritableBridge.readString(6, __dbResults);
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
    JdbcWritableBridge.writeString(region_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_code_desc, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_city, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_city_desc, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_province, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_province_desc, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(region_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_code_desc, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_city, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_city_desc, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_province, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_province_desc, 6 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.region_code = null;
    } else {
    this.region_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region_code_desc = null;
    } else {
    this.region_code_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region_city = null;
    } else {
    this.region_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region_city_desc = null;
    } else {
    this.region_city_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region_province = null;
    } else {
    this.region_province = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region_province_desc = null;
    } else {
    this.region_province_desc = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.region_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_code);
    }
    if (null == this.region_code_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_code_desc);
    }
    if (null == this.region_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_city);
    }
    if (null == this.region_city_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_city_desc);
    }
    if (null == this.region_province) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_province);
    }
    if (null == this.region_province_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_province_desc);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.region_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_code);
    }
    if (null == this.region_code_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_code_desc);
    }
    if (null == this.region_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_city);
    }
    if (null == this.region_city_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_city_desc);
    }
    if (null == this.region_province) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_province);
    }
    if (null == this.region_province_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_province_desc);
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
    __sb.append(FieldFormatter.escapeAndEnclose(region_code==null?"null":region_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_code_desc==null?"null":region_code_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_city==null?"null":region_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_city_desc==null?"null":region_city_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_province==null?"null":region_province, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_province_desc==null?"null":region_province_desc, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(region_code==null?"null":region_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_code_desc==null?"null":region_code_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_city==null?"null":region_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_city_desc==null?"null":region_city_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_province==null?"null":region_province, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_province_desc==null?"null":region_province_desc, delimiters));
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
    if (__cur_str.equals("null")) { this.region_code = null; } else {
      this.region_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_code_desc = null; } else {
      this.region_code_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_city = null; } else {
      this.region_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_city_desc = null; } else {
      this.region_city_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_province = null; } else {
      this.region_province = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_province_desc = null; } else {
      this.region_province_desc = __cur_str;
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
    if (__cur_str.equals("null")) { this.region_code = null; } else {
      this.region_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_code_desc = null; } else {
      this.region_code_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_city = null; } else {
      this.region_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_city_desc = null; } else {
      this.region_city_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_province = null; } else {
      this.region_province = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region_province_desc = null; } else {
      this.region_province_desc = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    area_dim o = (area_dim) super.clone();
    return o;
  }

  public void clone0(area_dim o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("region_code", this.region_code);
    __sqoop$field_map.put("region_code_desc", this.region_code_desc);
    __sqoop$field_map.put("region_city", this.region_city);
    __sqoop$field_map.put("region_city_desc", this.region_city_desc);
    __sqoop$field_map.put("region_province", this.region_province);
    __sqoop$field_map.put("region_province_desc", this.region_province_desc);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("region_code", this.region_code);
    __sqoop$field_map.put("region_code_desc", this.region_code_desc);
    __sqoop$field_map.put("region_city", this.region_city);
    __sqoop$field_map.put("region_city_desc", this.region_city_desc);
    __sqoop$field_map.put("region_province", this.region_province);
    __sqoop$field_map.put("region_province_desc", this.region_province_desc);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
