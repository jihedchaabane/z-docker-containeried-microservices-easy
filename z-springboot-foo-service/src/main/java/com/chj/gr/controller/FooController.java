package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.gr.properties.FooPropertiesConfiguration;

@RestController
@RequestMapping("/foo")
public class FooController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private FooPropertiesConfiguration fooPropertiesConfiguration;
	
    @Value("${foo.msg}")
   	private String fooMsg;
    
    @GetMapping("/")
    public String foo() {
    	logger.info("{}", "foo");
        return fooMsg;
    }
    

	@GetMapping("/foo-properties")
	public String getProperties() {
		return fooPropertiesConfiguration.toString();
	}
}
