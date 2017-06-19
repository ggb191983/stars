package com.stars.rest;

import com.stars.interceptors.*;
import com.stars.models.*;
import com.stars.service.*;
import com.stars.services.*;
import org.jboss.logging.*;

import javax.inject.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by Battlehammer on 04/12/2016.
 */
@Logged
public class ProductResourceRESTService implements ProductContract {

    @Inject
    private Logger log;

    @Inject
    private ProductService productService;

    @Override
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @Override
    public List<Product> getProductsByCategory(String categoryId) {
        return productService.findByCategory(Integer.valueOf(categoryId));
    }

    @Override
    public Response addProduct(Product product) {
        productService.addProduct(product);
        String result = "Customer created : " + product;
        log.info(result);
        return Response.status(201).entity(result).build();
    }

    @Override
    public Product getProduct(Long id) {
        return productService.getProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }
}
