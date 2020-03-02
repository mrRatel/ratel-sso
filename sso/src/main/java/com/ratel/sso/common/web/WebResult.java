package com.ratel.sso.common.web;

import lombok.Data;

/**
 * @author ratel
 * @date 2020/3/2
 */
@Data
public class WebResult<T> implements Cloneable{
    private Integer statusCode;
    private Boolean result;
    private T data;
    private String errorMsg;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
