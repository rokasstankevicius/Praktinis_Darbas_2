//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.05 at 11:43:06 AM EEST 
//


package lt.viko.eif.rstankevicius.serverrenting.api.models;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for userDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPackage" type="{http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck}userPackageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDataType", propOrder = {
    "id",
    "username",
    "password",
    "userPackage"
})
@XmlRootElement(name = "userData", namespace = "http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck")
public class UserDataType {

    protected int id;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected UserPackageType userPackage;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the userPackage property.
     * 
     * @return
     *     possible object is
     *     {@link UserPackageType }
     *     
     */
    public UserPackageType getUserPackage() {
        return userPackage;
    }

    /**
     * Sets the value of the userPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPackageType }
     *     
     */
    public void setUserPackage(UserPackageType value) {
        this.userPackage = value;
    }

}