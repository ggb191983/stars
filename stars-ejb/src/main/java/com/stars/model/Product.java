package com.stars.model;

import javax.persistence.*;
import java.io.*;
import java.math.*;

/**
 * Created by Battlehammer on 01/01/2017.
 */
@Entity
@Table(name = "products", schema = "starsdb")
public class Product implements Serializable {
    private int productId;
    private String productName;
    private String productBriefDescription;
    private BigDecimal productPrice;
    private Integer productSubCategoryId;
    private Integer productCartId;
    private SubCategory subCategoriesByProductSubCategoryId;
    private Cart cartsByProductCartId;

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_brief_description")
    public String getProductBriefDescription() {
        return productBriefDescription;
    }

    public void setProductBriefDescription(String productBriefDescription) {
        this.productBriefDescription = productBriefDescription;
    }

    @Basic
    @Column(name = "product_price")
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "product_sub_category_id", insertable = false, updatable = false)
    public Integer getProductSubCategoryId() {
        return productSubCategoryId;
    }

    public void setProductSubCategoryId(Integer productSubCategoryId) {
        this.productSubCategoryId = productSubCategoryId;
    }

    @Basic
    @Column(name = "product_cart_id", insertable = false, updatable = false)
    public Integer getProductCartId() {
        return productCartId;
    }

    public void setProductCartId(Integer productCartId) {
        this.productCartId = productCartId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (productBriefDescription != null ? !productBriefDescription.equals(product.productBriefDescription) : product.productBriefDescription != null)
            return false;
        if (productPrice != null ? !productPrice.equals(product.productPrice) : product.productPrice != null)
            return false;
        if (productSubCategoryId != null ? !productSubCategoryId.equals(product.productSubCategoryId) : product.productSubCategoryId != null)
            return false;
        if (productCartId != null ? !productCartId.equals(product.productCartId) : product.productCartId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productBriefDescription != null ? productBriefDescription.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (productSubCategoryId != null ? productSubCategoryId.hashCode() : 0);
        result = 31 * result + (productCartId != null ? productCartId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "product_sub_category_id", referencedColumnName = "sub_category_id")
    public SubCategory getSubCategoriesByProductSubCategoryId() {
        return subCategoriesByProductSubCategoryId;
    }

    public void setSubCategoriesByProductSubCategoryId(SubCategory subCategoriesByProductSubCategoryId) {
        this.subCategoriesByProductSubCategoryId = subCategoriesByProductSubCategoryId;
    }

    @ManyToOne
    @JoinColumn(name = "product_cart_id", referencedColumnName = "carts_id")
    public Cart getCartsByProductCartId() {
        return cartsByProductCartId;
    }

    public void setCartsByProductCartId(Cart cartsByProductCartId) {
        this.cartsByProductCartId = cartsByProductCartId;
    }
}
