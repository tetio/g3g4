//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.01 at 01:12:17 PM CEST 
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
 * Identificador del medio de transporte que se empleará para el movimiento de la mercancía
 * 
 * <p>Java class for TransportMeansTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportMeansTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportMeansType" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}Numeric_2"/>
 *         &lt;element name="TransportMeansId" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}TokenMax_35"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeansTd", propOrder = {
    "transportMeansType",
    "transportMeansId"
})
public class TransportMeansTd {

    @XmlElement(name = "TransportMeansType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportMeansType;
    @XmlElement(name = "TransportMeansId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportMeansId;

    /**
     * Gets the value of the transportMeansType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMeansType() {
        return transportMeansType;
    }

    /**
     * Sets the value of the transportMeansType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMeansType(String value) {
        this.transportMeansType = value;
    }

    /**
     * Gets the value of the transportMeansId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMeansId() {
        return transportMeansId;
    }

    /**
     * Sets the value of the transportMeansId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMeansId(String value) {
        this.transportMeansId = value;
    }

}