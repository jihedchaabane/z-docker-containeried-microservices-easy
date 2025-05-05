package com.chj.gr.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BarClientService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    private final RestTemplate restTemplate;

    public BarClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getBar() {
    	
    	String barUrl = "http://z-springboot-bar-service/msg";
    	logger.info("Calling {}", barUrl);
        return restTemplate.getForObject(barUrl, String.class);
    }

    public String getBarProperties() {
    	
    	String barUrl = "http://z-springboot-bar-service/properties";
    	logger.info("Calling {}", barUrl);
        return restTemplate.getForObject(barUrl, String.class);
    }
}