package com.chj.gr.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.chj.gr.config.properties.CallerDestinationProperties;
import com.chj.gr.config.properties.CallerDestinationProperties.DestinationClient;
import com.chj.gr.enums.EnumResourceServer;

@Component
public class HelloWorldClientService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    private final RestTemplate restTemplate;
    
    private CallerDestinationProperties callerDestinationProperties; 

    public HelloWorldClientService(
    		@Qualifier("restTemplate") RestTemplate restTemplate, 
    		CallerDestinationProperties callerDestinationProperties) {
        this.restTemplate = restTemplate;
        this.callerDestinationProperties = callerDestinationProperties;
    }

    public String get1() {
    	DestinationClient destinationClient = callerDestinationProperties.getDestinationClient(
    			EnumResourceServer.STS_HELLOWORLD_SERVICE_REGISTRATION.getKey());
    	
    	String url = destinationClient.getResourceUri().concat("/z-springboot-hello-world-service/hello");
    	logger.info("Calling {}", url);
        return restTemplate.getForObject(url, String.class);
    }

    public String get2() {
    	DestinationClient destinationClient = callerDestinationProperties.getDestinationClient(
    			EnumResourceServer.STS_HELLOWORLD_SERVICE_REGISTRATION.getKey());
    	
    	String url = destinationClient.getResourceUri().concat("/z-springboot-hello-world-service/hello-property");
    	logger.info("Calling {}", url);
        return restTemplate.getForObject(url, String.class);
    }

    public String get3() {
    	DestinationClient destinationClient = callerDestinationProperties.getDestinationClient(
    			EnumResourceServer.STS_HELLOWORLD_SERVICE_REGISTRATION.getKey());
    	
    	String url = destinationClient.getResourceUri().concat("/z-springboot-hello-world-service/display-properties");
    	logger.info("Calling {}", url);
        return restTemplate.getForObject(url, String.class);
    }
}