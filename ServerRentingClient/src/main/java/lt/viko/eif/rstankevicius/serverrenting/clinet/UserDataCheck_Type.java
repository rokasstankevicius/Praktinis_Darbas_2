
package lt.viko.eif.rstankevicius.serverrenting.clinet;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for userDataCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userDataCheck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasDedicatedServers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasCloudServers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="amountOfDedicatedServers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amountOfCloudServers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDataCheck", propOrder = {
    "hasDedicatedServers",
    "hasCloudServers",
    "price",
    "amountOfDedicatedServers",
    "amountOfCloudServers"
})
public class UserDataCheck_Type {

    @XmlElement(defaultValue = "false")
    protected boolean hasDedicatedServers;
    @XmlElement(defaultValue = "false")
    protected boolean hasCloudServers;
    protected float price;
    @XmlElement(defaultValue = "0")
    protected int amountOfDedicatedServers;
    @XmlElement(defaultValue = "0")
    protected int amountOfCloudServers;

    /**
     * Gets the value of the hasDedicatedServers property.
     * 
     */
    public boolean isHasDedicatedServers() {
        return hasDedicatedServers;
    }

    /**
     * Sets the value of the hasDedicatedServers property.
     * 
     */
    public void setHasDedicatedServers(boolean value) {
        this.hasDedicatedServers = value;
    }

    /**
     * Gets the value of the hasCloudServers property.
     * 
     */
    public boolean isHasCloudServers() {
        return hasCloudServers;
    }

    /**
     * Sets the value of the hasCloudServers property.
     * 
     */
    public void setHasCloudServers(boolean value) {
        this.hasCloudServers = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the amountOfDedicatedServers property.
     * 
     */
    public int getAmountOfDedicatedServers() {
        return amountOfDedicatedServers;
    }

    /**
     * Sets the value of the amountOfDedicatedServers property.
     * 
     */
    public void setAmountOfDedicatedServers(int value) {
        this.amountOfDedicatedServers = value;
    }

    /**
     * Gets the value of the amountOfCloudServers property.
     * 
     */
    public int getAmountOfCloudServers() {
        return amountOfCloudServers;
    }

    /**
     * Sets the value of the amountOfCloudServers property.
     * 
     */
    public void setAmountOfCloudServers(int value) {
        this.amountOfCloudServers = value;
    }

}
