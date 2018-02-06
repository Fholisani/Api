package com.mydevgeek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Jenkins Server is on port 8080;\n Tomacat is running on port 8082 "
        		+ "\n To gain access start ec2 instance and then SSSH the server on Git Bash ";
    }
}