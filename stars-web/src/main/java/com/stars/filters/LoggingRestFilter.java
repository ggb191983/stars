package com.stars.filters;

import org.jboss.logging.*;
import org.keycloak.*;

import javax.inject.*;
import javax.ws.rs.container.*;
import javax.ws.rs.ext.Provider;
import java.io.*;

/**
 * Created by Battlehammer on 11/12/2016.
 */
@Provider
public class LoggingRestFilter implements ContainerRequestFilter, ContainerResponseFilter {
    @Inject
    private Logger logger;

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        KeycloakPrincipal userPrincipal = (KeycloakPrincipal) requestContext.getSecurityContext().getUserPrincipal();
        //responseContext.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
        //logger.info(userPrincipal.getKeycloakSecurityContext().getIdToken().getEmail());
        if(requestContext.getSecurityContext().getUserPrincipal() != null)
            logger.info(requestContext.getSecurityContext().getUserPrincipal().getName());

    }

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        //logger.info(requestContext.getMethod() +  " on " + requestContext.getUriInfo().getPath());
    }
}