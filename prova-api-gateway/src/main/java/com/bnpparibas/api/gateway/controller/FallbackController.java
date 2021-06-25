package com.bnpparibas.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/simcardServiceFallback")
    public String provaServiceFallbackMethod(){
        return "SimCard Service is taking longer than usual."+
                " Please try again later.";
    }
}
