// ORM class for table 'date_dim'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 16:22:02 CST 2019
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

public class date_dim extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("date_day", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_day = (String)value;
      }
    });
    setters.put("date_day_desc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_day_desc = (String)value;
      }
    });
    setters.put("date_day_month", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_day_month = (String)value;
      }
    });
    setters.put("date_day_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_day_year = (String)value;
      }
    });
    setters.put("date_day_en", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_day_en = (String)value;
      }
    });
    setters.put("date_week", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_week = (String)value;
      }
    });
    setters.put("date_week_desc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_week_desc = (String)value;
      }
    });
    setters.put("date_month", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_month = (String)value;
      }
    });
    setters.put("date_month_en", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_month_en = (String)value;
      }
    });
    setters.put("date_month_desc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_month_desc = (String)value;
      }
    });
    setters.put("date_quarter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_quarter = (String)value;
      }
    });
    setters.put("date_quarter_en", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_quarter_en = (String)value;
      }
    });
    setters.put("date_quarter_desc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_quarter_desc = (String)value;
      }
    });
    setters.put("date_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date_dim.this.date_year = (String)value;
      }
    });
  }
  public date_dim() {
    init0();
  }
  private String date_day;
  public String get_date_day() {
    return date_day;
  }
  public void set_date_day(String date_day) {
    this.date_day = date_day;
  }
  public date_dim with_date_day(String date_day) {
    this.date_day = date_day;
    return this;
  }
  private String date_day_desc;
  public String get_date_day_desc() {
    return date_day_desc;
  }
  public void set_date_day_desc(String date_day_desc) {
    this.date_day_desc = date_day_desc;
  }
  public date_dim with_date_day_desc(String date_day_desc) {
    this.date_day_desc = date_day_desc;
    return this;
  }
  private String date_day_month;
  public String get_date_day_month() {
    return date_day_month;
  }
  public void set_date_day_month(String date_day_month) {
    this.date_day_month = date_day_month;
  }
  public date_dim with_date_day_month(String date_day_month) {
    this.date_day_month = date_day_month;
    return this;
  }
  private String date_day_year;
  public String get_date_day_year() {
    return date_day_year;
  }
  public void set_date_day_year(String date_day_year) {
    this.date_day_year = date_day_year;
  }
  public date_dim with_date_day_year(String date_day_year) {
    this.date_day_year = date_day_year;
    return this;
  }
  private String date_day_en;
  public String get_date_day_en() {
    return date_day_en;
  }
  public void set_date_day_en(String date_day_en) {
    this.date_day_en = date_day_en;
  }
  public date_dim with_date_day_en(String date_day_en) {
    this.date_day_en = date_day_en;
    return this;
  }
  private String date_week;
  public String get_date_week() {
    return date_week;
  }
  public void set_date_week(String date_week) {
    this.date_week = date_week;
  }
  public date_dim with_date_week(String date_week) {
    this.date_week = date_week;
    return this;
  }
  private String date_week_desc;
  public String get_date_week_desc() {
    return date_week_desc;
  }
  public void set_date_week_desc(String date_week_desc) {
    this.date_week_desc = date_week_desc;
  }
  public date_dim with_date_week_desc(String date_week_desc) {
    this.date_week_desc = date_week_desc;
    return this;
  }
  private String date_month;
  public String get_date_month() {
    return date_month;
  }
  public void set_date_month(String date_month) {
    this.date_month = date_month;
  }
  public date_dim with_date_month(String date_month) {
    this.date_month = date_month;
    return this;
  }
  private String date_month_en;
  public String get_date_month_en() {
    return date_month_en;
  }
  public void set_date_month_en(String date_month_en) {
    this.date_month_en = date_month_en;
  }
  public date_dim with_date_month_en(String date_month_en) {
    this.date_month_en = date_month_en;
    return this;
  }
  private String date_month_desc;
  public String get_date_month_desc() {
    return date_month_desc;
  }
  public void set_date_month_desc(String date_month_desc) {
    this.date_month_desc = date_month_desc;
  }
  public date_dim with_date_month_desc(String date_month_desc) {
    this.date_month_desc = date_month_desc;
    return this;
  }
  private String date_quarter;
  public String get_date_quarter() {
    return date_quarter;
  }
  public void set_date_quarter(String date_quarter) {
    this.date_quarter = date_quarter;
  }
  public date_dim with_date_quarter(String date_quarter) {
    this.date_quarter = date_quarter;
    return this;
  }
  private String date_quarter_en;
  public String get_date_quarter_en() {
    return date_quarter_en;
  }
  public void set_date_quarter_en(String date_quarter_en) {
    this.date_quarter_en = date_quarter_en;
  }
  public date_dim with_date_quarter_en(String date_quarter_en) {
    this.date_quarter_en = date_quarter_en;
    return this;
  }
  private String date_quarter_desc;
  public String get_date_quarter_desc() {
    return date_quarter_desc;
  }
  public void set_date_quarter_desc(String date_quarter_desc) {
    this.date_quarter_desc = date_quarter_desc;
  }
  public date_dim with_date_quarter_desc(String date_quarter_desc) {
    this.date_quarter_desc = date_quarter_desc;
    return this;
  }
  private String date_year;
  public String get_date_year() {
    return date_year;
  }
  public void set_date_year(String date_year) {
    this.date_year = date_year;
  }
  public date_dim with_date_year(String date_year) {
    this.date_year = date_year;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof date_dim)) {
      return false;
    }
    date_dim that = (date_dim) o;
    boolean equal = true;
    equal = equal && (this.date_day == null ? that.date_day == null : this.date_day.equals(that.date_day));
    equal = equal && (this.date_day_desc == null ? that.date_day_desc == null : this.date_day_desc.equals(that.date_day_desc));
    equal = equal && (this.date_day_month == null ? that.date_day_month == null : this.date_day_month.equals(that.date_day_month));
    equal = equal && (this.date_day_year == null ? that.date_day_year == null : this.date_day_year.equals(that.date_day_year));
    equal = equal && (this.date_day_en == null ? that.date_day_en == null : this.date_day_en.equals(that.date_day_en));
    equal = equal && (this.date_week == null ? that.date_week == null : this.date_week.equals(that.date_week));
    equal = equal && (this.date_week_desc == null ? that.date_week_desc == null : this.date_week_desc.equals(that.date_week_desc));
    equal = equal && (this.date_month == null ? that.date_month == null : this.date_month.equals(that.date_month));
    equal = equal && (this.date_month_en == null ? that.date_month_en == null : this.date_month_en.equals(that.date_month_en));
    equal = equal && (this.date_month_desc == null ? that.date_month_desc == null : this.date_month_desc.equals(that.date_month_desc));
    equal = equal && (this.date_quarter == null ? that.date_quarter == null : this.date_quarter.equals(that.date_quarter));
    equal = equal && (this.date_quarter_en == null ? that.date_quarter_en == null : this.date_quarter_en.equals(that.date_quarter_en));
    equal = equal && (this.date_quarter_desc == null ? that.date_quarter_desc == null : this.date_quarter_desc.equals(that.date_quarter_desc));
    equal = equal && (this.date_year == null ? that.date_year == null : this.date_year.equals(that.date_year));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof date_dim)) {
      return false;
    }
    date_dim that = (date_dim) o;
    boolean equal = true;
    equal = equal && (this.date_day == null ? that.date_day == null : this.date_day.equals(that.date_day));
    equal = equal && (this.date_day_desc == null ? that.date_day_desc == null : this.date_day_desc.equals(that.date_day_desc));
    equal = equal && (this.date_day_month == null ? that.date_day_month == null : this.date_day_month.equals(that.date_day_month));
    equal = equal && (this.date_day_year == null ? that.date_day_year == null : this.date_day_year.equals(that.date_day_year));
    equal = equal && (this.date_day_en == null ? that.date_day_en == null : this.date_day_en.equals(that.date_day_en));
    equal = equal && (this.date_week == null ? that.date_week == null : this.date_week.equals(that.date_week));
    equal = equal && (this.date_week_desc == null ? that.date_week_desc == null : this.date_week_desc.equals(that.date_week_desc));
    equal = equal && (this.date_month == null ? that.date_month == null : this.date_month.equals(that.date_month));
    equal = equal && (this.date_month_en == null ? that.date_month_en == null : this.date_month_en.equals(that.date_month_en));
    equal = equal && (this.date_month_desc == null ? that.date_month_desc == null : this.date_month_desc.equals(that.date_month_desc));
    equal = equal && (this.date_quarter == null ? that.date_quarter == null : this.date_quarter.equals(that.date_quarter));
    equal = equal && (this.date_quarter_en == null ? that.date_quarter_en == null : this.date_quarter_en.equals(that.date_quarter_en));
    equal = equal && (this.date_quarter_desc == null ? that.date_quarter_desc == null : this.date_quarter_desc.equals(that.date_quarter_desc));
    equal = equal && (this.date_year == null ? that.date_year == null : this.date_year.equals(that.date_year));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.date_day = JdbcWritableBridge.readString(1, __dbResults);
    this.date_day_desc = JdbcWritableBridge.readString(2, __dbResults);
    this.date_day_month = JdbcWritableBridge.readString(3, __dbResults);
    this.date_day_year = JdbcWritableBridge.readString(4, __dbResults);
    this.date_day_en = JdbcWritableBridge.readString(5, __dbResults);
    this.date_week = JdbcWritableBridge.readString(6, __dbResults);
    this.date_week_desc = JdbcWritableBridge.readString(7, __dbResults);
    this.date_month = JdbcWritableBridge.readString(8, __dbResults);
    this.date_month_en = JdbcWritableBridge.readString(9, __dbResults);
    this.date_month_desc = JdbcWritableBridge.readString(10, __dbResults);
    this.date_quarter = JdbcWritableBridge.readString(11, __dbResults);
    this.date_quarter_en = JdbcWritableBridge.readString(12, __dbResults);
    this.date_quarter_desc = JdbcWritableBridge.readString(13, __dbResults);
    this.date_year = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.date_day = JdbcWritableBridge.readString(1, __dbResults);
    this.date_day_desc = JdbcWritableBridge.readString(2, __dbResults);
    this.date_day_month = JdbcWritableBridge.readString(3, __dbResults);
    this.date_day_year = JdbcWritableBridge.readString(4, __dbResults);
    this.date_day_en = JdbcWritableBridge.readString(5, __dbResults);
    this.date_week = JdbcWritableBridge.readString(6, __dbResults);
    this.date_week_desc = JdbcWritableBridge.readString(7, __dbResults);
    this.date_month = JdbcWritableBridge.readString(8, __dbResults);
    this.date_month_en = JdbcWritableBridge.readString(9, __dbResults);
    this.date_month_desc = JdbcWritableBridge.readString(10, __dbResults);
    this.date_quarter = JdbcWritableBridge.readString(11, __dbResults);
    this.date_quarter_en = JdbcWritableBridge.readString(12, __dbResults);
    this.date_quarter_desc = JdbcWritableBridge.readString(13, __dbResults);
    this.date_year = JdbcWritableBridge.readString(14, __dbResults);
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
    JdbcWritableBridge.writeString(date_day, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_day_desc, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_day_month, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_day_year, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_day_en, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_week, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_week_desc, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_month, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_month_en, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_month_desc, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_quarter, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_quarter_en, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_quarter_desc, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_year, 14 + __off, 12, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(date_day, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_day_desc, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_day_month, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_day_year, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_day_en, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_week, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_week_desc, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_month, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_month_en, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_month_desc, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_quarter, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_quarter_en, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_quarter_desc, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date_year, 14 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.date_day = null;
    } else {
    this.date_day = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_day_desc = null;
    } else {
    this.date_day_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_day_month = null;
    } else {
    this.date_day_month = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_day_year = null;
    } else {
    this.date_day_year = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_day_en = null;
    } else {
    this.date_day_en = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_week = null;
    } else {
    this.date_week = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_week_desc = null;
    } else {
    this.date_week_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_month = null;
    } else {
    this.date_month = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_month_en = null;
    } else {
    this.date_month_en = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_month_desc = null;
    } else {
    this.date_month_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_quarter = null;
    } else {
    this.date_quarter = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_quarter_en = null;
    } else {
    this.date_quarter_en = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_quarter_desc = null;
    } else {
    this.date_quarter_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_year = null;
    } else {
    this.date_year = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.date_day) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day);
    }
    if (null == this.date_day_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day_desc);
    }
    if (null == this.date_day_month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day_month);
    }
    if (null == this.date_day_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day_year);
    }
    if (null == this.date_day_en) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day_en);
    }
    if (null == this.date_week) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_week);
    }
    if (null == this.date_week_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_week_desc);
    }
    if (null == this.date_month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_month);
    }
    if (null == this.date_month_en) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_month_en);
    }
    if (null == this.date_month_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_month_desc);
    }
    if (null == this.date_quarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_quarter);
    }
    if (null == this.date_quarter_en) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_quarter_en);
    }
    if (null == this.date_quarter_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_quarter_desc);
    }
    if (null == this.date_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_year);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.date_day) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day);
    }
    if (null == this.date_day_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day_desc);
    }
    if (null == this.date_day_month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day_month);
    }
    if (null == this.date_day_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day_year);
    }
    if (null == this.date_day_en) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_day_en);
    }
    if (null == this.date_week) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_week);
    }
    if (null == this.date_week_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_week_desc);
    }
    if (null == this.date_month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_month);
    }
    if (null == this.date_month_en) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_month_en);
    }
    if (null == this.date_month_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_month_desc);
    }
    if (null == this.date_quarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_quarter);
    }
    if (null == this.date_quarter_en) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_quarter_en);
    }
    if (null == this.date_quarter_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_quarter_desc);
    }
    if (null == this.date_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date_year);
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
    __sb.append(FieldFormatter.escapeAndEnclose(date_day==null?"null":date_day, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_day_desc==null?"null":date_day_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_day_month==null?"null":date_day_month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_day_year==null?"null":date_day_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_day_en==null?"null":date_day_en, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_week==null?"null":date_week, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_week_desc==null?"null":date_week_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_month==null?"null":date_month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_month_en==null?"null":date_month_en, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_month_desc==null?"null":date_month_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_quarter==null?"null":date_quarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_quarter_en==null?"null":date_quarter_en, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_quarter_desc==null?"null":date_quarter_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_year==null?"null":date_year, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(date_day==null?"null":date_day, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_day_desc==null?"null":date_day_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_day_month==null?"null":date_day_month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_day_year==null?"null":date_day_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_day_en==null?"null":date_day_en, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_week==null?"null":date_week, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_week_desc==null?"null":date_week_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_month==null?"null":date_month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_month_en==null?"null":date_month_en, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_month_desc==null?"null":date_month_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_quarter==null?"null":date_quarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_quarter_en==null?"null":date_quarter_en, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_quarter_desc==null?"null":date_quarter_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_year==null?"null":date_year, delimiters));
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
    if (__cur_str.equals("null")) { this.date_day = null; } else {
      this.date_day = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_day_desc = null; } else {
      this.date_day_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_day_month = null; } else {
      this.date_day_month = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_day_year = null; } else {
      this.date_day_year = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_day_en = null; } else {
      this.date_day_en = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_week = null; } else {
      this.date_week = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_week_desc = null; } else {
      this.date_week_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_month = null; } else {
      this.date_month = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_month_en = null; } else {
      this.date_month_en = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_month_desc = null; } else {
      this.date_month_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_quarter = null; } else {
      this.date_quarter = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_quarter_en = null; } else {
      this.date_quarter_en = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_quarter_desc = null; } else {
      this.date_quarter_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_year = null; } else {
      this.date_year = __cur_str;
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
    if (__cur_str.equals("null")) { this.date_day = null; } else {
      this.date_day = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_day_desc = null; } else {
      this.date_day_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_day_month = null; } else {
      this.date_day_month = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_day_year = null; } else {
      this.date_day_year = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_day_en = null; } else {
      this.date_day_en = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_week = null; } else {
      this.date_week = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_week_desc = null; } else {
      this.date_week_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_month = null; } else {
      this.date_month = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_month_en = null; } else {
      this.date_month_en = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_month_desc = null; } else {
      this.date_month_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_quarter = null; } else {
      this.date_quarter = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_quarter_en = null; } else {
      this.date_quarter_en = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_quarter_desc = null; } else {
      this.date_quarter_desc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date_year = null; } else {
      this.date_year = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    date_dim o = (date_dim) super.clone();
    return o;
  }

  public void clone0(date_dim o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("date_day", this.date_day);
    __sqoop$field_map.put("date_day_desc", this.date_day_desc);
    __sqoop$field_map.put("date_day_month", this.date_day_month);
    __sqoop$field_map.put("date_day_year", this.date_day_year);
    __sqoop$field_map.put("date_day_en", this.date_day_en);
    __sqoop$field_map.put("date_week", this.date_week);
    __sqoop$field_map.put("date_week_desc", this.date_week_desc);
    __sqoop$field_map.put("date_month", this.date_month);
    __sqoop$field_map.put("date_month_en", this.date_month_en);
    __sqoop$field_map.put("date_month_desc", this.date_month_desc);
    __sqoop$field_map.put("date_quarter", this.date_quarter);
    __sqoop$field_map.put("date_quarter_en", this.date_quarter_en);
    __sqoop$field_map.put("date_quarter_desc", this.date_quarter_desc);
    __sqoop$field_map.put("date_year", this.date_year);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("date_day", this.date_day);
    __sqoop$field_map.put("date_day_desc", this.date_day_desc);
    __sqoop$field_map.put("date_day_month", this.date_day_month);
    __sqoop$field_map.put("date_day_year", this.date_day_year);
    __sqoop$field_map.put("date_day_en", this.date_day_en);
    __sqoop$field_map.put("date_week", this.date_week);
    __sqoop$field_map.put("date_week_desc", this.date_week_desc);
    __sqoop$field_map.put("date_month", this.date_month);
    __sqoop$field_map.put("date_month_en", this.date_month_en);
    __sqoop$field_map.put("date_month_desc", this.date_month_desc);
    __sqoop$field_map.put("date_quarter", this.date_quarter);
    __sqoop$field_map.put("date_quarter_en", this.date_quarter_en);
    __sqoop$field_map.put("date_quarter_desc", this.date_quarter_desc);
    __sqoop$field_map.put("date_year", this.date_year);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
