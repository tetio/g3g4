//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.07 at 10:02:40 AM CEST 
//


package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Localización de las mercancías
 * 
 * <p>Java class for LocationOfGoodsTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationOfGoodsTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocType" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaUp_1"/>
 *         &lt;element name="LocQualifier" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaUp_1"/>
 *         &lt;choice>
 *           &lt;element name="LocCoded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="LocUNLocCode">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17">
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="LocCustomsOffice">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Reference" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="LocGPS">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Latitude" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
 *                                 &lt;element name="Longitude" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="LocEconomicOperator">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="LocEcoOpId" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="LocAuthNumber" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_35"/>
 *                     &lt;/choice>
 *                     &lt;element name="LocAddId" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_8" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="LocAddress">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="LocStreetAndNumber" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_70"/>
 *                     &lt;element name="LocPostCode" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaNumUpMax_17"/>
 *                     &lt;element name="LocCity" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_35"/>
 *                     &lt;element name="LocCountry" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaUp_2"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="LocPostCodeAddress">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="LocPostCode" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaNumUpMax_17"/>
 *                     &lt;element name="LocHouseNumber" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_35"/>
 *                     &lt;element name="LocCountry" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaUp_2"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationOfGoodsTd", propOrder = {
    "locType",
    "locQualifier",
    "locCoded",
    "locAddress",
    "locPostCodeAddress"
})
public class LocationOfGoodsTd {

    @XmlElement(name = "LocType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String locType;
    @XmlElement(name = "LocQualifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String locQualifier;
    @XmlElement(name = "LocCoded")
    protected LocationOfGoodsTd.LocCoded locCoded;
    @XmlElement(name = "LocAddress")
    protected LocationOfGoodsTd.LocAddress locAddress;
    @XmlElement(name = "LocPostCodeAddress")
    protected LocationOfGoodsTd.LocPostCodeAddress locPostCodeAddress;

    /**
     * Gets the value of the locType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocType() {
        return locType;
    }

    /**
     * Sets the value of the locType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocType(String value) {
        this.locType = value;
    }

    /**
     * Gets the value of the locQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocQualifier() {
        return locQualifier;
    }

    /**
     * Sets the value of the locQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocQualifier(String value) {
        this.locQualifier = value;
    }

    /**
     * Gets the value of the locCoded property.
     * 
     * @return
     *     possible object is
     *     {@link LocationOfGoodsTd.LocCoded }
     *     
     */
    public LocationOfGoodsTd.LocCoded getLocCoded() {
        return locCoded;
    }

    /**
     * Sets the value of the locCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationOfGoodsTd.LocCoded }
     *     
     */
    public void setLocCoded(LocationOfGoodsTd.LocCoded value) {
        this.locCoded = value;
    }

    /**
     * Gets the value of the locAddress property.
     * 
     * @return
     *     possible object is
     *     {@link LocationOfGoodsTd.LocAddress }
     *     
     */
    public LocationOfGoodsTd.LocAddress getLocAddress() {
        return locAddress;
    }

    /**
     * Sets the value of the locAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationOfGoodsTd.LocAddress }
     *     
     */
    public void setLocAddress(LocationOfGoodsTd.LocAddress value) {
        this.locAddress = value;
    }

    /**
     * Gets the value of the locPostCodeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link LocationOfGoodsTd.LocPostCodeAddress }
     *     
     */
    public LocationOfGoodsTd.LocPostCodeAddress getLocPostCodeAddress() {
        return locPostCodeAddress;
    }

    /**
     * Sets the value of the locPostCodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationOfGoodsTd.LocPostCodeAddress }
     *     
     */
    public void setLocPostCodeAddress(LocationOfGoodsTd.LocPostCodeAddress value) {
        this.locPostCodeAddress = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LocStreetAndNumber" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_70"/>
     *         &lt;element name="LocPostCode" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaNumUpMax_17"/>
     *         &lt;element name="LocCity" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_35"/>
     *         &lt;element name="LocCountry" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaUp_2"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locStreetAndNumber",
        "locPostCode",
        "locCity",
        "locCountry"
    })
    public static class LocAddress {

        @XmlElement(name = "LocStreetAndNumber", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locStreetAndNumber;
        @XmlElement(name = "LocPostCode", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locPostCode;
        @XmlElement(name = "LocCity", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locCity;
        @XmlElement(name = "LocCountry", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locCountry;

        /**
         * Gets the value of the locStreetAndNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocStreetAndNumber() {
            return locStreetAndNumber;
        }

        /**
         * Sets the value of the locStreetAndNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocStreetAndNumber(String value) {
            this.locStreetAndNumber = value;
        }

        /**
         * Gets the value of the locPostCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocPostCode() {
            return locPostCode;
        }

        /**
         * Sets the value of the locPostCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocPostCode(String value) {
            this.locPostCode = value;
        }

        /**
         * Gets the value of the locCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocCity() {
            return locCity;
        }

        /**
         * Sets the value of the locCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocCity(String value) {
            this.locCity = value;
        }

        /**
         * Gets the value of the locCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocCountry() {
            return locCountry;
        }

        /**
         * Sets the value of the locCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocCountry(String value) {
            this.locCountry = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="LocUNLocCode">
     *             &lt;simpleType>
     *               &lt;restriction base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17">
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="LocCustomsOffice">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="Reference" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="LocGPS">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="Latitude" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
     *                     &lt;element name="Longitude" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="LocEconomicOperator">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="LocEcoOpId" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="LocAuthNumber" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_35"/>
     *         &lt;/choice>
     *         &lt;element name="LocAddId" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_8" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locUNLocCode",
        "locCustomsOffice",
        "locGPS",
        "locEconomicOperator",
        "locAuthNumber",
        "locAddId"
    })
    public static class LocCoded {

        @XmlElement(name = "LocUNLocCode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String locUNLocCode;
        @XmlElement(name = "LocCustomsOffice")
        protected LocationOfGoodsTd.LocCoded.LocCustomsOffice locCustomsOffice;
        @XmlElement(name = "LocGPS")
        protected LocationOfGoodsTd.LocCoded.LocGPS locGPS;
        @XmlElement(name = "LocEconomicOperator")
        protected LocationOfGoodsTd.LocCoded.LocEconomicOperator locEconomicOperator;
        @XmlElement(name = "LocAuthNumber")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locAuthNumber;
        @XmlElement(name = "LocAddId")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locAddId;

        /**
         * Gets the value of the locUNLocCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocUNLocCode() {
            return locUNLocCode;
        }

        /**
         * Sets the value of the locUNLocCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocUNLocCode(String value) {
            this.locUNLocCode = value;
        }

        /**
         * Gets the value of the locCustomsOffice property.
         * 
         * @return
         *     possible object is
         *     {@link LocationOfGoodsTd.LocCoded.LocCustomsOffice }
         *     
         */
        public LocationOfGoodsTd.LocCoded.LocCustomsOffice getLocCustomsOffice() {
            return locCustomsOffice;
        }

        /**
         * Sets the value of the locCustomsOffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationOfGoodsTd.LocCoded.LocCustomsOffice }
         *     
         */
        public void setLocCustomsOffice(LocationOfGoodsTd.LocCoded.LocCustomsOffice value) {
            this.locCustomsOffice = value;
        }

        /**
         * Gets the value of the locGPS property.
         * 
         * @return
         *     possible object is
         *     {@link LocationOfGoodsTd.LocCoded.LocGPS }
         *     
         */
        public LocationOfGoodsTd.LocCoded.LocGPS getLocGPS() {
            return locGPS;
        }

        /**
         * Sets the value of the locGPS property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationOfGoodsTd.LocCoded.LocGPS }
         *     
         */
        public void setLocGPS(LocationOfGoodsTd.LocCoded.LocGPS value) {
            this.locGPS = value;
        }

        /**
         * Gets the value of the locEconomicOperator property.
         * 
         * @return
         *     possible object is
         *     {@link LocationOfGoodsTd.LocCoded.LocEconomicOperator }
         *     
         */
        public LocationOfGoodsTd.LocCoded.LocEconomicOperator getLocEconomicOperator() {
            return locEconomicOperator;
        }

        /**
         * Sets the value of the locEconomicOperator property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationOfGoodsTd.LocCoded.LocEconomicOperator }
         *     
         */
        public void setLocEconomicOperator(LocationOfGoodsTd.LocCoded.LocEconomicOperator value) {
            this.locEconomicOperator = value;
        }

        /**
         * Gets the value of the locAuthNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocAuthNumber() {
            return locAuthNumber;
        }

        /**
         * Sets the value of the locAuthNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocAuthNumber(String value) {
            this.locAuthNumber = value;
        }

        /**
         * Gets the value of the locAddId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocAddId() {
            return locAddId;
        }

        /**
         * Sets the value of the locAddId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocAddId(String value) {
            this.locAddId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Reference" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reference"
        })
        public static class LocCustomsOffice {

            @XmlElement(name = "Reference", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String reference;

            /**
             * Gets the value of the reference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * Sets the value of the reference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="LocEcoOpId" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "locEcoOpId"
        })
        public static class LocEconomicOperator {

            @XmlElement(name = "LocEcoOpId", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String locEcoOpId;

            /**
             * Gets the value of the locEcoOpId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocEcoOpId() {
                return locEcoOpId;
            }

            /**
             * Sets the value of the locEcoOpId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocEcoOpId(String value) {
                this.locEcoOpId = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Latitude" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
         *         &lt;element name="Longitude" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_17"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "latitude",
            "longitude"
        })
        public static class LocGPS {

            @XmlElement(name = "Latitude", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String latitude;
            @XmlElement(name = "Longitude", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String longitude;

            /**
             * Gets the value of the latitude property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLatitude() {
                return latitude;
            }

            /**
             * Sets the value of the latitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLatitude(String value) {
                this.latitude = value;
            }

            /**
             * Gets the value of the longitude property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLongitude() {
                return longitude;
            }

            /**
             * Sets the value of the longitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLongitude(String value) {
                this.longitude = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LocPostCode" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaNumUpMax_17"/>
     *         &lt;element name="LocHouseNumber" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_35"/>
     *         &lt;element name="LocCountry" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaUp_2"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locPostCode",
        "locHouseNumber",
        "locCountry"
    })
    public static class LocPostCodeAddress {

        @XmlElement(name = "LocPostCode", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locPostCode;
        @XmlElement(name = "LocHouseNumber", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locHouseNumber;
        @XmlElement(name = "LocCountry", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locCountry;

        /**
         * Gets the value of the locPostCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocPostCode() {
            return locPostCode;
        }

        /**
         * Sets the value of the locPostCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocPostCode(String value) {
            this.locPostCode = value;
        }

        /**
         * Gets the value of the locHouseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocHouseNumber() {
            return locHouseNumber;
        }

        /**
         * Sets the value of the locHouseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocHouseNumber(String value) {
            this.locHouseNumber = value;
        }

        /**
         * Gets the value of the locCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocCountry() {
            return locCountry;
        }

        /**
         * Sets the value of the locCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocCountry(String value) {
            this.locCountry = value;
        }

    }

}
