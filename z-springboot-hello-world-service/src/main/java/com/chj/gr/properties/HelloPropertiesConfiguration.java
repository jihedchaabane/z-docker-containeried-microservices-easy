package com.chj.gr.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hello.props")
@RefreshScope
public class HelloPropertiesConfiguration {

	/**
	 * https://www.devglan.com/spring-cloud/refresh-property-config-runtime#/google_vignette
	 */
	private String helloprop1;
	private String helloprop2;
	private String helloprop3;

	public String getHelloprop1() {
		return helloprop1;
	}

	public void setHelloprop1(String helloprop1) {
		this.helloprop1 = helloprop1;
	}

	public String getHelloprop2() {
		return helloprop2;
	}

	public void setHelloprop2(String helloprop2) {
		this.helloprop2 = helloprop2;
	}

	public String getHelloprop3() {
		return helloprop3;
	}

	public void setHelloprop3(String helloprop3) {
		this.helloprop3 = helloprop3;
	}

	@Override
	public String toString() {
		return "HelloPropertiesConfiguration [helloprop1=" + helloprop1 + ", helloprop2=" + helloprop2 + ", helloprop3="
				+ helloprop3 + "]";
	}

}