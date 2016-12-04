package com.stars.model;

import com.stars.data.*;
import org.hibernate.validator.constraints.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.*;
import java.io.*;

/**
 * Created by Battlehammer on 03/12/2016.
 */
@Entity
@XmlRootElement
@Table(name = "Products")
public class Product extends Identity implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 150)
    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
    private String title;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 5000)
    private String description;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 2000)
    private String link;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 2000)
    @Column(name = "image_link")
    private String imageLink;

    @Size(min = 1, max = 2000)
    @Column(name = "additional_image_link")
    private String additionalImageLink;

    @Size(min = 1, max = 2000)
    @Column(name = "mobile_link")
    private String mobileLink;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getAdditionalImageLink() {
        return additionalImageLink;
    }

    public void setAdditionalImageLink(String additionalImageLink) {
        this.additionalImageLink = additionalImageLink;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }
}
