package com.stars.service;

import javax.servlet.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * Created by Battlehammer on 13/12/2016.
 */
@Path("/auth")
public interface AuthenticationContract {
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response auth(@QueryParam("code") String code, @QueryParam("state") String state, @Context ServletContext context);

    @GET
    @Path("/token")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response token(@QueryParam("access_token") String accessToken,
                   @QueryParam("expires_in") int expireIn,
                   @QueryParam("refresh_expires_in") int refreshExpiresIn,
                   @QueryParam("refresh_token") String refreshToken,
                   @QueryParam("token_type") String tokenType,
                   @QueryParam("id_token") String IdToken);
}
