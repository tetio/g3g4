//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.01 at 01:12:17 PM CEST 
//


package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4decv1ent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1.DeclarationTd;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1.MessageTd;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


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
 *         &lt;element name="MES_Message" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}MessageTd"/>
 *         &lt;element name="DEC_Declaration" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aduanas/es/aeat/adds/jdit/g4/ws/G4AuxDataElementsV1.xsd}DeclarationTd"/>
 *       &lt;/sequence>
 *       &lt;attribute name="endPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mesMessage",
    "decDeclaration"
})

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document("g4")
@JsonRootName("G4DecV1Ent")
@XmlRootElement(name = "G4DecV1Ent")
public class G4DecV1Ent {

    @Id
    @XmlAttribute(name = "id")
    private String id;
    @XmlElement(name = "MES_Message", required = true)
    protected MessageTd mesMessage;
    @XmlElement(name = "DEC_Declaration", required = true)
    protected DeclarationTd decDeclaration;
    @XmlAttribute(name = "endPoint")
    protected String endPoint;

    /**
     * Gets the value of the mesMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTd }
     *     
     */
    public MessageTd getMESMessage() {
        return mesMessage;
    }

    /**
     * Sets the value of the mesMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTd }
     *     
     */
    public void setMESMessage(MessageTd value) {
        this.mesMessage = value;
    }

    /**
     * Gets the value of the decDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationTd }
     *     
     */
    public DeclarationTd getDECDeclaration() {
        return decDeclaration;
    }

    /**
     * Sets the value of the decDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationTd }
     *     
     */
    public void setDECDeclaration(DeclarationTd value) {
        this.decDeclaration = value;
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

}