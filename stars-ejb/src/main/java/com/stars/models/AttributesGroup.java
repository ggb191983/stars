package com.stars.models;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "attributes_groups", schema = "starsdb")
public class AttributesGroup implements Serializable {
    private int attributesGroupId;
    private String attributesGroupName;

    @Id
    @Column(name = "attributes_group_id")
    public int getAttributesGroupId() {
        return attributesGroupId;
    }

    public void setAttributesGroupId(int attributesGroupId) {
        this.attributesGroupId = attributesGroupId;
    }

    @Basic
    @Column(name = "attributes_group_name")
    public String getAttributesGroupName() {
        return attributesGroupName;
    }

    public void setAttributesGroupName(String attributesGroupName) {
        this.attributesGroupName = attributesGroupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributesGroup that = (AttributesGroup) o;

        if (attributesGroupId != that.attributesGroupId) return false;
        if (attributesGroupName != null ? !attributesGroupName.equals(that.attributesGroupName) : that.attributesGroupName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attributesGroupId;
        result = 31 * result + (attributesGroupName != null ? attributesGroupName.hashCode() : 0);
        return result;
    }
}
