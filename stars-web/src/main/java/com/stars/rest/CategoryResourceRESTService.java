package com.stars.rest;

import com.stars.data.*;
import com.stars.interceptors.*;
import com.stars.models.*;
import com.stars.service.*;
import org.jboss.logging.*;

import javax.inject.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by Battlehammer on 04/12/2016.
 */
@Logged
public class CategoryResourceRESTService implements CategoryContract {

    @Inject
    private Logger log;

    @Inject
    private CategoryDao dao;

    @Override
    public List<Category> getAllCategories() {
        return dao.findAll();
    }

    @Override
    public Response addCategory(Category category) {
        dao.persist(category);
        String result = "Customer created : " + category;
        log.info(result);
        return Response.status(201).entity(result).build();
    }

    @Override
    public Category getCategory(Long id) {
        return dao.find(id);
    }

    @Override
    public void updateCategory(Category category) {
        dao.persist(category);
    }
}
