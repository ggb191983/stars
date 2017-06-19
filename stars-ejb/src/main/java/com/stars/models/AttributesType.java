package com.stars.models;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "attributes_types", schema = "starsdb")
public class AttributesType implements Serializable {
    private int attributesTypesId;
    private String attributesTypesName;

    @Id
    @Column(name = "attributes_types_id")
    public int getAttributesTypesId() {
        return attributesTypesId;
    }

    public void setAttributesTypesId(int attributesTypesId) {
        this.attributesTypesId = attributesTypesId;
    }

    @Basic
    @Column(name = "attributes_types_name")
    public String getAttributesTypesName() {
        return attributesTypesName;
    }

    public void setAttributesTypesName(String attributesTypesName) {
        this.attributesTypesName = attributesTypesName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributesType that = (AttributesType) o;

        if (attributesTypesId != that.attributesTypesId) return false;
        if (attributesTypesName != null ? !attributesTypesName.equals(that.attributesTypesName) : that.attributesTypesName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attributesTypesId;
        result = 31 * result + (attributesTypesName != null ? attributesTypesName.hashCode() : 0);
        return result;
    }
}
