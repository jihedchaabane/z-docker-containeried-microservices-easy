package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.gr.clients.HelloClientService;

@RestController
@RequestMapping("/foo/hello")
public class Ms2HelloClientController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    private final HelloClientService helloClientService;

    public Ms2HelloClientController(HelloClientService helloClientService) {
        this.helloClientService = helloClientService;
    }

    @GetMapping("/")
    public String get() {
    	
    	String foo = "foo --> " + helloClientService.get();
    	logger.info("{}", foo);
        return foo;
    }

}
