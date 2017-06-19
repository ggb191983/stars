package com.stars.models;

import javax.persistence.*;
import java.io.*;

/**
 * Created by Battlehammer on 02/02/2017.
 */
@Entity
@Table(name = "categories", schema = "starsdb")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
    private int categoryId;
    private String name;
    private boolean displayed;
    private Category parent;
    private String description;
    private String coverImage;
    private String thumbnail;
    private String menuThumbnail;
    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;
    private String friendlyUrl;
    private String groupAccess;
    private String root;

    @Id
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int id) {
        this.categoryId = id;
    }

    @Basic
    @Column(name = "category_name")
    public String getName() {
        return name;
    }

    public void setName(String categoryName) {
        this.name = categoryName;
    }

    @Basic
    @Column(name = "category_displayed")
    public boolean isDisplayed() {
        return displayed;
    }

    public void setDisplayed(boolean categoryDisplayed) {
        this.displayed = categoryDisplayed;
    }

    @OneToOne
    @JoinColumn(name = "category_parent")
    public Category getParent() {
        return parent;
    }

    public void setParent(Category categoryParent) {
        this.parent = categoryParent;
    }

    @Basic
    @Column(name = "category_description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String categoryDescription) {
        this.description = categoryDescription;
    }

    @Basic
    @Column(name = "category_cover_image")
    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String categoryCoverImage) {
        this.coverImage = categoryCoverImage;
    }

    @Basic
    @Column(name = "category_thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String categoryThumbnail) {
        this.thumbnail = categoryThumbnail;
    }

    @Basic
    @Column(name = "category_menu_thumbnail")
    public String getMenuThumbnail() {
        return menuThumbnail;
    }

    public void setMenuThumbnail(String categoryMenuThumbnail) {
        this.menuThumbnail = categoryMenuThumbnail;
    }

    @Basic
    @Column(name = "category_meta_title")
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String categoryMetaTitle) {
        this.metaTitle = categoryMetaTitle;
    }

    @Basic
    @Column(name = "category_meta_description")
    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String categoryMetaDescription) {
        this.metaDescription = categoryMetaDescription;
    }

    @Basic
    @Column(name = "category_meta_keywords")
    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String categoryMetaKeywords) {
        this.metaKeywords = categoryMetaKeywords;
    }

    @Basic
    @Column(name = "category_friendly_url")
    public String getFriendlyUrl() {
        return friendlyUrl;
    }

    public void setFriendlyUrl(String categoryFriendlyUrl) {
        this.friendlyUrl = categoryFriendlyUrl;
    }

    @Basic
    @Column(name = "category_group_access")
    public String getGroupAccess() {
        return groupAccess;
    }

    public void setGroupAccess(String categoryGroupAccess) {
        this.groupAccess = categoryGroupAccess;
    }

    @Basic
    @Column(name = "category_root")
    public String getRoot() {
        return root;
    }

    public void setRoot(String categoryRoot) {
        this.root = categoryRoot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryId != category.categoryId) return false;
        if (displayed != category.displayed) return false;
        if (name != null ? !name.equals(category.name) : category.name != null)
            return false;
        if (parent != null ? !parent.equals(category.parent) : category.parent != null)
            return false;
        if (description != null ? !description.equals(category.description) : category.description != null)
            return false;
        if (coverImage != null ? !coverImage.equals(category.coverImage) : category.coverImage != null)
            return false;
        if (thumbnail != null ? !thumbnail.equals(category.thumbnail) : category.thumbnail != null)
            return false;
        if (menuThumbnail != null ? !menuThumbnail.equals(category.menuThumbnail) : category.menuThumbnail != null)
            return false;
        if (metaTitle != null ? !metaTitle.equals(category.metaTitle) : category.metaTitle != null)
            return false;
        if (metaDescription != null ? !metaDescription.equals(category.metaDescription) : category.metaDescription != null)
            return false;
        if (metaKeywords != null ? !metaKeywords.equals(category.metaKeywords) : category.metaKeywords != null)
            return false;
        if (friendlyUrl != null ? !friendlyUrl.equals(category.friendlyUrl) : category.friendlyUrl != null)
            return false;
        if (groupAccess != null ? !groupAccess.equals(category.groupAccess) : category.groupAccess != null)
            return false;
        if (root != null ? !root.equals(category.root) : category.root != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (displayed ? 1 : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (coverImage != null ? coverImage.hashCode() : 0);
        result = 31 * result + (thumbnail != null ? thumbnail.hashCode() : 0);
        result = 31 * result + (menuThumbnail != null ? menuThumbnail.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (metaDescription != null ? metaDescription.hashCode() : 0);
        result = 31 * result + (metaKeywords != null ? metaKeywords.hashCode() : 0);
        result = 31 * result + (friendlyUrl != null ? friendlyUrl.hashCode() : 0);
        result = 31 * result + (groupAccess != null ? groupAccess.hashCode() : 0);
        result = 31 * result + (root != null ? root.hashCode() : 0);
        return result;
    }
}
