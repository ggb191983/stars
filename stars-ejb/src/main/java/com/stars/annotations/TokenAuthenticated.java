package com.stars.annotations;

import java.lang.annotation.*;

/**
 * Created by Battlehammer on 12/12/2016.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TokenAuthenticated {
}
