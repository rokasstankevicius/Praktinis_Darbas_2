//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.05 at 11:43:06 AM EEST 
//


package lt.viko.eif.rstankevicius.serverrenting.api.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Check" type="{http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck}userDataCheck"/>
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
    "check"
})
@XmlRootElement(name = "getUserDataCheckResponse")
public class GetUserDataCheckResponse {

    @XmlElement(name = "Check", required = true)
    protected UserDataCheck check;

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link UserDataCheck }
     *     
     */
    public UserDataCheck getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDataCheck }
     *     
     */
    public void setCheck(UserDataCheck value) {
        this.check = value;
    }

}