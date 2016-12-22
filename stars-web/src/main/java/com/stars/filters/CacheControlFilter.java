package com.stars.filters;

import javax.ws.rs.container.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.*;
import java.io.*;

/**
 * Created by Battlehammer on 11/12/2016.
 */
@Provider
public class CacheControlFilter implements ContainerResponseFilter {
    public void filter(ContainerRequestContext req, ContainerResponseContext res)
            throws IOException
    {
        if (req.getMethod().equals("GET")) {
            CacheControl cc = new CacheControl();
            cc.setMaxAge(100);
            //req.getHeaders().add("Cache-Control", cc);
        }
    }
}