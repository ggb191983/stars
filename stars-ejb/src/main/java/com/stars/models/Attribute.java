package com.stars.models;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "attributes", schema = "starsdb")
public class Attribute implements Serializable {
    private int id;
    private String name;
    private String publicName;
    private String description;

    @Id
    @Column(name = "attribute_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attribute_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "attribute_public_name")
    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    @Basic
    @Column(name = "attribute_description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String attributeDescription) {
        this.description = attributeDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attribute attribute = (Attribute) o;

        if (id != attribute.id) return false;
        if (name != null ? !name.equals(attribute.name) : attribute.name != null)
            return false;
        if (publicName != null ? !publicName.equals(attribute.publicName) : attribute.publicName != null)
            return false;
        if (description != null ? !description.equals(attribute.description) : attribute.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (publicName != null ? publicName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
