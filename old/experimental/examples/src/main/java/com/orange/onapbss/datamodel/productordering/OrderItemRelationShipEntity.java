//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.20 at 01:55:00 PM CEST 
//


package com.orange.onapbss.datamodel.productordering;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for OrderItemRelationShip complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="OrderItemRelationShip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://orange.com/MEF/api/productOrder/v0/model}RelationShipType"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemRelationShip", propOrder = {
        "type",
        "id"
})
@Entity(name = "OrderItemRelationShipEntity")
@Table(name = "ORDER_ITEM_RELATION_SHIP_ENT_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class OrderItemRelationShipEntity
        implements Serializable {

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    @NotNull
    @XmlSchemaType(name = "string")
    protected RelationShipTypeEntity type;
    @XmlElement(required = true)
    @NotNull
    protected String id;
    @XmlAttribute(name = "Hjid")
    @JsonIgnore
    protected Long hjid;

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link RelationShipTypeEntity }
     */
    @Basic
    @Column(name = "TYPE_", length = 255)
    public String getType() {
        return type != null ? type.value() : null;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link RelationShipTypeEntity }
     */
    public void setType(String value) {
        this.type = RelationShipTypeEntity.fromValue(value);
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    @Basic
    @Column(name = "ID", length = 100)
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the hjid property.
     *
     * @return possible object is
     * {@link Long }
     */
    @Id
    @Column(name = "HJID", length = 100)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}