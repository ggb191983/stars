package com.stars.data;

import com.stars.model.Product;
import com.stars.qualifiers.*;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

    /**
     * Created by Battlehammer on 03/12/2016.
     */
@Stateless
@QProductDao
public class ProductDaoBean implements Dao<Product> {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Product> getAll() {
        return em.createQuery("SELECT p FROM Product p").getResultList();
    }

    @Override
    public Product get(Long id) {
        return em.find(Product.class, id);
    }

    @Override
    public void remove(Long id) {
        Product product = em.find(Product.class, id);
        em.remove(product);
        em.flush();
    }

    @Override
    public void add(Product product) {
        em.merge(product);
    }
}
