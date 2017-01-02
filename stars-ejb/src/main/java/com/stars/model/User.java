package com.stars.model;

import javax.persistence.*;
import java.io.*;
import java.util.*;

/**
 * Created by Battlehammer on 01/01/2017.
 */
@Entity
@Table(name = "users", schema = "starsdb")
public class User implements Serializable {
    private UUID userUuid;
    private String userName;
    private Collection<Cart> cartsesByUserUuid;

    @Id
    @Column(name = "user_uuid")
    public UUID getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(UUID userUuid) {
        this.userUuid = userUuid;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userUuid.compareTo(user.userUuid) != 0) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userUuid.hashCode();
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "usersByCartsUserUuid")
    public Collection<Cart> getCartsesByUserUuid() {
        return cartsesByUserUuid;
    }

    public void setCartsesByUserUuid(Collection<Cart> cartsesByUserUuid) {
        this.cartsesByUserUuid = cartsesByUserUuid;
    }
}
