package com.chj.gr.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.chj.gr.enums.EnumResourceServer;
import com.chj.gr.properties.CallerDestinationProperties;
import com.chj.gr.properties.CallerDestinationProperties.DestinationClient;

@Component
public class BarClientService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    private final RestTemplate restTemplate;
    
    private CallerDestinationProperties callerDestinationProperties; 

    public BarClientService(RestTemplate restTemplate, CallerDestinationProperties callerDestinationProperties) {
        this.restTemplate = restTemplate;
        this.callerDestinationProperties = callerDestinationProperties;
    }

    public String getBar() {
    	DestinationClient destinationClient = callerDestinationProperties.getDestinationClient(
    			EnumResourceServer.STS_BAR_SERVICE_REGISTRATION.getKey());
    	
    	/**
    	 * http://z-springboot-bar-service/bar/msg.
    	 * Appel via l'instance eureka.
    	 */
    	String barUrl = destinationClient.getResourceUri().concat("/bar/msg");
    	logger.info("Calling {}", barUrl);
        return restTemplate.getForObject(barUrl, String.class);
    }

    public String getBarProperties() {
    	DestinationClient destinationClient = callerDestinationProperties.getDestinationClient(
    			EnumResourceServer.STS_BAR_SERVICE_REGISTRATION.getKey());
    	
    	String barUrl = destinationClient.getResourceUri().concat("/bar/properties");
    	logger.info("Calling {}", barUrl);
        return restTemplate.getForObject(barUrl, String.class);
    }
}