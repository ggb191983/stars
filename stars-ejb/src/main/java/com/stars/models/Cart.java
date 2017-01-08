package com.stars.models;

import javax.persistence.*;
import java.io.*;
import java.sql.*;

/**
 * Created by Battlehammer on 06/01/2017.
 */
@Entity
@Table(name = "carts", schema = "starsdb")
public class Cart implements Serializable {
    private int cartsId;
    private Timestamp cartsCreationDate;
    private Timestamp cartsUpdateDate;

    @Id
    @Column(name = "carts_id")
    public int getCartsId() {
        return cartsId;
    }

    public void setCartsId(int cartsId) {
        this.cartsId = cartsId;
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
        if (cartsCreationDate != null ? !cartsCreationDate.equals(cart.cartsCreationDate) : cart.cartsCreationDate != null)
            return false;
        if (cartsUpdateDate != null ? !cartsUpdateDate.equals(cart.cartsUpdateDate) : cart.cartsUpdateDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartsId;
        result = 31 * result + (cartsCreationDate != null ? cartsCreationDate.hashCode() : 0);
        result = 31 * result + (cartsUpdateDate != null ? cartsUpdateDate.hashCode() : 0);
        return result;
    }
}
