package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.gr.properties.BarPropertiesConfiguration;

@RestController
@RequestMapping("/z-springboot-bar-service")
public class BarController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BarPropertiesConfiguration barPropertiesConfiguration;
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/msg")
	public String getMsg() {
		logger.info("{} is returned", this.msg);
		return this.msg;
	}
	
	@GetMapping("/properties")
	public String getProperties() {
		logger.info("{} is returned", this.barPropertiesConfiguration.toString());
		return this.barPropertiesConfiguration.toString();
	}
}