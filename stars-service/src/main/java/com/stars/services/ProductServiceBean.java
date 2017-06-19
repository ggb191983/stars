package com.stars.services;

import com.stars.data.*;
import com.stars.models.*;

import javax.ejb.*;
import javax.inject.*;
import java.util.*;

/**
 * Created by Battlehammer on 06/03/2017.
 */

@Stateless
public class ProductServiceBean implements ProductService {

    @Inject
    private ProductDao dao;

    @Override
    public List<Product> getAllProducts() {
        return dao.findAll();
    }

    @Override
    public List<Product> findByCategory(int categoryId) {
        return dao.findByCategory(categoryId);
    }

    @Override
    public void addProduct(Product product) {
        dao.persist(product);
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
