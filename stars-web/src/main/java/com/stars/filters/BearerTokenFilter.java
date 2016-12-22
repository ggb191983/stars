package com.stars.filters;

import javax.ws.rs.*;
import javax.ws.rs.container.*;
import javax.ws.rs.core.*;
import java.io.*;

/**
 * Created by Battlehammer on 11/12/2016.
 */
public class BearerTokenFilter implements ContainerRequestFilter {
    public void filter(ContainerRequestContext ctx) throws IOException {
        String authHeader = ctx.getHeaderString(HttpHeaders.AUTHORIZATION);
        if (authHeader == null) throw new NotAuthorizedException("Bearer");
        String token = authHeader.substring("Bearer".length()).trim();
        if (!verifyToken(token)) {
            throw new NotAuthorizedException("Authorization header must be provided");
        }
    }

    private boolean verifyToken(String token) {
        return true;
    }
}