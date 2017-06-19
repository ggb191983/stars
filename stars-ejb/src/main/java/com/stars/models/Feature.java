package com.stars.models;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "features", schema = "starsdb")
public class Feature implements Serializable {
    private int featureId;
    private String featureName;

    @Id
    @Column(name = "feature_id")
    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    @Basic
    @Column(name = "feature_name")
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feature feature = (Feature) o;

        if (featureId != feature.featureId) return false;
        if (featureName != null ? !featureName.equals(feature.featureName) : feature.featureName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = featureId;
        result = 31 * result + (featureName != null ? featureName.hashCode() : 0);
        return result;
    }
}
