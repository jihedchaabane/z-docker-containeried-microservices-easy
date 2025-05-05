package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.gr.clients.BarClientService;
import com.chj.gr.properties.FooPropertiesConfiguration;

@RestController
public class FooController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    private final BarClientService barClientService;

    public FooController(BarClientService barClientService) {
        this.barClientService = barClientService;
    }

    @Value("${foo.msg:Config Server is not working. Please check...}")
   	private String fooMsg;
    
    @GetMapping("/")
    public String foo() {
    	logger.info("{}", "foo");
        return fooMsg;
    }
    
    @Autowired
	private FooPropertiesConfiguration fooPropertiesConfiguration;

	@GetMapping("/foo-properties")
	public String getProperties() {
		return fooPropertiesConfiguration.toString();
	}

    @GetMapping("/foobar")
    public String fooBar() {
    	
    	String foobar = "foo --> " + barClientService.getBar();
    	logger.info("{}", foobar);
        return foobar;
    }
    
    @GetMapping("/bar-properties")
	public String getBarProperties() {
    	String barProperties =  barClientService.getBarProperties();
    	logger.info("{}", barProperties);
		return barProperties;
	}

}
