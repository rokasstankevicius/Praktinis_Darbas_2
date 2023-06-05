
package lt.viko.eif.rstankevicius.serverrenting.clinet;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;




/**
 * <p>Java class for cloudServersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloudServersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vCores" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="storageSpace" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloudServersType", propOrder = {
    "id",
    "vCores",
    "storageSpace",
    "ram"
})
public class CloudServersType {

    protected int id;
    protected int vCores;
    protected int storageSpace;
    @XmlElement(required = true)
    protected String ram;

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
     * Gets the value of the vCores property.
     * 
     */
    public int getVCores() {
        return vCores;
    }

    /**
     * Sets the value of the vCores property.
     * 
     */
    public void setVCores(int value) {
        this.vCores = value;
    }

    /**
     * Gets the value of the storageSpace property.
     * 
     */
    public int getStorageSpace() {
        return storageSpace;
    }

    /**
     * Sets the value of the storageSpace property.
     * 
     */
    public void setStorageSpace(int value) {
        this.storageSpace = value;
    }

    /**
     * Gets the value of the ram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRam() {
        return ram;
    }

    /**
     * Sets the value of the ram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRam(String value) {
        this.ram = value;
    }

}
