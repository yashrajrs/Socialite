package socialite.objects; /**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Structure representing basic user Youtube account information.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-10")
public class YoutubeResponse implements org.apache.thrift.TBase<YoutubeResponse, YoutubeResponse._Fields>, java.io.Serializable, Cloneable, Comparable<YoutubeResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("socialite.objects.YoutubeResponse");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VIDEOS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("videosCount", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField SUBSCRIPTION_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("subscriptionCount", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField LIKES_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("likesCount", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField COMMENTS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("commentsCount", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new YoutubeResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new YoutubeResponseTupleSchemeFactory());
  }

  private String id; // required
  private long videosCount; // optional
  private long subscriptionCount; // optional
  private long likesCount; // optional
  private long commentsCount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The unique identifier for the youtube account.
     */
    ID((short)1, "id"),
    /**
     * Count of number of videos uploaded by the user.
     */
    VIDEOS_COUNT((short)2, "videosCount"),
    /**
     * Count of number of channels subscribed by the user.
     */
    SUBSCRIPTION_COUNT((short)3, "subscriptionCount"),
    /**
     * Count of number of likes made by the user.
     */
    LIKES_COUNT((short)4, "likesCount"),
    /**
     * Count of number of comments made by the user.
     */
    COMMENTS_COUNT((short)5, "commentsCount");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // VIDEOS_COUNT
          return VIDEOS_COUNT;
        case 3: // SUBSCRIPTION_COUNT
          return SUBSCRIPTION_COUNT;
        case 4: // LIKES_COUNT
          return LIKES_COUNT;
        case 5: // COMMENTS_COUNT
          return COMMENTS_COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VIDEOSCOUNT_ISSET_ID = 0;
  private static final int __SUBSCRIPTIONCOUNT_ISSET_ID = 1;
  private static final int __LIKESCOUNT_ISSET_ID = 2;
  private static final int __COMMENTSCOUNT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.VIDEOS_COUNT,_Fields.SUBSCRIPTION_COUNT,_Fields.LIKES_COUNT,_Fields.COMMENTS_COUNT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VIDEOS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("videosCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SUBSCRIPTION_COUNT, new org.apache.thrift.meta_data.FieldMetaData("subscriptionCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LIKES_COUNT, new org.apache.thrift.meta_data.FieldMetaData("likesCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COMMENTS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("commentsCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(YoutubeResponse.class, metaDataMap);
  }

  public YoutubeResponse() {
  }

  public YoutubeResponse(
    String id)
  {
    this();
    this.id = id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public YoutubeResponse(YoutubeResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.videosCount = other.videosCount;
    this.subscriptionCount = other.subscriptionCount;
    this.likesCount = other.likesCount;
    this.commentsCount = other.commentsCount;
  }

  public YoutubeResponse deepCopy() {
    return new YoutubeResponse(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setVideosCountIsSet(false);
    this.videosCount = 0;
    setSubscriptionCountIsSet(false);
    this.subscriptionCount = 0;
    setLikesCountIsSet(false);
    this.likesCount = 0;
    setCommentsCountIsSet(false);
    this.commentsCount = 0;
  }

  /**
   * The unique identifier for the youtube account.
   */
  public String getId() {
    return this.id;
  }

  /**
   * The unique identifier for the youtube account.
   */
  public YoutubeResponse setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  /**
   * Count of number of videos uploaded by the user.
   */
  public long getVideosCount() {
    return this.videosCount;
  }

  /**
   * Count of number of videos uploaded by the user.
   */
  public YoutubeResponse setVideosCount(long videosCount) {
    this.videosCount = videosCount;
    setVideosCountIsSet(true);
    return this;
  }

  public void unsetVideosCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIDEOSCOUNT_ISSET_ID);
  }

  /** Returns true if field videosCount is set (has been assigned a value) and false otherwise */
  public boolean isSetVideosCount() {
    return EncodingUtils.testBit(__isset_bitfield, __VIDEOSCOUNT_ISSET_ID);
  }

  public void setVideosCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIDEOSCOUNT_ISSET_ID, value);
  }

  /**
   * Count of number of channels subscribed by the user.
   */
  public long getSubscriptionCount() {
    return this.subscriptionCount;
  }

  /**
   * Count of number of channels subscribed by the user.
   */
  public YoutubeResponse setSubscriptionCount(long subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
    setSubscriptionCountIsSet(true);
    return this;
  }

  public void unsetSubscriptionCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUBSCRIPTIONCOUNT_ISSET_ID);
  }

  /** Returns true if field subscriptionCount is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriptionCount() {
    return EncodingUtils.testBit(__isset_bitfield, __SUBSCRIPTIONCOUNT_ISSET_ID);
  }

  public void setSubscriptionCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUBSCRIPTIONCOUNT_ISSET_ID, value);
  }

  /**
   * Count of number of likes made by the user.
   */
  public long getLikesCount() {
    return this.likesCount;
  }

  /**
   * Count of number of likes made by the user.
   */
  public YoutubeResponse setLikesCount(long likesCount) {
    this.likesCount = likesCount;
    setLikesCountIsSet(true);
    return this;
  }

  public void unsetLikesCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LIKESCOUNT_ISSET_ID);
  }

  /** Returns true if field likesCount is set (has been assigned a value) and false otherwise */
  public boolean isSetLikesCount() {
    return EncodingUtils.testBit(__isset_bitfield, __LIKESCOUNT_ISSET_ID);
  }

  public void setLikesCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LIKESCOUNT_ISSET_ID, value);
  }

  /**
   * Count of number of comments made by the user.
   */
  public long getCommentsCount() {
    return this.commentsCount;
  }

  /**
   * Count of number of comments made by the user.
   */
  public YoutubeResponse setCommentsCount(long commentsCount) {
    this.commentsCount = commentsCount;
    setCommentsCountIsSet(true);
    return this;
  }

  public void unsetCommentsCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMMENTSCOUNT_ISSET_ID);
  }

  /** Returns true if field commentsCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCommentsCount() {
    return EncodingUtils.testBit(__isset_bitfield, __COMMENTSCOUNT_ISSET_ID);
  }

  public void setCommentsCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMMENTSCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case VIDEOS_COUNT:
      if (value == null) {
        unsetVideosCount();
      } else {
        setVideosCount((Long)value);
      }
      break;

    case SUBSCRIPTION_COUNT:
      if (value == null) {
        unsetSubscriptionCount();
      } else {
        setSubscriptionCount((Long)value);
      }
      break;

    case LIKES_COUNT:
      if (value == null) {
        unsetLikesCount();
      } else {
        setLikesCount((Long)value);
      }
      break;

    case COMMENTS_COUNT:
      if (value == null) {
        unsetCommentsCount();
      } else {
        setCommentsCount((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case VIDEOS_COUNT:
      return Long.valueOf(getVideosCount());

    case SUBSCRIPTION_COUNT:
      return Long.valueOf(getSubscriptionCount());

    case LIKES_COUNT:
      return Long.valueOf(getLikesCount());

    case COMMENTS_COUNT:
      return Long.valueOf(getCommentsCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case VIDEOS_COUNT:
      return isSetVideosCount();
    case SUBSCRIPTION_COUNT:
      return isSetSubscriptionCount();
    case LIKES_COUNT:
      return isSetLikesCount();
    case COMMENTS_COUNT:
      return isSetCommentsCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof YoutubeResponse)
      return this.equals((YoutubeResponse)that);
    return false;
  }

  public boolean equals(YoutubeResponse that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_videosCount = true && this.isSetVideosCount();
    boolean that_present_videosCount = true && that.isSetVideosCount();
    if (this_present_videosCount || that_present_videosCount) {
      if (!(this_present_videosCount && that_present_videosCount))
        return false;
      if (this.videosCount != that.videosCount)
        return false;
    }

    boolean this_present_subscriptionCount = true && this.isSetSubscriptionCount();
    boolean that_present_subscriptionCount = true && that.isSetSubscriptionCount();
    if (this_present_subscriptionCount || that_present_subscriptionCount) {
      if (!(this_present_subscriptionCount && that_present_subscriptionCount))
        return false;
      if (this.subscriptionCount != that.subscriptionCount)
        return false;
    }

    boolean this_present_likesCount = true && this.isSetLikesCount();
    boolean that_present_likesCount = true && that.isSetLikesCount();
    if (this_present_likesCount || that_present_likesCount) {
      if (!(this_present_likesCount && that_present_likesCount))
        return false;
      if (this.likesCount != that.likesCount)
        return false;
    }

    boolean this_present_commentsCount = true && this.isSetCommentsCount();
    boolean that_present_commentsCount = true && that.isSetCommentsCount();
    if (this_present_commentsCount || that_present_commentsCount) {
      if (!(this_present_commentsCount && that_present_commentsCount))
        return false;
      if (this.commentsCount != that.commentsCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_videosCount = true && (isSetVideosCount());
    list.add(present_videosCount);
    if (present_videosCount)
      list.add(videosCount);

    boolean present_subscriptionCount = true && (isSetSubscriptionCount());
    list.add(present_subscriptionCount);
    if (present_subscriptionCount)
      list.add(subscriptionCount);

    boolean present_likesCount = true && (isSetLikesCount());
    list.add(present_likesCount);
    if (present_likesCount)
      list.add(likesCount);

    boolean present_commentsCount = true && (isSetCommentsCount());
    list.add(present_commentsCount);
    if (present_commentsCount)
      list.add(commentsCount);

    return list.hashCode();
  }

  @Override
  public int compareTo(YoutubeResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVideosCount()).compareTo(other.isSetVideosCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVideosCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.videosCount, other.videosCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubscriptionCount()).compareTo(other.isSetSubscriptionCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriptionCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subscriptionCount, other.subscriptionCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLikesCount()).compareTo(other.isSetLikesCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLikesCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.likesCount, other.likesCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommentsCount()).compareTo(other.isSetCommentsCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommentsCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commentsCount, other.commentsCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("socialite.objects.YoutubeResponse(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (isSetVideosCount()) {
      if (!first) sb.append(", ");
      sb.append("videosCount:");
      sb.append(this.videosCount);
      first = false;
    }
    if (isSetSubscriptionCount()) {
      if (!first) sb.append(", ");
      sb.append("subscriptionCount:");
      sb.append(this.subscriptionCount);
      first = false;
    }
    if (isSetLikesCount()) {
      if (!first) sb.append(", ");
      sb.append("likesCount:");
      sb.append(this.likesCount);
      first = false;
    }
    if (isSetCommentsCount()) {
      if (!first) sb.append(", ");
      sb.append("commentsCount:");
      sb.append(this.commentsCount);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class YoutubeResponseStandardSchemeFactory implements SchemeFactory {
    public YoutubeResponseStandardScheme getScheme() {
      return new YoutubeResponseStandardScheme();
    }
  }

  private static class YoutubeResponseStandardScheme extends StandardScheme<YoutubeResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, YoutubeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VIDEOS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.videosCount = iprot.readI64();
              struct.setVideosCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUBSCRIPTION_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.subscriptionCount = iprot.readI64();
              struct.setSubscriptionCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LIKES_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.likesCount = iprot.readI64();
              struct.setLikesCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COMMENTS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.commentsCount = iprot.readI64();
              struct.setCommentsCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, YoutubeResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetVideosCount()) {
        oprot.writeFieldBegin(VIDEOS_COUNT_FIELD_DESC);
        oprot.writeI64(struct.videosCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSubscriptionCount()) {
        oprot.writeFieldBegin(SUBSCRIPTION_COUNT_FIELD_DESC);
        oprot.writeI64(struct.subscriptionCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLikesCount()) {
        oprot.writeFieldBegin(LIKES_COUNT_FIELD_DESC);
        oprot.writeI64(struct.likesCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCommentsCount()) {
        oprot.writeFieldBegin(COMMENTS_COUNT_FIELD_DESC);
        oprot.writeI64(struct.commentsCount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class YoutubeResponseTupleSchemeFactory implements SchemeFactory {
    public YoutubeResponseTupleScheme getScheme() {
      return new YoutubeResponseTupleScheme();
    }
  }

  private static class YoutubeResponseTupleScheme extends TupleScheme<YoutubeResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, YoutubeResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.id);
      BitSet optionals = new BitSet();
      if (struct.isSetVideosCount()) {
        optionals.set(0);
      }
      if (struct.isSetSubscriptionCount()) {
        optionals.set(1);
      }
      if (struct.isSetLikesCount()) {
        optionals.set(2);
      }
      if (struct.isSetCommentsCount()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetVideosCount()) {
        oprot.writeI64(struct.videosCount);
      }
      if (struct.isSetSubscriptionCount()) {
        oprot.writeI64(struct.subscriptionCount);
      }
      if (struct.isSetLikesCount()) {
        oprot.writeI64(struct.likesCount);
      }
      if (struct.isSetCommentsCount()) {
        oprot.writeI64(struct.commentsCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, YoutubeResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readString();
      struct.setIdIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.videosCount = iprot.readI64();
        struct.setVideosCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.subscriptionCount = iprot.readI64();
        struct.setSubscriptionCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.likesCount = iprot.readI64();
        struct.setLikesCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.commentsCount = iprot.readI64();
        struct.setCommentsCountIsSet(true);
      }
    }
  }

}

