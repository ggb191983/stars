package com.stars.features;

import com.stars.annotations.*;
import com.stars.filters.*;

import javax.annotation.*;
import javax.ws.rs.*;
import javax.ws.rs.container.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.*;

/**
 * Created by Battlehammer on 12/12/2016.
 */
@Provider
@PreMatching
@Priority(Priorities.AUTHENTICATION)
public class TokenAuthenticatedFeature implements DynamicFeature {
    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext featureContext) {
        TokenAuthenticated token = resourceInfo.getResourceMethod().getAnnotation(TokenAuthenticated.class);
        if (token == null) return;
        featureContext.register(new BearerTokenFilter());
    }
}
