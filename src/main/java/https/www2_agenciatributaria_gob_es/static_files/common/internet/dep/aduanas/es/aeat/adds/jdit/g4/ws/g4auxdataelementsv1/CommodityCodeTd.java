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
 * Código de mercancía
 * 
 * <p>Java class for CommodityCodeTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityCodeTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HarmonizedSystem" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaNumUp_6"/>
 *         &lt;element name="CombinedNomenclature" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaNumUp_2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityCodeTd", propOrder = {
    "harmonizedSystem",
    "combinedNomenclature"
})
public class CommodityCodeTd {

    @XmlElement(name = "HarmonizedSystem", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String harmonizedSystem;
    @XmlElement(name = "CombinedNomenclature")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String combinedNomenclature;

    /**
     * Gets the value of the harmonizedSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedSystem() {
        return harmonizedSystem;
    }

    /**
     * Sets the value of the harmonizedSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedSystem(String value) {
        this.harmonizedSystem = value;
    }

    /**
     * Gets the value of the combinedNomenclature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinedNomenclature() {
        return combinedNomenclature;
    }

    /**
     * Sets the value of the combinedNomenclature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedNomenclature(String value) {
        this.combinedNomenclature = value;
    }

}
