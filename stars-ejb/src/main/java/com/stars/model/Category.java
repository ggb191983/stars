package com.stars.model;

import javax.persistence.*;
import java.io.*;
import java.util.*;

/**
 * Created by Battlehammer on 01/01/2017.
 */
@Entity
@Table(name = "categories", schema = "starsdb")
public class Category implements Serializable {
    private int categoryId;
    private String categoryName;
    private String categoryDescription;
    private Collection<SubCategory> subCategoriesByCategoryId;

    @Id
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "category_description")
    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryId != category.categoryId) return false;
        if (categoryName != null ? !categoryName.equals(category.categoryName) : category.categoryName != null)
            return false;
        if (categoryDescription != null ? !categoryDescription.equals(category.categoryDescription) : category.categoryDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (categoryDescription != null ? categoryDescription.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "categoriesBySubCategoryCategoryId")
    public Collection<SubCategory> getSubCategoriesByCategoryId() {
        return subCategoriesByCategoryId;
    }

    public void setSubCategoriesByCategoryId(Collection<SubCategory> subCategoriesByCategoryId) {
        this.subCategoriesByCategoryId = subCategoriesByCategoryId;
    }
}
