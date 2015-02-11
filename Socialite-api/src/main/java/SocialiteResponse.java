/**
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
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Structure representing basic user Socialite account information.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-10")
public class SocialiteResponse implements org.apache.thrift.TBase<SocialiteResponse, SocialiteResponse._Fields>, java.io.Serializable, Cloneable, Comparable<SocialiteResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SocialiteResponse");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FACEBOOK_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("facebookResponse", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField LINKED_IN_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("linkedInResponse", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField QUORA_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("quoraResponse", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField TWITTER_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("twitterResponse", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField YOUTUBE_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("youtubeResponse", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SocialiteResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SocialiteResponseTupleSchemeFactory());
  }

  private String id; // required
  private FacebookResponse facebookResponse; // optional
  private LinkedInResponse linkedInResponse; // optional
  private QuoraResponse quoraResponse; // optional
  private TwitterResponse twitterResponse; // optional
  private YoutubeResponse youtubeResponse; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The unique identifier for the socialite account.
     */
    ID((short)1, "id"),
    /**
     * The facebook basic information of the user.
     */
    FACEBOOK_RESPONSE((short)2, "facebookResponse"),
    /**
     * The facebook basic information of the user.
     */
    LINKED_IN_RESPONSE((short)3, "linkedInResponse"),
    /**
     * The facebook basic information of the user.
     */
    QUORA_RESPONSE((short)4, "quoraResponse"),
    /**
     * The facebook basic information of the user.
     */
    TWITTER_RESPONSE((short)5, "twitterResponse"),
    /**
     * The facebook basic information of the user.
     */
    YOUTUBE_RESPONSE((short)6, "youtubeResponse");

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
        case 2: // FACEBOOK_RESPONSE
          return FACEBOOK_RESPONSE;
        case 3: // LINKED_IN_RESPONSE
          return LINKED_IN_RESPONSE;
        case 4: // QUORA_RESPONSE
          return QUORA_RESPONSE;
        case 5: // TWITTER_RESPONSE
          return TWITTER_RESPONSE;
        case 6: // YOUTUBE_RESPONSE
          return YOUTUBE_RESPONSE;
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
  private static final _Fields optionals[] = {_Fields.FACEBOOK_RESPONSE,_Fields.LINKED_IN_RESPONSE,_Fields.QUORA_RESPONSE,_Fields.TWITTER_RESPONSE,_Fields.YOUTUBE_RESPONSE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FACEBOOK_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("facebookResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FacebookResponse.class)));
    tmpMap.put(_Fields.LINKED_IN_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("linkedInResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LinkedInResponse.class)));
    tmpMap.put(_Fields.QUORA_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("quoraResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, QuoraResponse.class)));
    tmpMap.put(_Fields.TWITTER_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("twitterResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TwitterResponse.class)));
    tmpMap.put(_Fields.YOUTUBE_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("youtubeResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, YoutubeResponse.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SocialiteResponse.class, metaDataMap);
  }

  public SocialiteResponse() {
  }

  public SocialiteResponse(
    String id)
  {
    this();
    this.id = id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SocialiteResponse(SocialiteResponse other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetFacebookResponse()) {
      this.facebookResponse = new FacebookResponse(other.facebookResponse);
    }
    if (other.isSetLinkedInResponse()) {
      this.linkedInResponse = new LinkedInResponse(other.linkedInResponse);
    }
    if (other.isSetQuoraResponse()) {
      this.quoraResponse = new QuoraResponse(other.quoraResponse);
    }
    if (other.isSetTwitterResponse()) {
      this.twitterResponse = new TwitterResponse(other.twitterResponse);
    }
    if (other.isSetYoutubeResponse()) {
      this.youtubeResponse = new YoutubeResponse(other.youtubeResponse);
    }
  }

  public SocialiteResponse deepCopy() {
    return new SocialiteResponse(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.facebookResponse = null;
    this.linkedInResponse = null;
    this.quoraResponse = null;
    this.twitterResponse = null;
    this.youtubeResponse = null;
  }

  /**
   * The unique identifier for the socialite account.
   */
  public String getId() {
    return this.id;
  }

  /**
   * The unique identifier for the socialite account.
   */
  public SocialiteResponse setId(String id) {
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
   * The facebook basic information of the user.
   */
  public FacebookResponse getFacebookResponse() {
    return this.facebookResponse;
  }

  /**
   * The facebook basic information of the user.
   */
  public SocialiteResponse setFacebookResponse(FacebookResponse facebookResponse) {
    this.facebookResponse = facebookResponse;
    return this;
  }

  public void unsetFacebookResponse() {
    this.facebookResponse = null;
  }

  /** Returns true if field facebookResponse is set (has been assigned a value) and false otherwise */
  public boolean isSetFacebookResponse() {
    return this.facebookResponse != null;
  }

  public void setFacebookResponseIsSet(boolean value) {
    if (!value) {
      this.facebookResponse = null;
    }
  }

  /**
   * The facebook basic information of the user.
   */
  public LinkedInResponse getLinkedInResponse() {
    return this.linkedInResponse;
  }

  /**
   * The facebook basic information of the user.
   */
  public SocialiteResponse setLinkedInResponse(LinkedInResponse linkedInResponse) {
    this.linkedInResponse = linkedInResponse;
    return this;
  }

  public void unsetLinkedInResponse() {
    this.linkedInResponse = null;
  }

  /** Returns true if field linkedInResponse is set (has been assigned a value) and false otherwise */
  public boolean isSetLinkedInResponse() {
    return this.linkedInResponse != null;
  }

  public void setLinkedInResponseIsSet(boolean value) {
    if (!value) {
      this.linkedInResponse = null;
    }
  }

  /**
   * The facebook basic information of the user.
   */
  public QuoraResponse getQuoraResponse() {
    return this.quoraResponse;
  }

  /**
   * The facebook basic information of the user.
   */
  public SocialiteResponse setQuoraResponse(QuoraResponse quoraResponse) {
    this.quoraResponse = quoraResponse;
    return this;
  }

  public void unsetQuoraResponse() {
    this.quoraResponse = null;
  }

  /** Returns true if field quoraResponse is set (has been assigned a value) and false otherwise */
  public boolean isSetQuoraResponse() {
    return this.quoraResponse != null;
  }

  public void setQuoraResponseIsSet(boolean value) {
    if (!value) {
      this.quoraResponse = null;
    }
  }

  /**
   * The facebook basic information of the user.
   */
  public TwitterResponse getTwitterResponse() {
    return this.twitterResponse;
  }

  /**
   * The facebook basic information of the user.
   */
  public SocialiteResponse setTwitterResponse(TwitterResponse twitterResponse) {
    this.twitterResponse = twitterResponse;
    return this;
  }

  public void unsetTwitterResponse() {
    this.twitterResponse = null;
  }

  /** Returns true if field twitterResponse is set (has been assigned a value) and false otherwise */
  public boolean isSetTwitterResponse() {
    return this.twitterResponse != null;
  }

  public void setTwitterResponseIsSet(boolean value) {
    if (!value) {
      this.twitterResponse = null;
    }
  }

  /**
   * The facebook basic information of the user.
   */
  public YoutubeResponse getYoutubeResponse() {
    return this.youtubeResponse;
  }

  /**
   * The facebook basic information of the user.
   */
  public SocialiteResponse setYoutubeResponse(YoutubeResponse youtubeResponse) {
    this.youtubeResponse = youtubeResponse;
    return this;
  }

  public void unsetYoutubeResponse() {
    this.youtubeResponse = null;
  }

  /** Returns true if field youtubeResponse is set (has been assigned a value) and false otherwise */
  public boolean isSetYoutubeResponse() {
    return this.youtubeResponse != null;
  }

  public void setYoutubeResponseIsSet(boolean value) {
    if (!value) {
      this.youtubeResponse = null;
    }
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

    case FACEBOOK_RESPONSE:
      if (value == null) {
        unsetFacebookResponse();
      } else {
        setFacebookResponse((FacebookResponse)value);
      }
      break;

    case LINKED_IN_RESPONSE:
      if (value == null) {
        unsetLinkedInResponse();
      } else {
        setLinkedInResponse((LinkedInResponse)value);
      }
      break;

    case QUORA_RESPONSE:
      if (value == null) {
        unsetQuoraResponse();
      } else {
        setQuoraResponse((QuoraResponse)value);
      }
      break;

    case TWITTER_RESPONSE:
      if (value == null) {
        unsetTwitterResponse();
      } else {
        setTwitterResponse((TwitterResponse)value);
      }
      break;

    case YOUTUBE_RESPONSE:
      if (value == null) {
        unsetYoutubeResponse();
      } else {
        setYoutubeResponse((YoutubeResponse)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case FACEBOOK_RESPONSE:
      return getFacebookResponse();

    case LINKED_IN_RESPONSE:
      return getLinkedInResponse();

    case QUORA_RESPONSE:
      return getQuoraResponse();

    case TWITTER_RESPONSE:
      return getTwitterResponse();

    case YOUTUBE_RESPONSE:
      return getYoutubeResponse();

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
    case FACEBOOK_RESPONSE:
      return isSetFacebookResponse();
    case LINKED_IN_RESPONSE:
      return isSetLinkedInResponse();
    case QUORA_RESPONSE:
      return isSetQuoraResponse();
    case TWITTER_RESPONSE:
      return isSetTwitterResponse();
    case YOUTUBE_RESPONSE:
      return isSetYoutubeResponse();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SocialiteResponse)
      return this.equals((SocialiteResponse)that);
    return false;
  }

  public boolean equals(SocialiteResponse that) {
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

    boolean this_present_facebookResponse = true && this.isSetFacebookResponse();
    boolean that_present_facebookResponse = true && that.isSetFacebookResponse();
    if (this_present_facebookResponse || that_present_facebookResponse) {
      if (!(this_present_facebookResponse && that_present_facebookResponse))
        return false;
      if (!this.facebookResponse.equals(that.facebookResponse))
        return false;
    }

    boolean this_present_linkedInResponse = true && this.isSetLinkedInResponse();
    boolean that_present_linkedInResponse = true && that.isSetLinkedInResponse();
    if (this_present_linkedInResponse || that_present_linkedInResponse) {
      if (!(this_present_linkedInResponse && that_present_linkedInResponse))
        return false;
      if (!this.linkedInResponse.equals(that.linkedInResponse))
        return false;
    }

    boolean this_present_quoraResponse = true && this.isSetQuoraResponse();
    boolean that_present_quoraResponse = true && that.isSetQuoraResponse();
    if (this_present_quoraResponse || that_present_quoraResponse) {
      if (!(this_present_quoraResponse && that_present_quoraResponse))
        return false;
      if (!this.quoraResponse.equals(that.quoraResponse))
        return false;
    }

    boolean this_present_twitterResponse = true && this.isSetTwitterResponse();
    boolean that_present_twitterResponse = true && that.isSetTwitterResponse();
    if (this_present_twitterResponse || that_present_twitterResponse) {
      if (!(this_present_twitterResponse && that_present_twitterResponse))
        return false;
      if (!this.twitterResponse.equals(that.twitterResponse))
        return false;
    }

    boolean this_present_youtubeResponse = true && this.isSetYoutubeResponse();
    boolean that_present_youtubeResponse = true && that.isSetYoutubeResponse();
    if (this_present_youtubeResponse || that_present_youtubeResponse) {
      if (!(this_present_youtubeResponse && that_present_youtubeResponse))
        return false;
      if (!this.youtubeResponse.equals(that.youtubeResponse))
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

    boolean present_facebookResponse = true && (isSetFacebookResponse());
    list.add(present_facebookResponse);
    if (present_facebookResponse)
      list.add(facebookResponse);

    boolean present_linkedInResponse = true && (isSetLinkedInResponse());
    list.add(present_linkedInResponse);
    if (present_linkedInResponse)
      list.add(linkedInResponse);

    boolean present_quoraResponse = true && (isSetQuoraResponse());
    list.add(present_quoraResponse);
    if (present_quoraResponse)
      list.add(quoraResponse);

    boolean present_twitterResponse = true && (isSetTwitterResponse());
    list.add(present_twitterResponse);
    if (present_twitterResponse)
      list.add(twitterResponse);

    boolean present_youtubeResponse = true && (isSetYoutubeResponse());
    list.add(present_youtubeResponse);
    if (present_youtubeResponse)
      list.add(youtubeResponse);

    return list.hashCode();
  }

  @Override
  public int compareTo(SocialiteResponse other) {
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
    lastComparison = Boolean.valueOf(isSetFacebookResponse()).compareTo(other.isSetFacebookResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFacebookResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.facebookResponse, other.facebookResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLinkedInResponse()).compareTo(other.isSetLinkedInResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLinkedInResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.linkedInResponse, other.linkedInResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuoraResponse()).compareTo(other.isSetQuoraResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuoraResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.quoraResponse, other.quoraResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTwitterResponse()).compareTo(other.isSetTwitterResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTwitterResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.twitterResponse, other.twitterResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetYoutubeResponse()).compareTo(other.isSetYoutubeResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetYoutubeResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.youtubeResponse, other.youtubeResponse);
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
    StringBuilder sb = new StringBuilder("SocialiteResponse(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (isSetFacebookResponse()) {
      if (!first) sb.append(", ");
      sb.append("facebookResponse:");
      if (this.facebookResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.facebookResponse);
      }
      first = false;
    }
    if (isSetLinkedInResponse()) {
      if (!first) sb.append(", ");
      sb.append("linkedInResponse:");
      if (this.linkedInResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.linkedInResponse);
      }
      first = false;
    }
    if (isSetQuoraResponse()) {
      if (!first) sb.append(", ");
      sb.append("quoraResponse:");
      if (this.quoraResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.quoraResponse);
      }
      first = false;
    }
    if (isSetTwitterResponse()) {
      if (!first) sb.append(", ");
      sb.append("twitterResponse:");
      if (this.twitterResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.twitterResponse);
      }
      first = false;
    }
    if (isSetYoutubeResponse()) {
      if (!first) sb.append(", ");
      sb.append("youtubeResponse:");
      if (this.youtubeResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.youtubeResponse);
      }
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
    if (facebookResponse != null) {
      facebookResponse.validate();
    }
    if (linkedInResponse != null) {
      linkedInResponse.validate();
    }
    if (quoraResponse != null) {
      quoraResponse.validate();
    }
    if (twitterResponse != null) {
      twitterResponse.validate();
    }
    if (youtubeResponse != null) {
      youtubeResponse.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SocialiteResponseStandardSchemeFactory implements SchemeFactory {
    public SocialiteResponseStandardScheme getScheme() {
      return new SocialiteResponseStandardScheme();
    }
  }

  private static class SocialiteResponseStandardScheme extends StandardScheme<SocialiteResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SocialiteResponse struct) throws org.apache.thrift.TException {
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
          case 2: // FACEBOOK_RESPONSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.facebookResponse = new FacebookResponse();
              struct.facebookResponse.read(iprot);
              struct.setFacebookResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LINKED_IN_RESPONSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.linkedInResponse = new LinkedInResponse();
              struct.linkedInResponse.read(iprot);
              struct.setLinkedInResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUORA_RESPONSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.quoraResponse = new QuoraResponse();
              struct.quoraResponse.read(iprot);
              struct.setQuoraResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TWITTER_RESPONSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.twitterResponse = new TwitterResponse();
              struct.twitterResponse.read(iprot);
              struct.setTwitterResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // YOUTUBE_RESPONSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.youtubeResponse = new YoutubeResponse();
              struct.youtubeResponse.read(iprot);
              struct.setYoutubeResponseIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SocialiteResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.facebookResponse != null) {
        if (struct.isSetFacebookResponse()) {
          oprot.writeFieldBegin(FACEBOOK_RESPONSE_FIELD_DESC);
          struct.facebookResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.linkedInResponse != null) {
        if (struct.isSetLinkedInResponse()) {
          oprot.writeFieldBegin(LINKED_IN_RESPONSE_FIELD_DESC);
          struct.linkedInResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.quoraResponse != null) {
        if (struct.isSetQuoraResponse()) {
          oprot.writeFieldBegin(QUORA_RESPONSE_FIELD_DESC);
          struct.quoraResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.twitterResponse != null) {
        if (struct.isSetTwitterResponse()) {
          oprot.writeFieldBegin(TWITTER_RESPONSE_FIELD_DESC);
          struct.twitterResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.youtubeResponse != null) {
        if (struct.isSetYoutubeResponse()) {
          oprot.writeFieldBegin(YOUTUBE_RESPONSE_FIELD_DESC);
          struct.youtubeResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SocialiteResponseTupleSchemeFactory implements SchemeFactory {
    public SocialiteResponseTupleScheme getScheme() {
      return new SocialiteResponseTupleScheme();
    }
  }

  private static class SocialiteResponseTupleScheme extends TupleScheme<SocialiteResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SocialiteResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.id);
      BitSet optionals = new BitSet();
      if (struct.isSetFacebookResponse()) {
        optionals.set(0);
      }
      if (struct.isSetLinkedInResponse()) {
        optionals.set(1);
      }
      if (struct.isSetQuoraResponse()) {
        optionals.set(2);
      }
      if (struct.isSetTwitterResponse()) {
        optionals.set(3);
      }
      if (struct.isSetYoutubeResponse()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetFacebookResponse()) {
        struct.facebookResponse.write(oprot);
      }
      if (struct.isSetLinkedInResponse()) {
        struct.linkedInResponse.write(oprot);
      }
      if (struct.isSetQuoraResponse()) {
        struct.quoraResponse.write(oprot);
      }
      if (struct.isSetTwitterResponse()) {
        struct.twitterResponse.write(oprot);
      }
      if (struct.isSetYoutubeResponse()) {
        struct.youtubeResponse.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SocialiteResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readString();
      struct.setIdIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.facebookResponse = new FacebookResponse();
        struct.facebookResponse.read(iprot);
        struct.setFacebookResponseIsSet(true);
      }
      if (incoming.get(1)) {
        struct.linkedInResponse = new LinkedInResponse();
        struct.linkedInResponse.read(iprot);
        struct.setLinkedInResponseIsSet(true);
      }
      if (incoming.get(2)) {
        struct.quoraResponse = new QuoraResponse();
        struct.quoraResponse.read(iprot);
        struct.setQuoraResponseIsSet(true);
      }
      if (incoming.get(3)) {
        struct.twitterResponse = new TwitterResponse();
        struct.twitterResponse.read(iprot);
        struct.setTwitterResponseIsSet(true);
      }
      if (incoming.get(4)) {
        struct.youtubeResponse = new YoutubeResponse();
        struct.youtubeResponse.read(iprot);
        struct.setYoutubeResponseIsSet(true);
      }
    }
  }

}

