package com.stars.filters;

import javax.ws.rs.container.*;
import javax.ws.rs.ext.*;
import java.io.*;

/**
 * Created by Battlehammer on 04/12/2016.
 */
@Provider
public class CORSFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        containerResponseContext.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
        containerResponseContext.getHeaders().putSingle("Access-Control-Allow-Credentials", "true");
        containerResponseContext.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
        containerResponseContext.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");
    }
}