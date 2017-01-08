package com.stars.service;

import com.stars.models.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by Battlehammer on 04/12/2016.
 */
@Path("/product")
public interface ProductContract {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> getAllProducts();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    Response addProduct(Product product);

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Product getProduct(@PathParam("id") Long id);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void updateProduct(Product product);
}
