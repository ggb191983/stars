package com.stars.interceptors;

/**
 * Created by Battlehammer on 11/12/2016.
 */

import org.jboss.logging.*;

import javax.interceptor.*;
import java.io.*;

@Interceptor
@Logged
public class LoggingInterceptor implements Serializable {
    @AroundInvoke
    public Object log(InvocationContext context) throws Exception {
        final Logger logger =
                Logger.getLogger(context.getTarget().getClass());
        logger.infov("Executing method {0}", context.getMethod().toString());
        return context.proceed();
    }
}

