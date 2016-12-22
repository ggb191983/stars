package com.stars.interceptors;

/**
 * Created by Battlehammer on 11/12/2016.
 */

import javax.interceptor.*;
import java.lang.annotation.*;

@Inherited
@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface Logged {}
