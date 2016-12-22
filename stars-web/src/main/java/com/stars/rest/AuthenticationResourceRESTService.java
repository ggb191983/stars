package com.stars.rest;

import com.stars.service.*;
import org.jboss.logging.*;
import org.keycloak.adapters.*;

import javax.inject.*;
import javax.servlet.*;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;
import java.io.*;

/**
 * Created by Battlehammer on 13/12/2016.
 */
public class AuthenticationResourceRESTService implements AuthenticationContract {

    @Inject
    private Logger log;

    @Override
    public Response auth(String code, String status, ServletContext context) {
        InputStream config = context.getResourceAsStream("/WEB-INF/keycloak.json");
        KeycloakDeployment deployment = KeycloakDeploymentBuilder.build(config);
        Client client = ClientBuilder.newClient();
        client.target(deployment.getAuthServerBaseUrl().concat("/token"));
        client.property("grant_type", "authorization_code");
        client.property("code", code);
        client.property("client_id", deployment.getClientAuthenticator().getId());
        client.property("client_secret", deployment.getResourceCredentials().get("secret"));
        client.property("redirect_uri", "https://localhost:8443/stars-web/api/token");
        return Response.ok().build();
    }

    @Override
    public Response token(String accessToken, int expireIn, int refreshExpiresIn, String refreshToken, String tokenType, String IdToken) {
        log.info("accessToken: " + accessToken);
        return null;
    }
}
