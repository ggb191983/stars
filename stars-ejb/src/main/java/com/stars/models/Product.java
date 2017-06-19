package com.stars.models;

import com.stars.enums.*;

import javax.persistence.*;
import java.io.*;
import java.math.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "products", schema = "starsdb")
public class Product implements Serializable {
    private int id;
    private String description;
    private String shortDescription;
    private String name;
    private BigDecimal price;
    private String referenceCode;
    private String ean13JanBarcode;
    private String upc;
    private boolean enabled;
    private ProductVisibility visibility;
    private ProductCondition condition;
    private String image;
    private String tags;
    private BigDecimal wholesalePrice;
    private BigDecimal retailPrice;
    private Integer taxRule;
    private BigDecimal unitPrice;
    private String title;
    private String keywords;
    private Cart cart;
    private Category category;

    @Id
    @Column(name = "product_id")
    public int getId() {
        return id;
    }

    public void setId(int productId) {
        this.id = productId;
    }

    @Basic
    @Column(name = "product_description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String productDescription) {
        this.description = productDescription;
    }

    @Basic
    @Column(name = "product_short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String productShortDescription) {
        this.shortDescription = productShortDescription;
    }

    @Basic
    @Column(name = "product_name")
    public String getName() {
        return name;
    }

    public void setName(String productName) {
        this.name = productName;
    }

    @Basic
    @Column(name = "product_price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal productPrice) {
        this.price = productPrice;
    }

    @Basic
    @Column(name = "product_reference_code")
    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String productReferenceCode) {
        this.referenceCode = productReferenceCode;
    }

    @Basic
    @Column(name = "product_ean_13_jan_barcode")
    public String getEan13JanBarcode() {
        return ean13JanBarcode;
    }

    public void setEan13JanBarcode(String productEan13JanBarcode) {
        this.ean13JanBarcode = productEan13JanBarcode;
    }

    @Basic
    @Column(name = "product_upc")
    public String getUpc() {
        return upc;
    }

    public void setUpc(String productUpc) {
        this.upc = productUpc;
    }

    @Basic
    @Column(name = "product_enabled")
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean productEnabled) {
        this.enabled = productEnabled;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "product_visibility")
    public ProductVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(ProductVisibility productVisibility) {
        this.visibility = productVisibility;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "product_condition")
    public ProductCondition getCondition() {
        return condition;
    }

    public void setCondition(ProductCondition productCondition) {
        this.condition = productCondition;
    }

    @Basic
    @Column(name = "product_image")
    public String getImage() {
        return image;
    }

    public void setImage(String productImage) {
        this.image = productImage;
    }

    @Basic
    @Column(name = "product_tags")
    public String getTags() {
        return tags;
    }

    public void setTags(String productTags) {
        this.tags = productTags;
    }

    @Basic
    @Column(name = "product_wholesale_price")
    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal productWholesalePrice) {
        this.wholesalePrice = productWholesalePrice;
    }

    @Basic
    @Column(name = "product_retail_price")
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal productRetailPrice) {
        this.retailPrice = productRetailPrice;
    }

    @Basic
    @Column(name = "product_tax_rule")
    public Integer getTaxRule() {
        return taxRule;
    }

    public void setTaxRule(Integer productTaxRule) {
        this.taxRule = productTaxRule;
    }

    @Basic
    @Column(name = "product_unit_price")
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal productUnitPrice) {
        this.unitPrice = productUnitPrice;
    }

    @Basic
    @Column(name = "product_title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String productTitle) {
        this.title = productTitle;
    }

    @Basic
    @Column(name = "product_keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String productKeywords) {
        this.keywords = productKeywords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (enabled != product.enabled) return false;
        if (description != null ? !description.equals(product.description) : product.description != null)
            return false;
        if (shortDescription != null ? !shortDescription.equals(product.shortDescription) : product.shortDescription != null)
            return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null)
            return false;
        if (referenceCode != null ? !referenceCode.equals(product.referenceCode) : product.referenceCode != null)
            return false;
        if (ean13JanBarcode != null ? !ean13JanBarcode.equals(product.ean13JanBarcode) : product.ean13JanBarcode != null)
            return false;
        if (upc != null ? !upc.equals(product.upc) : product.upc != null) return false;
        if (visibility != null ? !visibility.equals(product.visibility) : product.visibility != null)
            return false;
        if (condition != null ? !condition.equals(product.condition) : product.condition != null)
            return false;
        if (image != null ? !image.equals(product.image) : product.image != null)
            return false;
        if (tags != null ? !tags.equals(product.tags) : product.tags != null) return false;
        if (wholesalePrice != null ? !wholesalePrice.equals(product.wholesalePrice) : product.wholesalePrice != null)
            return false;
        if (retailPrice != null ? !retailPrice.equals(product.retailPrice) : product.retailPrice != null)
            return false;
        if (taxRule != null ? !taxRule.equals(product.taxRule) : product.taxRule != null)
            return false;
        if (unitPrice != null ? !unitPrice.equals(product.unitPrice) : product.unitPrice != null)
            return false;
        if (title != null ? !title.equals(product.title) : product.title != null)
            return false;
        if (keywords != null ? !keywords.equals(product.keywords) : product.keywords != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (referenceCode != null ? referenceCode.hashCode() : 0);
        result = 31 * result + (ean13JanBarcode != null ? ean13JanBarcode.hashCode() : 0);
        result = 31 * result + (upc != null ? upc.hashCode() : 0);
        result = 31 * result + (enabled ? 1 : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (wholesalePrice != null ? wholesalePrice.hashCode() : 0);
        result = 31 * result + (retailPrice != null ? retailPrice.hashCode() : 0);
        result = 31 * result + (taxRule != null ? taxRule.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "product_cart_id", referencedColumnName = "carts_id")
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cartsByProductCartId) {
        this.cart = cartsByProductCartId;
    }

    @ManyToOne
    @JoinColumn(name = "product_category_id", referencedColumnName = "category_id", nullable = false)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category categoriesByProductCategoryId) {
        this.category = categoriesByProductCategoryId;
    }
}
