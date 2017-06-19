package com.stars.models;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "products_features", schema = "starsdb")
public class ProductsFeature implements Serializable {
    private int productFeatureId;
    private String productFeatureValue;
    private Feature featuresByProductFeatureFeatureId;

    @Id
    @Column(name = "product_feature_id")
    public int getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(int productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    @Basic
    @Column(name = "product_feature_value")
    public String getProductFeatureValue() {
        return productFeatureValue;
    }

    public void setProductFeatureValue(String productFeatureValue) {
        this.productFeatureValue = productFeatureValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsFeature that = (ProductsFeature) o;

        if (productFeatureId != that.productFeatureId) return false;
        if (productFeatureValue != null ? !productFeatureValue.equals(that.productFeatureValue) : that.productFeatureValue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productFeatureId;
        result = 31 * result + (productFeatureValue != null ? productFeatureValue.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "product_feature_feature_id", referencedColumnName = "feature_id", nullable = false)
    public Feature getFeaturesByProductFeatureFeatureId() {
        return featuresByProductFeatureFeatureId;
    }

    public void setFeaturesByProductFeatureFeatureId(Feature featuresByProductFeatureFeatureId) {
        this.featuresByProductFeatureFeatureId = featuresByProductFeatureFeatureId;
    }
}
