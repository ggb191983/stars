package com.stars.service;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * Created by Battlehammer on 10/12/2016.
 */
@Path("/cart")
public interface ShoppingCartContract {
    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response addCart(@PathParam("id") String productId);

    //@RolesAllowed("admin")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response getAllCarts();
}
