package com.stars.models;

import javax.persistence.*;
import java.io.*;
import java.math.*;

/**
 * Created by Battlehammer on 06/01/2017.
 */
@Entity
@Table(name = "products", schema = "starsdb")
public class Product implements Serializable {
    private int productId;
    private String productName;
    private String productBriefDescription;
    private BigDecimal productPrice;
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productBriefDescription != null ? productBriefDescription.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        return result;
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
