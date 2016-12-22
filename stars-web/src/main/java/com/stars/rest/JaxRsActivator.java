/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stars.rest;

import com.stars.features.*;
import com.stars.filters.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * A class extending {@link Application} and annotated with @ApplicationPath is the Java EE 7 "no XML" approach to activating
 * JAX-RS.
 * 
 * <p>
 * Resources are served relative to the servlet path specified in the {@link ApplicationPath} annotation.
 * </p>
 */
@ApplicationPath("/api")
public class JaxRsActivator extends Application {
    private Set<Object> singletons = new HashSet<>();
    private Set<Class<?>> classes = new HashSet<>();

    public JaxRsActivator() {
        classes.add(CustomerResourceRESTService.class);
        classes.add(MemberResourceRESTService.class);
        classes.add(ProductResourceRESTService.class);
        classes.add(ShoppingCartResourceRestService.class);
        classes.add(AuthenticationResourceRESTService.class);
        classes.add(LoggingRestFilter.class);

        /*CorsFilter corsFilter = new CorsFilter();
        corsFilter.getAllowedOrigins().add("http://localhost:3000");
        corsFilter.setAllowedMethods("OPTIONS, GET, POST, DELETE, PUT, PATCH");
        singletons.add(corsFilter);*/
        singletons.add(new TokenAuthenticatedFeature());
    }
    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
