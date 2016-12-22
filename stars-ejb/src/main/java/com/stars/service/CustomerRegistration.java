package com.stars.service;

import com.stars.model.*;
import org.jboss.logging.*;

import javax.ejb.*;
import javax.enterprise.event.*;
import javax.inject.*;
import javax.persistence.*;

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
