
package soap.ws.artifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="psw" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "login",
    "psw",
    "phones",
    "mes"
})
@XmlRootElement(name = "cost")
public class Cost {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String psw;
    @XmlElement(required = true)
    protected String phones;
    @XmlElement(required = true)
    protected String mes;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the psw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsw() {
        return psw;
    }

    /**
     * Sets the value of the psw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsw(String value) {
        this.psw = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhones(String value) {
        this.phones = value;
    }

    /**
     * Gets the value of the mes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Sets the value of the mes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
    }

}
