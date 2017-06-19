package com.stars.enums;

/**
 * Created by Battlehammer on 02/02/2017.
 */
public enum ProductVisibility {
    EVERYWHERE( 0 ),
    CATALOG( 1 ),
    SEARCH( 2 ),
    NOWHERE( 3 );

    private final Integer code;

    private ProductVisibility(int code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}