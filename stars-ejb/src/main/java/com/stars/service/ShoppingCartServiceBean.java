package com.stars.service;

import com.stars.interceptors.*;
import org.jboss.annotation.security.*;
import org.jboss.logging.*;

import javax.annotation.*;
import javax.annotation.security.*;
import javax.ejb.*;
import javax.inject.*;
import java.io.*;
import java.util.*;

/**
 * Created by Battlehammer on 10/12/2016.
 */
@Named("cart")
@Stateless
@LocalBean
@SecurityDomain("keycloak")
@PermitAll
@Logged
public class ShoppingCartServiceBean implements Serializable {

    @Inject
    private Logger log;

    private Collection<String> productList = new ArrayList<>();

    @PostConstruct
    public void init() {
       log.info("Ini...");
    }

    public void addProduct(String productId) {
        productList.add(productId);
    }

    //@RolesAllowed("admin")
    public Collection<String> getAllProducts() {
        return productList;
    }

    @Remove
    public void checkOut() {
        log.info("Remove");
    }
}
