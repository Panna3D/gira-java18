package com.example.cybersoft.javabackend.java18.gira;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class WelcomeResource {

    @GetMapping
    public String welcome (HttpServletRequest request) {
        return String.format("Welcome %s to Gira Application", request.getMethod());
    }

}
