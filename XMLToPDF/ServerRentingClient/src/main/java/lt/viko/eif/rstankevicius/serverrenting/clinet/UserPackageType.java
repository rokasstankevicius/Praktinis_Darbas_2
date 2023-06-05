
package lt.viko.eif.rstankevicius.serverrenting.clinet;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;



/**
 * <p>Java class for userPackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userPackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="dedicatedServers" type="{http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck}dedicatedServersType" maxOccurs="unbounded"/>
 *         &lt;element name="cloudServers" type="{http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck}cloudServersType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userPackageType", propOrder = {
    "id",
    "name",
    "price",
    "dedicatedServers",
    "cloudServers"
})
public class UserPackageType {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected float price;
    @XmlElement(required = true)
    protected List<DedicatedServersType> dedicatedServers;
    @XmlElement(required = true)
    protected List<CloudServersType> cloudServers;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the dedicatedServers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedicatedServers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDedicatedServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DedicatedServersType }
     * 
     * 
     */
    public List<DedicatedServersType> getDedicatedServers() {
        if (dedicatedServers == null) {
            dedicatedServers = new ArrayList<DedicatedServersType>();
        }
        return this.dedicatedServers;
    }

    /**
     * Gets the value of the cloudServers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cloudServers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCloudServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CloudServersType }
     * 
     * 
     */
    public List<CloudServersType> getCloudServers() {
        if (cloudServers == null) {
            cloudServers = new ArrayList<CloudServersType>();
        }
        return this.cloudServers;
    }

}
