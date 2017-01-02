package com.stars.model;

import javax.persistence.*;
import java.io.*;
import java.util.*;

/**
 * Created by Battlehammer on 01/01/2017.
 */
@Entity
@Table(name = "sub_categories", schema = "starsdb")
public class SubCategory implements Serializable {
    private int subCategoryId;
    private String subCategoryName;
    private String subCategoryDescription;
    private Collection<Product> productsesBySubCategoryId;
    private Category categoriesBySubCategoryCategoryId;

    @Id
    @Column(name = "sub_category_id")
    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    @Basic
    @Column(name = "sub_category_name")
    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    @Basic
    @Column(name = "sub_category_description")
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

    @OneToMany(mappedBy = "subCategoriesByProductSubCategoryId")
    public Collection<Product> getProductsesBySubCategoryId() {
        return productsesBySubCategoryId;
    }

    public void setProductsesBySubCategoryId(Collection<Product> productsesBySubCategoryId) {
        this.productsesBySubCategoryId = productsesBySubCategoryId;
    }

    @ManyToOne
    @JoinColumn(name = "sub_category_category_id", referencedColumnName = "category_id", nullable = false)
    public Category getCategoriesBySubCategoryCategoryId() {
        return categoriesBySubCategoryCategoryId;
    }

    public void setCategoriesBySubCategoryCategoryId(Category categoriesBySubCategoryCategoryId) {
        this.categoriesBySubCategoryCategoryId = categoriesBySubCategoryCategoryId;
    }
}
