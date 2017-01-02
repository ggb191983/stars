package com.stars.rest;

import com.stars.data.*;
import com.stars.interceptors.*;
import com.stars.model.*;
import com.stars.service.*;
import org.jboss.logging.*;

import javax.inject.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by Battlehammer on 04/12/2016.
 */
@Logged
public class ProductResourceRESTService implements ProductContract{

    @Inject
    private Logger log;

    @Inject
    private ProductDao dao;

    @Override
    public List<Product> getAllProducts() {
        return dao.findAll();
    }

    @Override
    public Response addProduct(Product product) {
        dao.persist(product);
        String result = "Customer created : " + product;
        log.info(result);
        return Response.status(201).entity(result).build();
    }

    @Override
    public Product getProduct(Long id) {
        return dao.find(id);
    }

    @Override
    public void updateProduct(Product product) {
        dao.persist(product);
    }
}
