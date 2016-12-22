package com.stars.rest;

import com.stars.service.*;

import javax.inject.*;
import javax.ws.rs.core.*;

/**
 * Created by Battlehammer on 10/12/2016.
 */
public class ShoppingCartResourceRestService implements ShoppingCartContract {

    @Inject
    private ShoppingCartServiceBean service;

    @Override
    public Response addProduct(String productId) {
        service.addProduct(productId);
        return Response.ok(service.getAllProducts(), MediaType.APPLICATION_JSON)
                .build();
    }

    @Override
    public Response getAllProducts(/*@Context HttpServletRequest context*/) {
        /*KeycloakSecurityContext securityContext = (KeycloakSecurityContext) context.getAttribute(KeycloakSecurityContext.class.getName());
        System.out.println("Holaaaaaaa");
        AccessToken accessToken = securityContext.getToken();
        System.out.println("Holaaaaaaa");
        accessToken.getOtherClaims().put("holaaaa", "amigosssssss");
        System.out.println("holaaaaaa" + accessToken.getOtherClaims().get("holaaaa"));
        System.out.println(String.format("User '%s' with email '%s' made request to CustomerService REST endpoint", accessToken.getPreferredUsername(), accessToken.getEmail()));
*/

        return Response.ok(service.getAllProducts(), MediaType.APPLICATION_JSON)
                .build();
    }
}
