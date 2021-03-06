/**
 * LocationCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Represents data that encapsulates a location criterion.
 */
public class LocationCriterion  implements java.io.Serializable {
    /* Location criterion. */
    private com.google.api.ads.adwords.axis.v201309.cm.Location location;

    /* Canonical name of the location criterion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CanonicalName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String canonicalName;

    /* Approximate user population that will be targeted, rounded
     * to the nearest 100.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Reach".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long reach;

    /* Locale of the name, as specified in the request. <b>Note:</b>
     * If the specified locale filter
     *                 is invalid, or not supported, en_US will be used by
     * default.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "Locale".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String locale;

    /* Original search term, as specified in the input request for
     * search by name. <b>Note:</b>
     *                 This field is useful in the case that the original
     * search name does not match the official
     *                 name of the location, for example, Florence -> Firenze.
     * 
     *                 <p>The number of search terms is limited to 25 per
     * request.</p>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String searchTerm;

    /* This is used as a hint and suggestions are restricted to this
     * country when applicable.
     *                 
     *                 <p>See the <a href="/adwords/api/docs/appendix/geotargeting">list
     * of countries</a>.</p>
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "CountryCode".</span> */
    private java.lang.String countryCode;

    public LocationCriterion() {
    }

    public LocationCriterion(
           com.google.api.ads.adwords.axis.v201309.cm.Location location,
           java.lang.String canonicalName,
           java.lang.Long reach,
           java.lang.String locale,
           java.lang.String searchTerm,
           java.lang.String countryCode) {
           this.location = location;
           this.canonicalName = canonicalName;
           this.reach = reach;
           this.locale = locale;
           this.searchTerm = searchTerm;
           this.countryCode = countryCode;
    }


    /**
     * Gets the location value for this LocationCriterion.
     * 
     * @return location   * Location criterion.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Location getLocation() {
        return location;
    }


    /**
     * Sets the location value for this LocationCriterion.
     * 
     * @param location   * Location criterion.
     */
    public void setLocation(com.google.api.ads.adwords.axis.v201309.cm.Location location) {
        this.location = location;
    }


    /**
     * Gets the canonicalName value for this LocationCriterion.
     * 
     * @return canonicalName   * Canonical name of the location criterion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CanonicalName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getCanonicalName() {
        return canonicalName;
    }


    /**
     * Sets the canonicalName value for this LocationCriterion.
     * 
     * @param canonicalName   * Canonical name of the location criterion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CanonicalName".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCanonicalName(java.lang.String canonicalName) {
        this.canonicalName = canonicalName;
    }


    /**
     * Gets the reach value for this LocationCriterion.
     * 
     * @return reach   * Approximate user population that will be targeted, rounded
     * to the nearest 100.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Reach".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getReach() {
        return reach;
    }


    /**
     * Sets the reach value for this LocationCriterion.
     * 
     * @param reach   * Approximate user population that will be targeted, rounded
     * to the nearest 100.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Reach".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setReach(java.lang.Long reach) {
        this.reach = reach;
    }


    /**
     * Gets the locale value for this LocationCriterion.
     * 
     * @return locale   * Locale of the name, as specified in the request. <b>Note:</b>
     * If the specified locale filter
     *                 is invalid, or not supported, en_US will be used by
     * default.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "Locale".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this LocationCriterion.
     * 
     * @param locale   * Locale of the name, as specified in the request. <b>Note:</b>
     * If the specified locale filter
     *                 is invalid, or not supported, en_US will be used by
     * default.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "Locale".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the searchTerm value for this LocationCriterion.
     * 
     * @return searchTerm   * Original search term, as specified in the input request for
     * search by name. <b>Note:</b>
     *                 This field is useful in the case that the original
     * search name does not match the official
     *                 name of the location, for example, Florence -> Firenze.
     * 
     *                 <p>The number of search terms is limited to 25 per
     * request.</p>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getSearchTerm() {
        return searchTerm;
    }


    /**
     * Sets the searchTerm value for this LocationCriterion.
     * 
     * @param searchTerm   * Original search term, as specified in the input request for
     * search by name. <b>Note:</b>
     *                 This field is useful in the case that the original
     * search name does not match the official
     *                 name of the location, for example, Florence -> Firenze.
     * 
     *                 <p>The number of search terms is limited to 25 per
     * request.</p>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSearchTerm(java.lang.String searchTerm) {
        this.searchTerm = searchTerm;
    }


    /**
     * Gets the countryCode value for this LocationCriterion.
     * 
     * @return countryCode   * This is used as a hint and suggestions are restricted to this
     * country when applicable.
     *                 
     *                 <p>See the <a href="/adwords/api/docs/appendix/geotargeting">list
     * of countries</a>.</p>
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "CountryCode".</span>
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this LocationCriterion.
     * 
     * @param countryCode   * This is used as a hint and suggestions are restricted to this
     * country when applicable.
     *                 
     *                 <p>See the <a href="/adwords/api/docs/appendix/geotargeting">list
     * of countries</a>.</p>
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "CountryCode".</span>
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationCriterion)) return false;
        LocationCriterion other = (LocationCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.canonicalName==null && other.getCanonicalName()==null) || 
             (this.canonicalName!=null &&
              this.canonicalName.equals(other.getCanonicalName()))) &&
            ((this.reach==null && other.getReach()==null) || 
             (this.reach!=null &&
              this.reach.equals(other.getReach()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.searchTerm==null && other.getSearchTerm()==null) || 
             (this.searchTerm!=null &&
              this.searchTerm.equals(other.getSearchTerm()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getCanonicalName() != null) {
            _hashCode += getCanonicalName().hashCode();
        }
        if (getReach() != null) {
            _hashCode += getReach().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getSearchTerm() != null) {
            _hashCode += getSearchTerm().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "LocationCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canonicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "canonicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reach");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "reach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "searchTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
