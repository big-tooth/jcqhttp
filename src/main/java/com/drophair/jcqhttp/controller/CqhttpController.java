package com.drophair.jcqhttp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class CqhttpController {

    @PostMapping
    public void cqhttpListener(HttpServletRequest request) {
        Object o = request;
    }
}
