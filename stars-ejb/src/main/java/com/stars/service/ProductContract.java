package com.stars.service;

import com.stars.models.Product;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Battlehammer on 04/12/2016.
 */
@Path("public/product")
public interface ProductContract {
    @PermitAll
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> getAllProducts();

    @PermitAll
    @GET
    @Path("/cat/{id: \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> getProductsByCategory(@PathParam("id") String categoryId);

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
