package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.gr.clients.BarClientService;

@RestController
@RequestMapping("/z-springboot-foo-service")
public class Ms1BarClientController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    private final BarClientService barClientService;

    public Ms1BarClientController(BarClientService barClientService) {
        this.barClientService = barClientService;
    }

    @GetMapping("/bar")
    public String fooBar() {
    	
    	String foobar = "foo --> " + barClientService.getBar();
    	logger.info("{}", foobar);
        return foobar;
    }
    
    @GetMapping("/bar-properties")
	public String getBarProperties() {
    	String barProperties = "foo --> " + barClientService.getBarProperties();
    	logger.info("{}", barProperties);
		return barProperties;
	}

}
