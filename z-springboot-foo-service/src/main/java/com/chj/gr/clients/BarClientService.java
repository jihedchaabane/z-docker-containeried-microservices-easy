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
public class BarClientService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    private final RestTemplate restTemplate;
    
    private CallerDestinationProperties callerDestinationProperties; 

    public BarClientService(
    		@Qualifier("restTemplate") RestTemplate restTemplate, 
    		CallerDestinationProperties callerDestinationProperties) {
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
    	String barUrl = destinationClient.getResourceUri().concat("/z-springboot-bar-service/msg");
    	logger.info("Calling {}", barUrl);
        return restTemplate.getForObject(barUrl, String.class);
    }

    public String getBarProperties() {
    	DestinationClient destinationClient = callerDestinationProperties.getDestinationClient(
    			EnumResourceServer.STS_BAR_SERVICE_REGISTRATION.getKey());
    	
    	String barUrl = destinationClient.getResourceUri().concat("/z-springboot-bar-service/properties");
    	logger.info("Calling {}", barUrl);
        return restTemplate.getForObject(barUrl, String.class);
    }
}