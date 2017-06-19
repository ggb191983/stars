package com.stars.models;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "attributes_values", schema = "starsdb")
public class AttributesValue implements Serializable {
    private int id;
    private String value;
    private int attributesValueAttributeId;

    @Id
    @Column(name = "attributes_value_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attributes_value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "attributes_value_attribute_id")
    public int getAttributesValueAttributeId() {
        return attributesValueAttributeId;
    }

    public void setAttributesValueAttributeId(int attributesValueAttributeId) {
        this.attributesValueAttributeId = attributesValueAttributeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributesValue that = (AttributesValue) o;

        if (id != that.id) return false;
        if (attributesValueAttributeId != that.attributesValueAttributeId) return false;
        if (value != null ? !value.equals(that.value) : that.value != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + attributesValueAttributeId;
        return result;
    }
}
