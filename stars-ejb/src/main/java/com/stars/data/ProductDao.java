package com.stars.data;

import com.stars.models.Product;

import java.util.List;

/**
 * Created by Battlehammer on 24/12/2016.
 */
public class ProductDao extends AbstractDao<Product> {
    public ProductDao() {
        super(Product.class);
    }

    public List<Product> findByCategory(int categoryId) {
        return getEntityManager().createQuery("SELECT p FROM Product p WHERE p.category.categoryId = :categoryId")
        .setParameter("categoryId", categoryId)
                .getResultList();
    }
}
