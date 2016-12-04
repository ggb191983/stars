package com.stars.service;

import com.stars.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by Battlehammer on 04/12/2016.
 */
@Path("/products")
public interface ProductContract {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> getAllProducts();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    Response addProduct(Product customer);

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Product getProduct(Long id);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void updateProduct(Product product);
}
