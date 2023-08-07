//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.01 at 01:12:17 PM CEST 
//


package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1;

import java.math.BigDecimal;
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
 * <p>Java class for HouseConsignmentTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseConsignmentTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportDocument" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}TransportDocumentTd"/>
 *         &lt;element name="UCR" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}UCR_Td" minOccurs="0"/>
 *         &lt;element name="Consignor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}ActorTd"/>
 *         &lt;element name="Consignee" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}ActorTd"/>
 *         &lt;element name="NotifyParty" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}ActorTd" minOccurs="0"/>
 *         &lt;element name="TotalGrossMass" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}GrossMassTd"/>
 *         &lt;element name="TransportEquipment" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}TransportEquipmentTd" maxOccurs="9999" minOccurs="0"/>
 *         &lt;element name="PreviousDocument" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}PreviousDocumentTd" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="SupportingDocument" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}SupportingDocumentTd" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="AdditionalReference" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}AdditionalReferenceTd" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}AdditionalInformationTd" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="AdditionalSupplyChainActor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}AdditionalSupplyChainActorTd" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="DeclarationType" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}DeclarationTypeTd" minOccurs="0"/>
 *         &lt;element name="DestinatationCountry" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}CountryTd" minOccurs="0"/>
 *         &lt;element name="HI_HouseConsignment_Item" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}ItemTd" maxOccurs="9999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseConsignmentTd", propOrder = {
    "transportDocument",
    "ucr",
    "consignor",
    "consignee",
    "notifyParty",
    "totalGrossMass",
    "transportEquipment",
    "previousDocument",
    "supportingDocument",
    "additionalReference",
    "additionalInformation",
    "additionalSupplyChainActor",
    "declarationType",
    "destinatationCountry",
    "hiHouseConsignmentItem"
})
public class HouseConsignmentTd {

    @XmlElement(name = "TransportDocument", required = true)
    protected TransportDocumentTd transportDocument;
    @XmlElement(name = "UCR")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ucr;
    @XmlElement(name = "Consignor", required = true)
    protected ActorTd consignor;
    @XmlElement(name = "Consignee", required = true)
    protected ActorTd consignee;
    @XmlElement(name = "NotifyParty")
    protected ActorTd notifyParty;
    @XmlElement(name = "TotalGrossMass", required = true)
    protected BigDecimal totalGrossMass;
    @XmlElement(name = "TransportEquipment")
    protected List<TransportEquipmentTd> transportEquipment;
    @XmlElement(name = "PreviousDocument")
    protected List<PreviousDocumentTd> previousDocument;
    @XmlElement(name = "SupportingDocument")
    protected List<SupportingDocumentTd> supportingDocument;
    @XmlElement(name = "AdditionalReference")
    protected List<AdditionalReferenceTd> additionalReference;
    @XmlElement(name = "AdditionalInformation")
    protected List<AdditionalInformationTd> additionalInformation;
    @XmlElement(name = "AdditionalSupplyChainActor")
    protected List<AdditionalSupplyChainActorTd> additionalSupplyChainActor;
    @XmlElement(name = "DeclarationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String declarationType;
    @XmlElement(name = "DestinatationCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String destinatationCountry;
    @XmlElement(name = "HI_HouseConsignment_Item", required = true)
    protected List<ItemTd> hiHouseConsignmentItem;

    /**
     * Gets the value of the transportDocument property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDocumentTd }
     *     
     */
    public TransportDocumentTd getTransportDocument() {
        return transportDocument;
    }

    /**
     * Sets the value of the transportDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDocumentTd }
     *     
     */
    public void setTransportDocument(TransportDocumentTd value) {
        this.transportDocument = value;
    }

    /**
     * Gets the value of the ucr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCR() {
        return ucr;
    }

    /**
     * Sets the value of the ucr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCR(String value) {
        this.ucr = value;
    }

    /**
     * Gets the value of the consignor property.
     * 
     * @return
     *     possible object is
     *     {@link ActorTd }
     *     
     */
    public ActorTd getConsignor() {
        return consignor;
    }

    /**
     * Sets the value of the consignor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActorTd }
     *     
     */
    public void setConsignor(ActorTd value) {
        this.consignor = value;
    }

    /**
     * Gets the value of the consignee property.
     * 
     * @return
     *     possible object is
     *     {@link ActorTd }
     *     
     */
    public ActorTd getConsignee() {
        return consignee;
    }

    /**
     * Sets the value of the consignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActorTd }
     *     
     */
    public void setConsignee(ActorTd value) {
        this.consignee = value;
    }

    /**
     * Gets the value of the notifyParty property.
     * 
     * @return
     *     possible object is
     *     {@link ActorTd }
     *     
     */
    public ActorTd getNotifyParty() {
        return notifyParty;
    }

    /**
     * Sets the value of the notifyParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActorTd }
     *     
     */
    public void setNotifyParty(ActorTd value) {
        this.notifyParty = value;
    }

    /**
     * Gets the value of the totalGrossMass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGrossMass() {
        return totalGrossMass;
    }

    /**
     * Sets the value of the totalGrossMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGrossMass(BigDecimal value) {
        this.totalGrossMass = value;
    }

    /**
     * Gets the value of the transportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentTd }
     * 
     * 
     */
    public List<TransportEquipmentTd> getTransportEquipment() {
        if (transportEquipment == null) {
            transportEquipment = new ArrayList<TransportEquipmentTd>();
        }
        return this.transportEquipment;
    }

    /**
     * Gets the value of the previousDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousDocumentTd }
     * 
     * 
     */
    public List<PreviousDocumentTd> getPreviousDocument() {
        if (previousDocument == null) {
            previousDocument = new ArrayList<PreviousDocumentTd>();
        }
        return this.previousDocument;
    }

    /**
     * Gets the value of the supportingDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocumentTd }
     * 
     * 
     */
    public List<SupportingDocumentTd> getSupportingDocument() {
        if (supportingDocument == null) {
            supportingDocument = new ArrayList<SupportingDocumentTd>();
        }
        return this.supportingDocument;
    }

    /**
     * Gets the value of the additionalReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReferenceTd }
     * 
     * 
     */
    public List<AdditionalReferenceTd> getAdditionalReference() {
        if (additionalReference == null) {
            additionalReference = new ArrayList<AdditionalReferenceTd>();
        }
        return this.additionalReference;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationTd }
     * 
     * 
     */
    public List<AdditionalInformationTd> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInformationTd>();
        }
        return this.additionalInformation;
    }

    /**
     * Gets the value of the additionalSupplyChainActor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalSupplyChainActor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalSupplyChainActor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalSupplyChainActorTd }
     * 
     * 
     */
    public List<AdditionalSupplyChainActorTd> getAdditionalSupplyChainActor() {
        if (additionalSupplyChainActor == null) {
            additionalSupplyChainActor = new ArrayList<AdditionalSupplyChainActorTd>();
        }
        return this.additionalSupplyChainActor;
    }

    /**
     * Gets the value of the declarationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationType() {
        return declarationType;
    }

    /**
     * Sets the value of the declarationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationType(String value) {
        this.declarationType = value;
    }

    /**
     * Gets the value of the destinatationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatationCountry() {
        return destinatationCountry;
    }

    /**
     * Sets the value of the destinatationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatationCountry(String value) {
        this.destinatationCountry = value;
    }

    /**
     * Gets the value of the hiHouseConsignmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hiHouseConsignmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHIHouseConsignmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemTd }
     * 
     * 
     */
    public List<ItemTd> getHIHouseConsignmentItem() {
        if (hiHouseConsignmentItem == null) {
            hiHouseConsignmentItem = new ArrayList<ItemTd>();
        }
        return this.hiHouseConsignmentItem;
    }

}