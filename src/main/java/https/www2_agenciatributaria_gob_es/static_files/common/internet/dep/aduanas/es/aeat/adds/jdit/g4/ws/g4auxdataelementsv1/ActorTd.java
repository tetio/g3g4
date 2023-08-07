//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.07 at 10:02:40 AM CEST 
//


package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Información de actor (persona física o jurídica) participante en la declaración G4
 * 
 * <p>Java class for ActorTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActorTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}ActorInfoGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActorTd", propOrder = {
    "id",
    "typeOfPerson",
    "name",
    "fullAddress",
    "communication"
})
public class ActorTd {

    @XmlElement(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "TypeOfPerson", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeOfPerson;
    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "FullAddress", required = true)
    protected FullAddressTd fullAddress;
    @XmlElement(name = "Communication")
    protected List<CommunicationTd> communication;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the typeOfPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfPerson() {
        return typeOfPerson;
    }

    /**
     * Sets the value of the typeOfPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfPerson(String value) {
        this.typeOfPerson = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FullAddressTd }
     *     
     */
    public FullAddressTd getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullAddressTd }
     *     
     */
    public void setFullAddress(FullAddressTd value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationTd }
     * 
     * 
     */
    public List<CommunicationTd> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<CommunicationTd>();
        }
        return this.communication;
    }

}
