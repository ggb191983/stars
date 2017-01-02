package com.stars.data;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Battlehammer on 25/11/2016.
 */
@Local
public interface Dao<T> {
        /**
         * Returns the currently available item
         *
         *
         * @return every contact in the database
         */
        List<T> findAll();

        /**
         * Returns a specific item from DB
         *
         * @param id The Id for the object
         * @return The specified object
         */
        T find(Object id);

        /**
         * Persist a new item in the DB
         *
         * @param entity The name of the new object
         */
        void persist(T entity);

        /**
         * Persist a new item in the DB
         *
         * @param entity The name of the object
         * @return The specified object
         */
        T edit(T entity);

        /**
         * Removes a specific item from the DB
         *
         * @param id of the specific object, which we wants to remove
         */
        void remove(Object id);
}
