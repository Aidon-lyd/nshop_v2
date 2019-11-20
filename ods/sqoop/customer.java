// ORM class for table 'customer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 19 16:12:28 CST 2019
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

public class customer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("customer_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_id = (String)value;
      }
    });
    setters.put("customer_login", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_login = (String)value;
      }
    });
    setters.put("customer_nickname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_nickname = (String)value;
      }
    });
    setters.put("customer_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_name = (String)value;
      }
    });
    setters.put("customer_pass", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_pass = (String)value;
      }
    });
    setters.put("customer_mobile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_mobile = (String)value;
      }
    });
    setters.put("customer_idcard", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_idcard = (String)value;
      }
    });
    setters.put("customer_gender", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_gender = (Integer)value;
      }
    });
    setters.put("customer_birthday", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_birthday = (String)value;
      }
    });
    setters.put("customer_age", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_age = (Integer)value;
      }
    });
    setters.put("customer_age_range", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_age_range = (String)value;
      }
    });
    setters.put("customer_email", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_email = (String)value;
      }
    });
    setters.put("customer_natives", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_natives = (String)value;
      }
    });
    setters.put("customer_ctime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_ctime = (Long)value;
      }
    });
    setters.put("customer_utime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_utime = (Long)value;
      }
    });
    setters.put("customer_device_num", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer.this.customer_device_num = (String)value;
      }
    });
  }
  public customer() {
    init0();
  }
  private String customer_id;
  public String get_customer_id() {
    return customer_id;
  }
  public void set_customer_id(String customer_id) {
    this.customer_id = customer_id;
  }
  public customer with_customer_id(String customer_id) {
    this.customer_id = customer_id;
    return this;
  }
  private String customer_login;
  public String get_customer_login() {
    return customer_login;
  }
  public void set_customer_login(String customer_login) {
    this.customer_login = customer_login;
  }
  public customer with_customer_login(String customer_login) {
    this.customer_login = customer_login;
    return this;
  }
  private String customer_nickname;
  public String get_customer_nickname() {
    return customer_nickname;
  }
  public void set_customer_nickname(String customer_nickname) {
    this.customer_nickname = customer_nickname;
  }
  public customer with_customer_nickname(String customer_nickname) {
    this.customer_nickname = customer_nickname;
    return this;
  }
  private String customer_name;
  public String get_customer_name() {
    return customer_name;
  }
  public void set_customer_name(String customer_name) {
    this.customer_name = customer_name;
  }
  public customer with_customer_name(String customer_name) {
    this.customer_name = customer_name;
    return this;
  }
  private String customer_pass;
  public String get_customer_pass() {
    return customer_pass;
  }
  public void set_customer_pass(String customer_pass) {
    this.customer_pass = customer_pass;
  }
  public customer with_customer_pass(String customer_pass) {
    this.customer_pass = customer_pass;
    return this;
  }
  private String customer_mobile;
  public String get_customer_mobile() {
    return customer_mobile;
  }
  public void set_customer_mobile(String customer_mobile) {
    this.customer_mobile = customer_mobile;
  }
  public customer with_customer_mobile(String customer_mobile) {
    this.customer_mobile = customer_mobile;
    return this;
  }
  private String customer_idcard;
  public String get_customer_idcard() {
    return customer_idcard;
  }
  public void set_customer_idcard(String customer_idcard) {
    this.customer_idcard = customer_idcard;
  }
  public customer with_customer_idcard(String customer_idcard) {
    this.customer_idcard = customer_idcard;
    return this;
  }
  private Integer customer_gender;
  public Integer get_customer_gender() {
    return customer_gender;
  }
  public void set_customer_gender(Integer customer_gender) {
    this.customer_gender = customer_gender;
  }
  public customer with_customer_gender(Integer customer_gender) {
    this.customer_gender = customer_gender;
    return this;
  }
  private String customer_birthday;
  public String get_customer_birthday() {
    return customer_birthday;
  }
  public void set_customer_birthday(String customer_birthday) {
    this.customer_birthday = customer_birthday;
  }
  public customer with_customer_birthday(String customer_birthday) {
    this.customer_birthday = customer_birthday;
    return this;
  }
  private Integer customer_age;
  public Integer get_customer_age() {
    return customer_age;
  }
  public void set_customer_age(Integer customer_age) {
    this.customer_age = customer_age;
  }
  public customer with_customer_age(Integer customer_age) {
    this.customer_age = customer_age;
    return this;
  }
  private String customer_age_range;
  public String get_customer_age_range() {
    return customer_age_range;
  }
  public void set_customer_age_range(String customer_age_range) {
    this.customer_age_range = customer_age_range;
  }
  public customer with_customer_age_range(String customer_age_range) {
    this.customer_age_range = customer_age_range;
    return this;
  }
  private String customer_email;
  public String get_customer_email() {
    return customer_email;
  }
  public void set_customer_email(String customer_email) {
    this.customer_email = customer_email;
  }
  public customer with_customer_email(String customer_email) {
    this.customer_email = customer_email;
    return this;
  }
  private String customer_natives;
  public String get_customer_natives() {
    return customer_natives;
  }
  public void set_customer_natives(String customer_natives) {
    this.customer_natives = customer_natives;
  }
  public customer with_customer_natives(String customer_natives) {
    this.customer_natives = customer_natives;
    return this;
  }
  private Long customer_ctime;
  public Long get_customer_ctime() {
    return customer_ctime;
  }
  public void set_customer_ctime(Long customer_ctime) {
    this.customer_ctime = customer_ctime;
  }
  public customer with_customer_ctime(Long customer_ctime) {
    this.customer_ctime = customer_ctime;
    return this;
  }
  private Long customer_utime;
  public Long get_customer_utime() {
    return customer_utime;
  }
  public void set_customer_utime(Long customer_utime) {
    this.customer_utime = customer_utime;
  }
  public customer with_customer_utime(Long customer_utime) {
    this.customer_utime = customer_utime;
    return this;
  }
  private String customer_device_num;
  public String get_customer_device_num() {
    return customer_device_num;
  }
  public void set_customer_device_num(String customer_device_num) {
    this.customer_device_num = customer_device_num;
  }
  public customer with_customer_device_num(String customer_device_num) {
    this.customer_device_num = customer_device_num;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customer)) {
      return false;
    }
    customer that = (customer) o;
    boolean equal = true;
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.customer_login == null ? that.customer_login == null : this.customer_login.equals(that.customer_login));
    equal = equal && (this.customer_nickname == null ? that.customer_nickname == null : this.customer_nickname.equals(that.customer_nickname));
    equal = equal && (this.customer_name == null ? that.customer_name == null : this.customer_name.equals(that.customer_name));
    equal = equal && (this.customer_pass == null ? that.customer_pass == null : this.customer_pass.equals(that.customer_pass));
    equal = equal && (this.customer_mobile == null ? that.customer_mobile == null : this.customer_mobile.equals(that.customer_mobile));
    equal = equal && (this.customer_idcard == null ? that.customer_idcard == null : this.customer_idcard.equals(that.customer_idcard));
    equal = equal && (this.customer_gender == null ? that.customer_gender == null : this.customer_gender.equals(that.customer_gender));
    equal = equal && (this.customer_birthday == null ? that.customer_birthday == null : this.customer_birthday.equals(that.customer_birthday));
    equal = equal && (this.customer_age == null ? that.customer_age == null : this.customer_age.equals(that.customer_age));
    equal = equal && (this.customer_age_range == null ? that.customer_age_range == null : this.customer_age_range.equals(that.customer_age_range));
    equal = equal && (this.customer_email == null ? that.customer_email == null : this.customer_email.equals(that.customer_email));
    equal = equal && (this.customer_natives == null ? that.customer_natives == null : this.customer_natives.equals(that.customer_natives));
    equal = equal && (this.customer_ctime == null ? that.customer_ctime == null : this.customer_ctime.equals(that.customer_ctime));
    equal = equal && (this.customer_utime == null ? that.customer_utime == null : this.customer_utime.equals(that.customer_utime));
    equal = equal && (this.customer_device_num == null ? that.customer_device_num == null : this.customer_device_num.equals(that.customer_device_num));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customer)) {
      return false;
    }
    customer that = (customer) o;
    boolean equal = true;
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.customer_login == null ? that.customer_login == null : this.customer_login.equals(that.customer_login));
    equal = equal && (this.customer_nickname == null ? that.customer_nickname == null : this.customer_nickname.equals(that.customer_nickname));
    equal = equal && (this.customer_name == null ? that.customer_name == null : this.customer_name.equals(that.customer_name));
    equal = equal && (this.customer_pass == null ? that.customer_pass == null : this.customer_pass.equals(that.customer_pass));
    equal = equal && (this.customer_mobile == null ? that.customer_mobile == null : this.customer_mobile.equals(that.customer_mobile));
    equal = equal && (this.customer_idcard == null ? that.customer_idcard == null : this.customer_idcard.equals(that.customer_idcard));
    equal = equal && (this.customer_gender == null ? that.customer_gender == null : this.customer_gender.equals(that.customer_gender));
    equal = equal && (this.customer_birthday == null ? that.customer_birthday == null : this.customer_birthday.equals(that.customer_birthday));
    equal = equal && (this.customer_age == null ? that.customer_age == null : this.customer_age.equals(that.customer_age));
    equal = equal && (this.customer_age_range == null ? that.customer_age_range == null : this.customer_age_range.equals(that.customer_age_range));
    equal = equal && (this.customer_email == null ? that.customer_email == null : this.customer_email.equals(that.customer_email));
    equal = equal && (this.customer_natives == null ? that.customer_natives == null : this.customer_natives.equals(that.customer_natives));
    equal = equal && (this.customer_ctime == null ? that.customer_ctime == null : this.customer_ctime.equals(that.customer_ctime));
    equal = equal && (this.customer_utime == null ? that.customer_utime == null : this.customer_utime.equals(that.customer_utime));
    equal = equal && (this.customer_device_num == null ? that.customer_device_num == null : this.customer_device_num.equals(that.customer_device_num));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.customer_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_login = JdbcWritableBridge.readString(2, __dbResults);
    this.customer_nickname = JdbcWritableBridge.readString(3, __dbResults);
    this.customer_name = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_pass = JdbcWritableBridge.readString(5, __dbResults);
    this.customer_mobile = JdbcWritableBridge.readString(6, __dbResults);
    this.customer_idcard = JdbcWritableBridge.readString(7, __dbResults);
    this.customer_gender = JdbcWritableBridge.readInteger(8, __dbResults);
    this.customer_birthday = JdbcWritableBridge.readString(9, __dbResults);
    this.customer_age = JdbcWritableBridge.readInteger(10, __dbResults);
    this.customer_age_range = JdbcWritableBridge.readString(11, __dbResults);
    this.customer_email = JdbcWritableBridge.readString(12, __dbResults);
    this.customer_natives = JdbcWritableBridge.readString(13, __dbResults);
    this.customer_ctime = JdbcWritableBridge.readLong(14, __dbResults);
    this.customer_utime = JdbcWritableBridge.readLong(15, __dbResults);
    this.customer_device_num = JdbcWritableBridge.readString(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.customer_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_login = JdbcWritableBridge.readString(2, __dbResults);
    this.customer_nickname = JdbcWritableBridge.readString(3, __dbResults);
    this.customer_name = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_pass = JdbcWritableBridge.readString(5, __dbResults);
    this.customer_mobile = JdbcWritableBridge.readString(6, __dbResults);
    this.customer_idcard = JdbcWritableBridge.readString(7, __dbResults);
    this.customer_gender = JdbcWritableBridge.readInteger(8, __dbResults);
    this.customer_birthday = JdbcWritableBridge.readString(9, __dbResults);
    this.customer_age = JdbcWritableBridge.readInteger(10, __dbResults);
    this.customer_age_range = JdbcWritableBridge.readString(11, __dbResults);
    this.customer_email = JdbcWritableBridge.readString(12, __dbResults);
    this.customer_natives = JdbcWritableBridge.readString(13, __dbResults);
    this.customer_ctime = JdbcWritableBridge.readLong(14, __dbResults);
    this.customer_utime = JdbcWritableBridge.readLong(15, __dbResults);
    this.customer_device_num = JdbcWritableBridge.readString(16, __dbResults);
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
    JdbcWritableBridge.writeString(customer_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_login, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_nickname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_pass, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_mobile, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_idcard, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(customer_gender, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(customer_birthday, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(customer_age, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(customer_age_range, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_email, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_natives, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(customer_ctime, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(customer_utime, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(customer_device_num, 16 + __off, 12, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(customer_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_login, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_nickname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_pass, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_mobile, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_idcard, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(customer_gender, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(customer_birthday, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(customer_age, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(customer_age_range, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_email, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_natives, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(customer_ctime, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(customer_utime, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(customer_device_num, 16 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.customer_id = null;
    } else {
    this.customer_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_login = null;
    } else {
    this.customer_login = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_nickname = null;
    } else {
    this.customer_nickname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_name = null;
    } else {
    this.customer_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_pass = null;
    } else {
    this.customer_pass = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_mobile = null;
    } else {
    this.customer_mobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_idcard = null;
    } else {
    this.customer_idcard = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_gender = null;
    } else {
    this.customer_gender = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.customer_birthday = null;
    } else {
    this.customer_birthday = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_age = null;
    } else {
    this.customer_age = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.customer_age_range = null;
    } else {
    this.customer_age_range = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_email = null;
    } else {
    this.customer_email = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_natives = null;
    } else {
    this.customer_natives = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_ctime = null;
    } else {
    this.customer_ctime = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.customer_utime = null;
    } else {
    this.customer_utime = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.customer_device_num = null;
    } else {
    this.customer_device_num = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
    }
    if (null == this.customer_login) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_login);
    }
    if (null == this.customer_nickname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_nickname);
    }
    if (null == this.customer_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_name);
    }
    if (null == this.customer_pass) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_pass);
    }
    if (null == this.customer_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_mobile);
    }
    if (null == this.customer_idcard) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_idcard);
    }
    if (null == this.customer_gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_gender);
    }
    if (null == this.customer_birthday) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_birthday);
    }
    if (null == this.customer_age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_age);
    }
    if (null == this.customer_age_range) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_age_range);
    }
    if (null == this.customer_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_email);
    }
    if (null == this.customer_natives) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_natives);
    }
    if (null == this.customer_ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.customer_ctime);
    }
    if (null == this.customer_utime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.customer_utime);
    }
    if (null == this.customer_device_num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_device_num);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
    }
    if (null == this.customer_login) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_login);
    }
    if (null == this.customer_nickname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_nickname);
    }
    if (null == this.customer_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_name);
    }
    if (null == this.customer_pass) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_pass);
    }
    if (null == this.customer_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_mobile);
    }
    if (null == this.customer_idcard) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_idcard);
    }
    if (null == this.customer_gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_gender);
    }
    if (null == this.customer_birthday) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_birthday);
    }
    if (null == this.customer_age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_age);
    }
    if (null == this.customer_age_range) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_age_range);
    }
    if (null == this.customer_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_email);
    }
    if (null == this.customer_natives) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_natives);
    }
    if (null == this.customer_ctime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.customer_ctime);
    }
    if (null == this.customer_utime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.customer_utime);
    }
    if (null == this.customer_device_num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_device_num);
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
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_login==null?"null":customer_login, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_nickname==null?"null":customer_nickname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_name==null?"null":customer_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_pass==null?"null":customer_pass, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_mobile==null?"null":customer_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_idcard==null?"null":customer_idcard, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_gender==null?"null":"" + customer_gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_birthday==null?"null":customer_birthday, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_age==null?"null":"" + customer_age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_age_range==null?"null":customer_age_range, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_email==null?"null":customer_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_natives==null?"null":customer_natives, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_ctime==null?"null":"" + customer_ctime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_utime==null?"null":"" + customer_utime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_device_num==null?"null":customer_device_num, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_login==null?"null":customer_login, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_nickname==null?"null":customer_nickname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_name==null?"null":customer_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_pass==null?"null":customer_pass, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_mobile==null?"null":customer_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_idcard==null?"null":customer_idcard, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_gender==null?"null":"" + customer_gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_birthday==null?"null":customer_birthday, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_age==null?"null":"" + customer_age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_age_range==null?"null":customer_age_range, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_email==null?"null":customer_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_natives==null?"null":customer_natives, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_ctime==null?"null":"" + customer_ctime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_utime==null?"null":"" + customer_utime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_device_num==null?"null":customer_device_num, delimiters));
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
    if (__cur_str.equals("null")) { this.customer_id = null; } else {
      this.customer_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_login = null; } else {
      this.customer_login = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_nickname = null; } else {
      this.customer_nickname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_name = null; } else {
      this.customer_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_pass = null; } else {
      this.customer_pass = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_mobile = null; } else {
      this.customer_mobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_idcard = null; } else {
      this.customer_idcard = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_gender = null; } else {
      this.customer_gender = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_birthday = null; } else {
      this.customer_birthday = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_age = null; } else {
      this.customer_age = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_age_range = null; } else {
      this.customer_age_range = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_email = null; } else {
      this.customer_email = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_natives = null; } else {
      this.customer_natives = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_ctime = null; } else {
      this.customer_ctime = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_utime = null; } else {
      this.customer_utime = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_device_num = null; } else {
      this.customer_device_num = __cur_str;
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
    if (__cur_str.equals("null")) { this.customer_id = null; } else {
      this.customer_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_login = null; } else {
      this.customer_login = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_nickname = null; } else {
      this.customer_nickname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_name = null; } else {
      this.customer_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_pass = null; } else {
      this.customer_pass = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_mobile = null; } else {
      this.customer_mobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_idcard = null; } else {
      this.customer_idcard = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_gender = null; } else {
      this.customer_gender = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_birthday = null; } else {
      this.customer_birthday = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_age = null; } else {
      this.customer_age = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_age_range = null; } else {
      this.customer_age_range = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_email = null; } else {
      this.customer_email = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_natives = null; } else {
      this.customer_natives = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_ctime = null; } else {
      this.customer_ctime = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_utime = null; } else {
      this.customer_utime = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_device_num = null; } else {
      this.customer_device_num = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    customer o = (customer) super.clone();
    return o;
  }

  public void clone0(customer o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("customer_login", this.customer_login);
    __sqoop$field_map.put("customer_nickname", this.customer_nickname);
    __sqoop$field_map.put("customer_name", this.customer_name);
    __sqoop$field_map.put("customer_pass", this.customer_pass);
    __sqoop$field_map.put("customer_mobile", this.customer_mobile);
    __sqoop$field_map.put("customer_idcard", this.customer_idcard);
    __sqoop$field_map.put("customer_gender", this.customer_gender);
    __sqoop$field_map.put("customer_birthday", this.customer_birthday);
    __sqoop$field_map.put("customer_age", this.customer_age);
    __sqoop$field_map.put("customer_age_range", this.customer_age_range);
    __sqoop$field_map.put("customer_email", this.customer_email);
    __sqoop$field_map.put("customer_natives", this.customer_natives);
    __sqoop$field_map.put("customer_ctime", this.customer_ctime);
    __sqoop$field_map.put("customer_utime", this.customer_utime);
    __sqoop$field_map.put("customer_device_num", this.customer_device_num);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("customer_login", this.customer_login);
    __sqoop$field_map.put("customer_nickname", this.customer_nickname);
    __sqoop$field_map.put("customer_name", this.customer_name);
    __sqoop$field_map.put("customer_pass", this.customer_pass);
    __sqoop$field_map.put("customer_mobile", this.customer_mobile);
    __sqoop$field_map.put("customer_idcard", this.customer_idcard);
    __sqoop$field_map.put("customer_gender", this.customer_gender);
    __sqoop$field_map.put("customer_birthday", this.customer_birthday);
    __sqoop$field_map.put("customer_age", this.customer_age);
    __sqoop$field_map.put("customer_age_range", this.customer_age_range);
    __sqoop$field_map.put("customer_email", this.customer_email);
    __sqoop$field_map.put("customer_natives", this.customer_natives);
    __sqoop$field_map.put("customer_ctime", this.customer_ctime);
    __sqoop$field_map.put("customer_utime", this.customer_utime);
    __sqoop$field_map.put("customer_device_num", this.customer_device_num);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
