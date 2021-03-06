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

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Criteria defining the facebook response to retrieve.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-10")
public class FacebookCriteria implements org.apache.thrift.TBase<FacebookCriteria, FacebookCriteria._Fields>, java.io.Serializable, Cloneable, Comparable<FacebookCriteria> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("socialite.objects.FacebookCriteria");

  private static final org.apache.thrift.protocol.TField PERSON_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("personId", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FacebookCriteriaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FacebookCriteriaTupleSchemeFactory());
  }

  private String personId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The unique identifier of the person to retrieve the facebook account information.
     */
    PERSON_ID((short)1, "personId");

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
        case 1: // PERSON_ID
          return PERSON_ID;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERSON_ID, new org.apache.thrift.meta_data.FieldMetaData("personId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FacebookCriteria.class, metaDataMap);
  }

  public FacebookCriteria() {
  }

  public FacebookCriteria(
    String personId)
  {
    this();
    this.personId = personId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FacebookCriteria(FacebookCriteria other) {
    if (other.isSetPersonId()) {
      this.personId = other.personId;
    }
  }

  public FacebookCriteria deepCopy() {
    return new FacebookCriteria(this);
  }

  @Override
  public void clear() {
    this.personId = null;
  }

  /**
   * The unique identifier of the person to retrieve the facebook account information.
   */
  public String getPersonId() {
    return this.personId;
  }

  /**
   * The unique identifier of the person to retrieve the facebook account information.
   */
  public FacebookCriteria setPersonId(String personId) {
    this.personId = personId;
    return this;
  }

  public void unsetPersonId() {
    this.personId = null;
  }

  /** Returns true if field personId is set (has been assigned a value) and false otherwise */
  public boolean isSetPersonId() {
    return this.personId != null;
  }

  public void setPersonIdIsSet(boolean value) {
    if (!value) {
      this.personId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERSON_ID:
      if (value == null) {
        unsetPersonId();
      } else {
        setPersonId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERSON_ID:
      return getPersonId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERSON_ID:
      return isSetPersonId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FacebookCriteria)
      return this.equals((FacebookCriteria)that);
    return false;
  }

  public boolean equals(FacebookCriteria that) {
    if (that == null)
      return false;

    boolean this_present_personId = true && this.isSetPersonId();
    boolean that_present_personId = true && that.isSetPersonId();
    if (this_present_personId || that_present_personId) {
      if (!(this_present_personId && that_present_personId))
        return false;
      if (!this.personId.equals(that.personId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_personId = true && (isSetPersonId());
    list.add(present_personId);
    if (present_personId)
      list.add(personId);

    return list.hashCode();
  }

  @Override
  public int compareTo(FacebookCriteria other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPersonId()).compareTo(other.isSetPersonId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersonId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.personId, other.personId);
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
    StringBuilder sb = new StringBuilder("socialite.objects.FacebookCriteria(");
    boolean first = true;

    sb.append("personId:");
    if (this.personId == null) {
      sb.append("null");
    } else {
      sb.append(this.personId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (personId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'personId' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FacebookCriteriaStandardSchemeFactory implements SchemeFactory {
    public FacebookCriteriaStandardScheme getScheme() {
      return new FacebookCriteriaStandardScheme();
    }
  }

  private static class FacebookCriteriaStandardScheme extends StandardScheme<FacebookCriteria> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FacebookCriteria struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERSON_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.personId = iprot.readString();
              struct.setPersonIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FacebookCriteria struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.personId != null) {
        oprot.writeFieldBegin(PERSON_ID_FIELD_DESC);
        oprot.writeString(struct.personId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FacebookCriteriaTupleSchemeFactory implements SchemeFactory {
    public FacebookCriteriaTupleScheme getScheme() {
      return new FacebookCriteriaTupleScheme();
    }
  }

  private static class FacebookCriteriaTupleScheme extends TupleScheme<FacebookCriteria> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FacebookCriteria struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.personId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FacebookCriteria struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.personId = iprot.readString();
      struct.setPersonIdIsSet(true);
    }
  }

}

