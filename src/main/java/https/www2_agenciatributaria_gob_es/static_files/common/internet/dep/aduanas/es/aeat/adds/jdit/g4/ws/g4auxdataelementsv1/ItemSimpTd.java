//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.07 at 10:02:40 AM CEST 
//


package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ItemSimpTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSimpTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoodsItemNumber" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}GoodsItemNumberTd"/>
 *         &lt;element name="CommodityCodeComp" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}AlphaNumUpMax_8"/>
 *         &lt;element name="NumberOfPackages" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxBasicTypesV1.xsd}Integer_10"/>
 *         &lt;element name="GrossMass" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}GrossMassTd"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSimpTd", propOrder = {
    "goodsItemNumber",
    "commodityCodeComp",
    "numberOfPackages",
    "grossMass"
})
public class ItemSimpTd {

    @XmlElement(name = "GoodsItemNumber", required = true)
    protected BigInteger goodsItemNumber;
    @XmlElement(name = "CommodityCodeComp", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCodeComp;
    @XmlElement(name = "NumberOfPackages", required = true)
    protected BigInteger numberOfPackages;
    @XmlElement(name = "GrossMass", required = true)
    protected BigDecimal grossMass;

    /**
     * Gets the value of the goodsItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGoodsItemNumber() {
        return goodsItemNumber;
    }

    /**
     * Sets the value of the goodsItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGoodsItemNumber(BigInteger value) {
        this.goodsItemNumber = value;
    }

    /**
     * Gets the value of the commodityCodeComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCodeComp() {
        return commodityCodeComp;
    }

    /**
     * Sets the value of the commodityCodeComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCodeComp(String value) {
        this.commodityCodeComp = value;
    }

    /**
     * Gets the value of the numberOfPackages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPackages() {
        return numberOfPackages;
    }

    /**
     * Sets the value of the numberOfPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPackages(BigInteger value) {
        this.numberOfPackages = value;
    }

    /**
     * Gets the value of the grossMass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossMass() {
        return grossMass;
    }

    /**
     * Sets the value of the grossMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossMass(BigDecimal value) {
        this.grossMass = value;
    }

}
