package com.stars.services;

import com.stars.models.*;

import java.util.*;

/**
 * Created by Battlehammer on 06/03/2017.
 */
public interface ProductService {
        List<Product> getAllProducts();

        List<Product> findByCategory(int categoryId);

        void addProduct(Product product);

        Product getProduct(Long id);

        void updateProduct(Product product);
}
