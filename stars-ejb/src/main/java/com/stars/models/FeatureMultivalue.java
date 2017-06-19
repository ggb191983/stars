package com.stars.models;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "feature_multivalues", schema = "starsdb")
public class FeatureMultivalue implements Serializable {
    private int featureMultivalueId;
    private String featureMultivalueValue;
    private int featureMultivalueFeatureId;

    @Id
    @Column(name = "feature_multivalue_id")
    public int getFeatureMultivalueId() {
        return featureMultivalueId;
    }

    public void setFeatureMultivalueId(int featureMultivalueId) {
        this.featureMultivalueId = featureMultivalueId;
    }

    @Basic
    @Column(name = "feature_multivalue_value")
    public String getFeatureMultivalueValue() {
        return featureMultivalueValue;
    }

    public void setFeatureMultivalueValue(String featureMultivalueValue) {
        this.featureMultivalueValue = featureMultivalueValue;
    }

    @Basic
    @Column(name = "feature_multivalue_feature_id")
    public int getFeatureMultivalueFeatureId() {
        return featureMultivalueFeatureId;
    }

    public void setFeatureMultivalueFeatureId(int featureMultivalueFeatureId) {
        this.featureMultivalueFeatureId = featureMultivalueFeatureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeatureMultivalue that = (FeatureMultivalue) o;

        if (featureMultivalueId != that.featureMultivalueId) return false;
        if (featureMultivalueFeatureId != that.featureMultivalueFeatureId) return false;
        if (featureMultivalueValue != null ? !featureMultivalueValue.equals(that.featureMultivalueValue) : that.featureMultivalueValue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = featureMultivalueId;
        result = 31 * result + (featureMultivalueValue != null ? featureMultivalueValue.hashCode() : 0);
        result = 31 * result + featureMultivalueFeatureId;
        return result;
    }
}
