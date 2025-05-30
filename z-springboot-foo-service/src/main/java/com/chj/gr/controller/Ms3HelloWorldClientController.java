package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.gr.clients.HelloWorldClientService;

@RestController
@RequestMapping("/z-springboot-foo-service")
public class Ms3HelloWorldClientController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    private final HelloWorldClientService helloWorldClientService;

    public Ms3HelloWorldClientController(HelloWorldClientService helloWorldClientService) {
        this.helloWorldClientService = helloWorldClientService;
    }

    @GetMapping("/helloworld")
    public String get1() {
    	
    	String foo = "foo --> " + helloWorldClientService.get1();
    	logger.info("{}", foo);
        return foo;
    }
    
    @GetMapping("/helloworld/hello-property")
    public String get2() {
    	
    	String foo = "foo --> " + helloWorldClientService.get2();
    	logger.info("{}", foo);
        return foo;
    }
    
    @GetMapping("/helloworld/display-properties")
    public String get3() {
    	
    	String foo = "foo --> " + helloWorldClientService.get3();
    	logger.info("{}", foo);
        return foo;
    }

}
