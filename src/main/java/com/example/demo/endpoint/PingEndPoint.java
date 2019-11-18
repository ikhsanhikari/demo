package com.example.demo.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingEndPoint {
    @RequestMapping("")
    public String ping(){
        return "Pong";
    }
}
