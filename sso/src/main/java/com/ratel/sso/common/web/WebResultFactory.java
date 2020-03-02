package com.ratel.sso.common.web;

import com.ratel.sso.constant.WebResultConstant;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ratel
 * @date 2020/3/2
 */
@Slf4j
public class WebResultFactory {
    private static volatile WebResult webResult;

    public static <T> WebResult success(T data) {
        try {
            WebResult webResult = getWebResult();
            webResult.setData(data);
            webResult.setResult(true);
            webResult.setStatusCode(WebResultConstant.SUCCESS);
            return webResult;
        } catch (CloneNotSupportedException e) {
            log.warn("clone webResult error !!!",e);
        }
        WebResult<T> tWebResult = new WebResult<>();
        tWebResult.setData(data);
        tWebResult.setResult(true);
        tWebResult.setStatusCode(WebResultConstant.SUCCESS);
        tWebResult.setErrorMsg("clone webResult error !!!");
        return tWebResult;
    }

    public static <T> WebResult error(String errorMsg) {
        try {
            WebResult webResult = getWebResult();
            webResult.setResult(false);
            webResult.setStatusCode(WebResultConstant.ERROR);
            webResult.setErrorMsg(errorMsg);
            return webResult;
        } catch (CloneNotSupportedException e) {
            log.warn("clone webResult error !!!",e);
        }
        WebResult<T> tWebResult = new WebResult<>();
        tWebResult.setResult(false);
        tWebResult.setStatusCode(WebResultConstant.SUCCESS);
        tWebResult.setErrorMsg(errorMsg);
        return tWebResult;
    }

    /**
     * 单例   双重检查锁  禁止指令重排
     * @return
     * @throws CloneNotSupportedException
     */
    private static WebResult getWebResult() throws CloneNotSupportedException {
        if (webResult != null) {
            return (WebResult) webResult.clone();
        }
        synchronized (WebResultFactory.class) {
            if (webResult != null) {
               return (WebResult) webResult.clone();
            }
            webResult = new WebResult();
            return webResult;
        }
    }
}
