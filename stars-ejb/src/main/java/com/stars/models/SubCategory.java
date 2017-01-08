package com.stars.models;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 06/01/2017.
 */
@Entity
@Table(name = "sub_categories", schema = "starsdb")
public class SubCategory implements Serializable {
    @Id
    @Column(name = "sub_category_id")
    private int subCategoryId;
    @Basic
    @Column(name = "sub_category_name")
    private String subCategoryName;
    @Basic
    @Column(name = "sub_category_description")
    private String subCategoryDescription;
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name = "sub_category_category_id", referencedColumnName = "category_id", nullable = false)
    @JsonIgnore
    private Category category;

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getSubCategoryDescription() {
        return subCategoryDescription;
    }

    public void setSubCategoryDescription(String subCategoryDescription) {
        this.subCategoryDescription = subCategoryDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubCategory that = (SubCategory) o;

        if (subCategoryId != that.subCategoryId) return false;
        if (subCategoryName != null ? !subCategoryName.equals(that.subCategoryName) : that.subCategoryName != null)
            return false;
        if (subCategoryDescription != null ? !subCategoryDescription.equals(that.subCategoryDescription) : that.subCategoryDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subCategoryId;
        result = 31 * result + (subCategoryName != null ? subCategoryName.hashCode() : 0);
        result = 31 * result + (subCategoryDescription != null ? subCategoryDescription.hashCode() : 0);
        return result;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
