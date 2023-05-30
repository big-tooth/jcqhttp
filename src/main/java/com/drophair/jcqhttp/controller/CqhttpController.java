package com.drophair.jcqhttp.controller;

import com.drophair.jcqhttp.service.impl.CqbotServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class CqhttpController {

    @Resource
    private CqbotServiceImpl impl;

    @PostMapping
    public void cqhttpListener(HttpServletRequest request) {
        impl.cqbotEvenHandle(request);
    }
}
