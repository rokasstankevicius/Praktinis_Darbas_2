
package lt.viko.eif.rstankevicius.serverrenting.clinet;

import jakarta.xml.bind.annotation.*;



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
    protected UserDataCheck_Type check;

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link UserDataCheck_Type }
     *     
     */
    public UserDataCheck_Type getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDataCheck_Type }
     *     
     */
    public void setCheck(UserDataCheck_Type value) {
        this.check = value;
    }

}
