package com.chj.gr.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "props")
@RefreshScope
public class BarPropertiesConfiguration {

	/**
	 * https://www.devglan.com/spring-cloud/refresh-property-config-runtime#/google_vignette
	 */
	private String property1;
	private String property2;
	private String property3;
//	private String property4Encrypted;
	private String property5;
	private String property6;
	
	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public String getProperty2() {
		return property2;
	}

	public void setProperty2(String property2) {
		this.property2 = property2;
	}

	public String getProperty3() {
		return property3;
	}

	public void setProperty3(String property3) {
		this.property3 = property3;
	}

//	public String getProperty4Encrypted() {
//		return property4Encrypted;
//	}
//
//	public void setProperty4Encrypted(String property4Encrypted) {
//		this.property4Encrypted = property4Encrypted;
//	}

	public String getProperty5() {
		return property5;
	}

	public void setProperty5(String property5) {
		this.property5 = property5;
	}

	public String getProperty6() {
		return property6;
	}

	public void setProperty6(String property6) {
		this.property6 = property6;
	}

	@Override
	public String toString() {
		return "BarPropertiesConfiguration [property1=" + property1 + ", property2=" + property2 + ", property3="
				+ property3 + ", property5=" + property5 + ", property6=" + property6 + "]";
	}



}