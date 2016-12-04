package com.stars.service;

import com.stars.model.Customer;
import com.stars.model.Member;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

/**
 * Created by Battlehammer on 24/11/2016.
 */
@Local
@Stateless
public class CustomerRegistration {
        @Inject
        private Logger log;

        @Inject
        private EntityManager em;

        @Inject
        private Event<Member> memberEventSrc;

        public void register(Customer customer) throws Exception {
            log.info("Registering " + customer.getName());
            em.persist(customer);
        }
}
