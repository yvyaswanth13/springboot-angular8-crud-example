//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.20 at 07:29:42 AM BST 
//


package com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}bpu_code"/>
 *         &lt;element ref="{}ctry_code"/>
 *         &lt;element ref="{}Entity_Type"/>
 *         &lt;element ref="{}FileNumber"/>
 *         &lt;element ref="{}cl_number"/>
 *         &lt;element ref="{}cert_number"/>
 *         &lt;element ref="{}cert_name"/>
 *         &lt;element ref="{}pol_number"/>
 *         &lt;element ref="{}quote_number"/>
 *         &lt;element ref="{}gf_number"/>
 *         &lt;element ref="{}ent_code"/>
 *         &lt;element ref="{}actioned_date"/>
 *         &lt;element ref="{}IngestionMethod"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bpuCode",
        "ctryCode",
        "entityType",
        "fileNumber",
        "clNumber",
        "certNumber",
        "certName",
        "polNumber",
        "quoteNumber",
        "gfNumber",
        "entCode",
        "actionedDate",
        "ingestionMethod"
})
@XmlRootElement(name = "Index")
public class Index {

    @XmlElement(name = "bpu_code", required = true)
    protected String bpuCode;
    @XmlElement(name = "ctry_code", required = true)
    protected String ctryCode;
    @XmlElement(name = "Entity_Type", required = true)
    protected String entityType;
    @XmlElement(name = "FileNumber", required = true)
    protected String fileNumber;
    @XmlElement(name = "cl_number", required = true)
    protected String clNumber;
    @XmlElement(name = "cert_number", required = true)
    protected String certNumber;
    @XmlElement(name = "cert_name", required = true)
    protected String certName;
    @XmlElement(name = "pol_number", required = true)
    protected String polNumber;
    @XmlElement(name = "quote_number", required = true)
    protected String quoteNumber;
    @XmlElement(name = "gf_number", required = true)
    protected String gfNumber;
    @XmlElement(name = "ent_code", required = true)
    protected String entCode;
    @XmlElement(name = "actioned_date", required = true)
    protected String actionedDate;
    @XmlElement(name = "IngestionMethod", required = true)
    protected String ingestionMethod;

    /**
     * Gets the value of the bpuCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBpuCode() {
        return bpuCode;
    }

    /**
     * Sets the value of the bpuCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBpuCode(String value) {
        this.bpuCode = value;
    }

    /**
     * Gets the value of the ctryCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCtryCode() {
        return ctryCode;
    }

    /**
     * Sets the value of the ctryCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCtryCode(String value) {
        this.ctryCode = value;
    }

    /**
     * Gets the value of the entityType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the fileNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the clNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClNumber() {
        return clNumber;
    }

    /**
     * Sets the value of the clNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClNumber(String value) {
        this.clNumber = value;
    }

    /**
     * Gets the value of the certNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCertNumber() {
        return certNumber;
    }

    /**
     * Sets the value of the certNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCertNumber(String value) {
        this.certNumber = value;
    }

    /**
     * Gets the value of the certName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCertName() {
        return certName;
    }

    /**
     * Sets the value of the certName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCertName(String value) {
        this.certName = value;
    }

    /**
     * Gets the value of the polNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPolNumber() {
        return polNumber;
    }

    /**
     * Sets the value of the polNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPolNumber(String value) {
        this.polNumber = value;
    }

    /**
     * Gets the value of the quoteNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the gfNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGfNumber() {
        return gfNumber;
    }

    /**
     * Sets the value of the gfNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGfNumber(String value) {
        this.gfNumber = value;
    }

    /**
     * Gets the value of the entCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntCode() {
        return entCode;
    }

    /**
     * Sets the value of the entCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntCode(String value) {
        this.entCode = value;
    }

    /**
     * Gets the value of the actionedDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getActionedDate() {
        return actionedDate;
    }

    /**
     * Sets the value of the actionedDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setActionedDate(String value) {
        this.actionedDate = value;
    }

    /**
     * Gets the value of the ingestionMethod property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIngestionMethod() {
        return ingestionMethod;
    }

    /**
     * Sets the value of the ingestionMethod property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIngestionMethod(String value) {
        this.ingestionMethod = value;
    }

}
