package com.stars.rest;

import com.stars.data.*;
import com.stars.model.*;
import com.stars.service.*;
import org.jboss.logging.*;

import javax.inject.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by Battlehammer on 23/11/2016.
 */

public class CustomerResourceRESTService implements AbstractCustomerResource {

    @Inject
    private Logger log;

    @Inject
    private Dao<Customer> dao;

    public List<Customer> getAllCustomers() {
        System.out.println("holaaaaaaaaaaa");
        log.info("Holaaaaaaaaaaaaaaaaa");
        return dao.getAll();
    }

    public Response addCustomer(Customer customer) {
        dao.add(customer);
        String result = "Customer created : " + customer;
        log.info(result);
        return Response.status(201).entity(result).build();
    }

    public Customer getCustomer(Long id) {
        //Customer customer= repository.get(id);
        //log.fine(result);
        return (Customer) dao.get(id);
    }

    public void updateCustomer(Customer customer) {
        dao.add(customer);
    }

}
