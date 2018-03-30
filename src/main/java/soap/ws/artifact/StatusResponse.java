
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
 *         &lt;element name="statusresult" type="{https://smsc.ru/sys/soap.php}StatusResponseType"/>
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
    "statusresult"
})
@XmlRootElement(name = "StatusResponse")
public class StatusResponse {

    @XmlElement(required = true)
    protected StatusResponseType statusresult;

    /**
     * Gets the value of the statusresult property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponseType }
     *     
     */
    public StatusResponseType getStatusresult() {
        return statusresult;
    }

    /**
     * Sets the value of the statusresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponseType }
     *     
     */
    public void setStatusresult(StatusResponseType value) {
        this.statusresult = value;
    }

}
