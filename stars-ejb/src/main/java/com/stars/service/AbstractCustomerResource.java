package com.stars.service;

import com.stars.model.Customer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Battlehammer on 23/11/2016.
 */
@Path("/customers")
public interface AbstractCustomerResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Customer> getAllCustomers();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    Response addCustomer(Customer customer);

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Customer getCustomer(Long id);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void updateCustomer(Customer customer);
}
