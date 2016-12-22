package com.stars.rest;

import com.stars.data.*;
import com.stars.model.*;
import com.stars.qualifiers.*;
import com.stars.service.*;
import org.jboss.logging.*;

import javax.inject.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by Battlehammer on 04/12/2016.
 */
public class ProductResourceRESTService implements ProductContract{

    @Inject
    private Logger log;

    @Inject
    @QProductDao
    private Dao<Product> dao;

    @Override
    public List<Product> getAllProducts() {
        System.out.println("holaaaaaaaaaaa");
        log.info("Holaaaaaaaaaaaaaaaaa");
        return dao.getAll();
    }

    @Override
    public Response addProduct(Product product) {
        dao.add(product);
        String result = "Customer created : " + product;
        log.info(result);
        return Response.status(201).entity(result).build();
    }

    @Override
    public Product getProduct(Long id) {
        return (Product) dao.get(id);
    }

    @Override
    public void updateProduct(Product product) {
        dao.add(product);
    }
}
