package com.stars.data;

import com.stars.models.*;

import javax.persistence.*;
import java.util.*;

/**
 * Created by Battlehammer on 02/01/2017.
 */
public class CategoryDao extends AbstractDao<Category> {
    public CategoryDao() {
        super(Category.class);
    }

    private EntityGraph getEntityGraph() {
        return getEntityManager().getEntityGraph("Category");
    }

    public Category find(Object id) {
        Map hints = new HashMap();
        hints.put("javax.persistence.fetchgraph", getEntityGraph());

        return getEntityManager().find(getClazz(), id, hints);
    }

    public List<Category> findAll() {
        EntityGraph entityGraph = getEntityManager().getEntityGraph("Category");
        return getEntityManager().createNamedQuery("Category.findAll", getClazz()).setHint("javax.persistence.fetchgraph", getEntityGraph()).getResultList();
    }
}
