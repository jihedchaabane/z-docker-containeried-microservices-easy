package com.chj.gr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.gr.properties.BarPropertiesConfiguration;

@RestController
public class BarController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BarPropertiesConfiguration barPropertiesConfiguration;
	@Value("${msg:Config Server is not working. Please check...}")
	private String msg;
	

	@GetMapping("/")
	public String bar() {

		logger.info("bar is returned");
		return "bar";
	}

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