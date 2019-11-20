// ORM class for table 'comm_dim'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 16:22:50 CST 2019
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

public class comm_dim extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("dim_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        comm_dim.this.dim_type = (String)value;
      }
    });
    setters.put("dim_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        comm_dim.this.dim_code = (String)value;
      }
    });
    setters.put("dim_remark", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        comm_dim.this.dim_remark = (String)value;
      }
    });
    setters.put("dim_ext1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        comm_dim.this.dim_ext1 = (String)value;
      }
    });
    setters.put("dim_ext2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        comm_dim.this.dim_ext2 = (String)value;
      }
    });
    setters.put("dim_ext3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        comm_dim.this.dim_ext3 = (String)value;
      }
    });
    setters.put("dim_ext4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        comm_dim.this.dim_ext4 = (String)value;
      }
    });
    setters.put("ct", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        comm_dim.this.ct = (java.sql.Timestamp)value;
      }
    });
  }
  public comm_dim() {
    init0();
  }
  private String dim_type;
  public String get_dim_type() {
    return dim_type;
  }
  public void set_dim_type(String dim_type) {
    this.dim_type = dim_type;
  }
  public comm_dim with_dim_type(String dim_type) {
    this.dim_type = dim_type;
    return this;
  }
  private String dim_code;
  public String get_dim_code() {
    return dim_code;
  }
  public void set_dim_code(String dim_code) {
    this.dim_code = dim_code;
  }
  public comm_dim with_dim_code(String dim_code) {
    this.dim_code = dim_code;
    return this;
  }
  private String dim_remark;
  public String get_dim_remark() {
    return dim_remark;
  }
  public void set_dim_remark(String dim_remark) {
    this.dim_remark = dim_remark;
  }
  public comm_dim with_dim_remark(String dim_remark) {
    this.dim_remark = dim_remark;
    return this;
  }
  private String dim_ext1;
  public String get_dim_ext1() {
    return dim_ext1;
  }
  public void set_dim_ext1(String dim_ext1) {
    this.dim_ext1 = dim_ext1;
  }
  public comm_dim with_dim_ext1(String dim_ext1) {
    this.dim_ext1 = dim_ext1;
    return this;
  }
  private String dim_ext2;
  public String get_dim_ext2() {
    return dim_ext2;
  }
  public void set_dim_ext2(String dim_ext2) {
    this.dim_ext2 = dim_ext2;
  }
  public comm_dim with_dim_ext2(String dim_ext2) {
    this.dim_ext2 = dim_ext2;
    return this;
  }
  private String dim_ext3;
  public String get_dim_ext3() {
    return dim_ext3;
  }
  public void set_dim_ext3(String dim_ext3) {
    this.dim_ext3 = dim_ext3;
  }
  public comm_dim with_dim_ext3(String dim_ext3) {
    this.dim_ext3 = dim_ext3;
    return this;
  }
  private String dim_ext4;
  public String get_dim_ext4() {
    return dim_ext4;
  }
  public void set_dim_ext4(String dim_ext4) {
    this.dim_ext4 = dim_ext4;
  }
  public comm_dim with_dim_ext4(String dim_ext4) {
    this.dim_ext4 = dim_ext4;
    return this;
  }
  private java.sql.Timestamp ct;
  public java.sql.Timestamp get_ct() {
    return ct;
  }
  public void set_ct(java.sql.Timestamp ct) {
    this.ct = ct;
  }
  public comm_dim with_ct(java.sql.Timestamp ct) {
    this.ct = ct;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof comm_dim)) {
      return false;
    }
    comm_dim that = (comm_dim) o;
    boolean equal = true;
    equal = equal && (this.dim_type == null ? that.dim_type == null : this.dim_type.equals(that.dim_type));
    equal = equal && (this.dim_code == null ? that.dim_code == null : this.dim_code.equals(that.dim_code));
    equal = equal && (this.dim_remark == null ? that.dim_remark == null : this.dim_remark.equals(that.dim_remark));
    equal = equal && (this.dim_ext1 == null ? that.dim_ext1 == null : this.dim_ext1.equals(that.dim_ext1));
    equal = equal && (this.dim_ext2 == null ? that.dim_ext2 == null : this.dim_ext2.equals(that.dim_ext2));
    equal = equal && (this.dim_ext3 == null ? that.dim_ext3 == null : this.dim_ext3.equals(that.dim_ext3));
    equal = equal && (this.dim_ext4 == null ? that.dim_ext4 == null : this.dim_ext4.equals(that.dim_ext4));
    equal = equal && (this.ct == null ? that.ct == null : this.ct.equals(that.ct));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof comm_dim)) {
      return false;
    }
    comm_dim that = (comm_dim) o;
    boolean equal = true;
    equal = equal && (this.dim_type == null ? that.dim_type == null : this.dim_type.equals(that.dim_type));
    equal = equal && (this.dim_code == null ? that.dim_code == null : this.dim_code.equals(that.dim_code));
    equal = equal && (this.dim_remark == null ? that.dim_remark == null : this.dim_remark.equals(that.dim_remark));
    equal = equal && (this.dim_ext1 == null ? that.dim_ext1 == null : this.dim_ext1.equals(that.dim_ext1));
    equal = equal && (this.dim_ext2 == null ? that.dim_ext2 == null : this.dim_ext2.equals(that.dim_ext2));
    equal = equal && (this.dim_ext3 == null ? that.dim_ext3 == null : this.dim_ext3.equals(that.dim_ext3));
    equal = equal && (this.dim_ext4 == null ? that.dim_ext4 == null : this.dim_ext4.equals(that.dim_ext4));
    equal = equal && (this.ct == null ? that.ct == null : this.ct.equals(that.ct));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dim_type = JdbcWritableBridge.readString(1, __dbResults);
    this.dim_code = JdbcWritableBridge.readString(2, __dbResults);
    this.dim_remark = JdbcWritableBridge.readString(3, __dbResults);
    this.dim_ext1 = JdbcWritableBridge.readString(4, __dbResults);
    this.dim_ext2 = JdbcWritableBridge.readString(5, __dbResults);
    this.dim_ext3 = JdbcWritableBridge.readString(6, __dbResults);
    this.dim_ext4 = JdbcWritableBridge.readString(7, __dbResults);
    this.ct = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dim_type = JdbcWritableBridge.readString(1, __dbResults);
    this.dim_code = JdbcWritableBridge.readString(2, __dbResults);
    this.dim_remark = JdbcWritableBridge.readString(3, __dbResults);
    this.dim_ext1 = JdbcWritableBridge.readString(4, __dbResults);
    this.dim_ext2 = JdbcWritableBridge.readString(5, __dbResults);
    this.dim_ext3 = JdbcWritableBridge.readString(6, __dbResults);
    this.dim_ext4 = JdbcWritableBridge.readString(7, __dbResults);
    this.ct = JdbcWritableBridge.readTimestamp(8, __dbResults);
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
    JdbcWritableBridge.writeString(dim_type, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_remark, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_ext1, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_ext2, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_ext3, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_ext4, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ct, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(dim_type, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_remark, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_ext1, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_ext2, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_ext3, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dim_ext4, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ct, 8 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.dim_type = null;
    } else {
    this.dim_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dim_code = null;
    } else {
    this.dim_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dim_remark = null;
    } else {
    this.dim_remark = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dim_ext1 = null;
    } else {
    this.dim_ext1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dim_ext2 = null;
    } else {
    this.dim_ext2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dim_ext3 = null;
    } else {
    this.dim_ext3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dim_ext4 = null;
    } else {
    this.dim_ext4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ct = null;
    } else {
    this.ct = new Timestamp(__dataIn.readLong());
    this.ct.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.dim_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_type);
    }
    if (null == this.dim_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_code);
    }
    if (null == this.dim_remark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_remark);
    }
    if (null == this.dim_ext1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_ext1);
    }
    if (null == this.dim_ext2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_ext2);
    }
    if (null == this.dim_ext3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_ext3);
    }
    if (null == this.dim_ext4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_ext4);
    }
    if (null == this.ct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ct.getTime());
    __dataOut.writeInt(this.ct.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.dim_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_type);
    }
    if (null == this.dim_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_code);
    }
    if (null == this.dim_remark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_remark);
    }
    if (null == this.dim_ext1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_ext1);
    }
    if (null == this.dim_ext2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_ext2);
    }
    if (null == this.dim_ext3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_ext3);
    }
    if (null == this.dim_ext4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dim_ext4);
    }
    if (null == this.ct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ct.getTime());
    __dataOut.writeInt(this.ct.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(dim_type==null?"null":dim_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_code==null?"null":dim_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_remark==null?"null":dim_remark, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_ext1==null?"null":dim_ext1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_ext2==null?"null":dim_ext2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_ext3==null?"null":dim_ext3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_ext4==null?"null":dim_ext4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ct==null?"null":"" + ct, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(dim_type==null?"null":dim_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_code==null?"null":dim_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_remark==null?"null":dim_remark, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_ext1==null?"null":dim_ext1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_ext2==null?"null":dim_ext2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_ext3==null?"null":dim_ext3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dim_ext4==null?"null":dim_ext4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ct==null?"null":"" + ct, delimiters));
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
    if (__cur_str.equals("null")) { this.dim_type = null; } else {
      this.dim_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_code = null; } else {
      this.dim_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_remark = null; } else {
      this.dim_remark = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_ext1 = null; } else {
      this.dim_ext1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_ext2 = null; } else {
      this.dim_ext2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_ext3 = null; } else {
      this.dim_ext3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_ext4 = null; } else {
      this.dim_ext4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ct = null; } else {
      this.ct = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.dim_type = null; } else {
      this.dim_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_code = null; } else {
      this.dim_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_remark = null; } else {
      this.dim_remark = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_ext1 = null; } else {
      this.dim_ext1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_ext2 = null; } else {
      this.dim_ext2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_ext3 = null; } else {
      this.dim_ext3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dim_ext4 = null; } else {
      this.dim_ext4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ct = null; } else {
      this.ct = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    comm_dim o = (comm_dim) super.clone();
    o.ct = (o.ct != null) ? (java.sql.Timestamp) o.ct.clone() : null;
    return o;
  }

  public void clone0(comm_dim o) throws CloneNotSupportedException {
    o.ct = (o.ct != null) ? (java.sql.Timestamp) o.ct.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("dim_type", this.dim_type);
    __sqoop$field_map.put("dim_code", this.dim_code);
    __sqoop$field_map.put("dim_remark", this.dim_remark);
    __sqoop$field_map.put("dim_ext1", this.dim_ext1);
    __sqoop$field_map.put("dim_ext2", this.dim_ext2);
    __sqoop$field_map.put("dim_ext3", this.dim_ext3);
    __sqoop$field_map.put("dim_ext4", this.dim_ext4);
    __sqoop$field_map.put("ct", this.ct);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dim_type", this.dim_type);
    __sqoop$field_map.put("dim_code", this.dim_code);
    __sqoop$field_map.put("dim_remark", this.dim_remark);
    __sqoop$field_map.put("dim_ext1", this.dim_ext1);
    __sqoop$field_map.put("dim_ext2", this.dim_ext2);
    __sqoop$field_map.put("dim_ext3", this.dim_ext3);
    __sqoop$field_map.put("dim_ext4", this.dim_ext4);
    __sqoop$field_map.put("ct", this.ct);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
