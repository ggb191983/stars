package com.stars.data;

import com.stars.model.Customer;
import com.stars.qualifiers.*;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Battlehammer on 25/11/2016.
 */
@Stateless
@Default
public class CustomerDaoBean implements Dao<Customer> {

    @PersistenceContext
    private EntityManager em;


    @Override
    @SuppressWarnings("unchecked")
    public List<Customer> getAll()
    {
        return em.createQuery("SELECT c FROM Customer c").getResultList();
    }

    @Override
    public Customer get(Long id)
    {
        return em.find(Customer.class, id);
    }

    @Override
    public void add(Customer customer)
    {
        em.merge(customer);
    }

    @Override
    public void remove(Long id) {
        Customer customer = em.find(Customer.class, id);
        em.remove(customer);
        em.flush();
    }
}
