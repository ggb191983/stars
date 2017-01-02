package com.stars.model;

import javax.persistence.*;
import java.io.*;
import java.sql.*;
import java.util.*;

/**
 * Created by Battlehammer on 01/01/2017.
 */
@Entity
@Table(name = "carts", schema = "starsdb")
public class Cart implements Serializable {
    private int cartsId;
    private UUID cartsUserUuid;
    private Timestamp cartsCreationDate;
    private Timestamp cartsUpdateDate;
    private User usersByCartsUserUuid;
    private Collection<Product> productsesByCartsId;

    @Id
    @Column(name = "carts_id")
    public int getCartsId() {
        return cartsId;
    }

    public void setCartsId(int cartsId) {
        this.cartsId = cartsId;
    }

    @Basic
    @Column(name = "carts_user_uuid", insertable = false, updatable = false)
    public UUID getCartsUserUuid() {
        return cartsUserUuid;
    }

    public void setCartsUserUuid(UUID cartsUserUuid) {
        this.cartsUserUuid = cartsUserUuid;
    }

    @Basic
    @Column(name = "carts_creation_date")
    public Timestamp getCartsCreationDate() {
        return cartsCreationDate;
    }

    public void setCartsCreationDate(Timestamp cartsCreationDate) {
        this.cartsCreationDate = cartsCreationDate;
    }

    @Basic
    @Column(name = "carts_update_date")
    public Timestamp getCartsUpdateDate() {
        return cartsUpdateDate;
    }

    public void setCartsUpdateDate(Timestamp cartsUpdateDate) {
        this.cartsUpdateDate = cartsUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        if (cartsId != cart.cartsId) return false;
        if (cartsUserUuid.compareTo(cart.cartsUserUuid) != 0) return false;
        if (cartsCreationDate != null ? !cartsCreationDate.equals(cart.cartsCreationDate) : cart.cartsCreationDate != null)
            return false;
        if (cartsUpdateDate != null ? !cartsUpdateDate.equals(cart.cartsUpdateDate) : cart.cartsUpdateDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartsId;
        result = 31 * result + cartsUserUuid.hashCode();
        result = 31 * result + (cartsCreationDate != null ? cartsCreationDate.hashCode() : 0);
        result = 31 * result + (cartsUpdateDate != null ? cartsUpdateDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "carts_user_uuid", referencedColumnName = "user_uuid", nullable = false)
    public User getUsersByCartsUserUuid() {
        return usersByCartsUserUuid;
    }

    public void setUsersByCartsUserUuid(User usersByCartsUserUuid) {
        this.usersByCartsUserUuid = usersByCartsUserUuid;
    }

    @OneToMany(mappedBy = "cartsByProductCartId")
    public Collection<Product> getProductsesByCartsId() {
        return productsesByCartsId;
    }

    public void setProductsesByCartsId(Collection<Product> productsesByCartsId) {
        this.productsesByCartsId = productsesByCartsId;
    }
}
