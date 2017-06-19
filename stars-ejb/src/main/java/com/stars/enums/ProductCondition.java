package com.stars.enums;

/**
 * Created by Battlehammer on 02/02/2017.
 */
public enum ProductCondition {
    NEW( 0 ),
    USED( 1 ),
    REFURBISHED( 2 );

    private final Integer code;

    private ProductCondition(int code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}