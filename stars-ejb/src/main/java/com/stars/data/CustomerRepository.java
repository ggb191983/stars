/*package com.stars.data;

import com.stars.model.*;

import javax.ejb.*;
import javax.enterprise.context.*;
import javax.inject.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.*;

/**
 * Created by Battlehammer on 23/11/2016.
 */
/*
@Local
@ApplicationScoped
public class CustomerRepository {

    @Inject
    private EntityManager em;

    public Customer findById(String id) {
        return em.find(Customer.class, id);
    }

    public Customer findByEmail(String email) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteria = cb.createQuery(Customer.class);
        Root<Customer> customer = criteria.from(Customer.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(member).where(cb.equal(member.get(Member_.name), email));
        criteria.select(customer).where(cb.equal(customer.get("email"), email));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Customer> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteria = cb.createQuery(Customer.class);
        Root<Customer> customer = criteria.from(Customer.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
        criteria.select(customer).orderBy(cb.asc(customer.get("name")));
        return em.createQuery(criteria).getResultList();
    }
}*/