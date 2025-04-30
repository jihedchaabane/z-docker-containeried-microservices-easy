package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.gr.properties.HelloPropertiesConfiguration;

@RestController
public class HelloWorldController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Value("${hello.msg:Config Server is not working. Please check...}")
   	private String helloMsg;
    
    @GetMapping("/hello")
    public String foo() {
    	logger.info("{}", "hello world");
        return helloMsg;
    }
    
    @Autowired
	private HelloPropertiesConfiguration helloPropertiesConfiguration;

	@GetMapping("/display-properties")
	public String getProperties() {
		return helloPropertiesConfiguration.toString();
	}
}
