package com.yt.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller公共组件
 */
public abstract class AbstractController {
    @Autowired
    private HttpServletRequest request;

    protected String getContextPath() {
        return request.getContextPath();
    }

}
