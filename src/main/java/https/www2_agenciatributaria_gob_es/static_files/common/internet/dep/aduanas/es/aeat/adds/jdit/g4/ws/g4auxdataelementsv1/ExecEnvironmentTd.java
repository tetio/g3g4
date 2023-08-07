//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.01 at 01:12:17 PM CEST 
//


package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4auxdataelementsv1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecEnvironmentTd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecEnvironmentTd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ES.AEAT"/>
 *     &lt;enumeration value="PRE.AEAT"/>
 *     &lt;enumeration value="DES.AEAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecEnvironmentTd")
@XmlEnum
public enum ExecEnvironmentTd {


    /**
     * Valor fijo para el entorno de Producción (cuando se usa el End Point principal de envíos reales)
     * 
     */
    @XmlEnumValue("ES.AEAT")
    ES_AEAT("ES.AEAT"),

    /**
     * Valor fijo para el entorno de Preproducción (cuando se usa el End Point de Pruebas)
     * 
     */
    @XmlEnumValue("PRE.AEAT")
    PRE_AEAT("PRE.AEAT"),

    /**
     * Valor fijo para el entorno de Desarrollo (no utilizado para ningún End Point publicado)
     * 
     */
    @XmlEnumValue("DES.AEAT")
    DES_AEAT("DES.AEAT");
    private final String value;

    ExecEnvironmentTd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecEnvironmentTd fromValue(String v) {
        for (ExecEnvironmentTd c: ExecEnvironmentTd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}