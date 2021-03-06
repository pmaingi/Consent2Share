/*******************************************************************************
 * Open Behavioral Health Information Technology Architecture (OBHITA.org)
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package gov.samhsa.consent2share.c32.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
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
 *         &lt;element name="text" type="{urn:hl7-org:v3}textType" minOccurs="0"/>
 *         &lt;element name="medication" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indicateMedicationStopped" type="{urn:hl7-org:v3}ts" minOccurs="0"/>
 *                   &lt;element name="medicationDateRange" type="{urn:hl7-org:v3}ivlTs" minOccurs="0"/>
 *                   &lt;element name="admissionTiming" type="{urn:hl7-org:v3}pivlTs" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="route" type="{urn:hl7-org:v3}cd" minOccurs="0"/>
 *                   &lt;element name="dose" type="{urn:hl7-org:v3}pq" minOccurs="0"/>
 *                   &lt;element name="site" type="{urn:hl7-org:v3}cd" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="doseRestriction" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numerator" type="{urn:hl7-org:v3}pq"/>
 *                             &lt;element name="denominator" type="{urn:hl7-org:v3}pq"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="productForm" type="{urn:hl7-org:v3}cd" minOccurs="0"/>
 *                   &lt;element name="deliveryMethod" type="{urn:hl7-org:v3}cd" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="medicationInformation" type="{urn:hl7-org:v3}medicationInformation" maxOccurs="unbounded"/>
 *                   &lt;element name="typeOfMedication" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{urn:hl7-org:v3}cd">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="statusOfMedication" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{urn:hl7-org:v3}cd">
 *                           &lt;attribute name="valueType" type="{urn:hl7-org:v3}valueType" />
 *                           &lt;attribute name="status" type="{urn:hl7-org:v3}statusType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="indication" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{urn:hl7-org:v3}cd">
 *                           &lt;attribute name="status" type="{urn:hl7-org:v3}statusType" />
 *                           &lt;attribute name="freeTextRef" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="patientInstructions" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="reaction" type="{urn:hl7-org:v3}cd" minOccurs="0"/>
 *                   &lt;element name="vehicle" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{urn:hl7-org:v3}cd">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="doseIndicator" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="orderInformation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="orderNumber" type="{urn:hl7-org:v3}ii" minOccurs="0"/>
 *                             &lt;element name="fills" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="quantityOrdered" type="{urn:hl7-org:v3}pq" minOccurs="0"/>
 *                             &lt;element name="orderExpirationDateTime" type="{urn:hl7-org:v3}ts" minOccurs="0"/>
 *                             &lt;element name="orderDateTime" type="{urn:hl7-org:v3}ivlTs" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fulfillmentInstructions" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="fulfillmentHistory" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="prescriptionNumber" type="{urn:hl7-org:v3}ii" minOccurs="0"/>
 *                             &lt;element ref="{urn:hl7-org:v3}provider" minOccurs="0"/>
 *                             &lt;element name="dispensingPharmacyLocation" type="{urn:hl7-org:v3}addr" minOccurs="0"/>
 *                             &lt;element name="dispenseDate" type="{urn:hl7-org:v3}ivlTs" minOccurs="0"/>
 *                             &lt;element name="quantityDispensed" type="{urn:hl7-org:v3}pq" minOccurs="0"/>
 *                             &lt;element name="fillNumber" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}nullFlavorType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fillStatus" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{urn:hl7-org:v3}statusType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{urn:hl7-org:v3}comment" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "text",
    "medication"
})
public class Medications {

    /** The text. */
    protected TextType text;
    
    /** The medication. */
    @XmlElement(required = true)
    protected List<Medication> medication;

    /**
     * Gets the value of the text property.
     *
     * @return the text
     * possible object is
     * {@link TextType }
     */
    public TextType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setText(TextType value) {
        this.text = value;
    }

    /**
     * Gets the value of the medication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getMedication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     *
     * @return the medication
     * {@link Medication }
     */
    public List<Medication> getMedication() {
        if (medication == null) {
            medication = new ArrayList<Medication>();
        }
        return this.medication;
    }

}
