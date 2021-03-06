
package echosign.api.clientv20.dto9;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitiateInteractiveSendDocumentResultErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitiateInteractiveSendDocumentResultErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_API_KEY"/>
 *     &lt;enumeration value="FILE_RETRIEVAL_ERROR"/>
 *     &lt;enumeration value="MISC_ERROR"/>
 *     &lt;enumeration value="EXCEPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InitiateInteractiveSendDocumentResultErrorCode")
@XmlEnum
public enum InitiateInteractiveSendDocumentResultErrorCode {

    OK,
    INVALID_API_KEY,
    FILE_RETRIEVAL_ERROR,
    MISC_ERROR,
    EXCEPTION;

    public String value() {
        return name();
    }

    public static InitiateInteractiveSendDocumentResultErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
