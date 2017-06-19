package com.stars.service;

import com.stars.models.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by Battlehammer on 02/01/2017.
 */
@Path("public/category")
public interface CategoryContract {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Category> getAllCategories();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    Response addCategory(Category category);

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Category getCategory(@PathParam("id") Long id);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void updateCategory(Category category);
}
