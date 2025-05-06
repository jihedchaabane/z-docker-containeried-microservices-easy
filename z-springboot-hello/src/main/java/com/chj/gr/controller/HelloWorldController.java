package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
//@CrossOrigin(origins = "*")
public class HelloWorldController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @GetMapping("/world")
    public String hello() {
    	logger.info("{}", "hello world");
        return "hello world";
    }
}
