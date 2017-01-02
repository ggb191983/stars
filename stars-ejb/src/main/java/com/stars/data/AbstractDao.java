package com.stars.data;

import javax.ejb.*;
import javax.inject.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import java.io.*;
import java.util.*;

/**
 * Created by Battlehammer on 11/12/2016.
 */
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public abstract class AbstractDao<T extends Serializable> implements Dao<T>, Serializable {

    private final Class<T> clazz;

    @Inject
    private EntityManager em;

    public AbstractDao(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T find(Object id) {
        return em.find(clazz, id);
    }

    public void persist(final T entity) {
        em.persist(entity);
    }

    public List<T> findAll() {
        final CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(clazz);
        criteriaQuery.select(criteriaQuery.from(clazz));
        return em.createQuery(criteriaQuery).getResultList();
    }

    public void deleteAll() {
        final CriteriaDelete<T> criteriaDelete = em.getCriteriaBuilder().createCriteriaDelete(clazz);
        criteriaDelete.from(clazz);
        em.createQuery(criteriaDelete).executeUpdate();
    }

    public void remove(Object id) {
        em.remove(find(id));
        em.flush();
    }

    public T edit(T entity) {
        T t = em.merge(entity);
        em.flush();
        return t;
    }

    protected EntityManager getEntityManager() {
        return em;
    }

    protected Class<T> getClazz() {
        return clazz;
    }
}