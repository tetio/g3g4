//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.01 at 01:12:17 PM CEST 
//


package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PreviousDocumentTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousDocumentTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrevDocType" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}DocType4"/>
 *         &lt;element name="PrevDocRef" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}DocRefLongTd"/>
 *         &lt;element name="PrevDocGoodsItem" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}GoodsItemNumberTd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousDocumentTd", propOrder = {
    "prevDocType",
    "prevDocRef",
    "prevDocGoodsItem"
})
public class PreviousDocumentTd {

    @XmlElement(name = "PrevDocType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String prevDocType;
    @XmlElement(name = "PrevDocRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String prevDocRef;
    @XmlElement(name = "PrevDocGoodsItem")
    protected BigInteger prevDocGoodsItem;

    /**
     * Gets the value of the prevDocType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevDocType() {
        return prevDocType;
    }

    /**
     * Sets the value of the prevDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevDocType(String value) {
        this.prevDocType = value;
    }

    /**
     * Gets the value of the prevDocRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevDocRef() {
        return prevDocRef;
    }

    /**
     * Sets the value of the prevDocRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevDocRef(String value) {
        this.prevDocRef = value;
    }

    /**
     * Gets the value of the prevDocGoodsItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrevDocGoodsItem() {
        return prevDocGoodsItem;
    }

    /**
     * Sets the value of the prevDocGoodsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrevDocGoodsItem(BigInteger value) {
        this.prevDocGoodsItem = value;
    }

}