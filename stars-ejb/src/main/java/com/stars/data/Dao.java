package com.stars.data;

import com.stars.model.Customer;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Battlehammer on 25/11/2016.
 */
@Local
public interface Dao<T> {
        /**
         * Returns the currently available contacts
         *
         * @return every contact in the database
         */
        List<T> getAll();

        /**
         * Returns a specific Contact from DB
         *
         * @param id The Id for the Contact
         * @return The specified Contact object
         */
        T get(Long id);

        /**
         * Persist a new Contact in the DB
         *
         * @param name The name of the new Contact
         * @param email The e-mail address of the new Contact
         */
        void add(T dao);

        /**
         * Removes a specific item from the DB
         *
         * @param id of the specific Contact object, which we wants to remove
         */
        void remove(Long id);
}
