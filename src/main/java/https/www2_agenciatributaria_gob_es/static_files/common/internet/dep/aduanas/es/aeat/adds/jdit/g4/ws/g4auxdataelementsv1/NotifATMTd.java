//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.07 at 10:02:40 AM CEST 
//


package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for NotifATMTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifATMTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LRN" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}LRN_Td"/>
 *         &lt;element name="ArrivalCustomsOffice" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}CustomsOfficeTd"/>
 *         &lt;element name="ArrivalTransportMeans" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}TransportMeansTd"/>
 *         &lt;element name="Declarant" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}DeclarantTd"/>
 *         &lt;element name="Representative" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}RepresentativeTd" minOccurs="0"/>
 *         &lt;element name="EstimatedDateAndTimeOfArrival" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}DateTime19" minOccurs="0"/>
 *         &lt;element name="CountriesRoutingTransportMeans" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}CountriesRoutingTransportMeansTd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifATMTd", propOrder = {
    "lrn",
    "arrivalCustomsOffice",
    "arrivalTransportMeans",
    "declarant",
    "representative",
    "estimatedDateAndTimeOfArrival",
    "countriesRoutingTransportMeans"
})
public class NotifATMTd {

    @XmlElement(name = "LRN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lrn;
    @XmlElement(name = "ArrivalCustomsOffice", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String arrivalCustomsOffice;
    @XmlElement(name = "ArrivalTransportMeans", required = true)
    protected TransportMeansTd arrivalTransportMeans;
    @XmlElement(name = "Declarant", required = true)
    protected DeclarantTd declarant;
    @XmlElement(name = "Representative")
    protected RepresentativeTd representative;
    @XmlElement(name = "EstimatedDateAndTimeOfArrival", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date estimatedDateAndTimeOfArrival;
    @XmlElement(name = "CountriesRoutingTransportMeans")
    protected CountriesRoutingTransportMeansTd countriesRoutingTransportMeans;

    /**
     * Gets the value of the lrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRN() {
        return lrn;
    }

    /**
     * Sets the value of the lrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRN(String value) {
        this.lrn = value;
    }

    /**
     * Gets the value of the arrivalCustomsOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCustomsOffice() {
        return arrivalCustomsOffice;
    }

    /**
     * Sets the value of the arrivalCustomsOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCustomsOffice(String value) {
        this.arrivalCustomsOffice = value;
    }

    /**
     * Gets the value of the arrivalTransportMeans property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansTd }
     *     
     */
    public TransportMeansTd getArrivalTransportMeans() {
        return arrivalTransportMeans;
    }

    /**
     * Sets the value of the arrivalTransportMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansTd }
     *     
     */
    public void setArrivalTransportMeans(TransportMeansTd value) {
        this.arrivalTransportMeans = value;
    }

    /**
     * Gets the value of the declarant property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarantTd }
     *     
     */
    public DeclarantTd getDeclarant() {
        return declarant;
    }

    /**
     * Sets the value of the declarant property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarantTd }
     *     
     */
    public void setDeclarant(DeclarantTd value) {
        this.declarant = value;
    }

    /**
     * Gets the value of the representative property.
     * 
     * @return
     *     possible object is
     *     {@link RepresentativeTd }
     *     
     */
    public RepresentativeTd getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativeTd }
     *     
     */
    public void setRepresentative(RepresentativeTd value) {
        this.representative = value;
    }

    /**
     * Gets the value of the estimatedDateAndTimeOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEstimatedDateAndTimeOfArrival() {
        return estimatedDateAndTimeOfArrival;
    }

    /**
     * Sets the value of the estimatedDateAndTimeOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDateAndTimeOfArrival(Date value) {
        this.estimatedDateAndTimeOfArrival = value;
    }

    /**
     * Gets the value of the countriesRoutingTransportMeans property.
     * 
     * @return
     *     possible object is
     *     {@link CountriesRoutingTransportMeansTd }
     *     
     */
    public CountriesRoutingTransportMeansTd getCountriesRoutingTransportMeans() {
        return countriesRoutingTransportMeans;
    }

    /**
     * Sets the value of the countriesRoutingTransportMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountriesRoutingTransportMeansTd }
     *     
     */
    public void setCountriesRoutingTransportMeans(CountriesRoutingTransportMeansTd value) {
        this.countriesRoutingTransportMeans = value;
    }

}
