package com.chj.gr.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "foo.props")
@RefreshScope
public class FooPropertiesConfiguration {

	/**
	 * https://www.devglan.com/spring-cloud/refresh-property-config-runtime#/google_vignette
	 */
	private String fooprop1;
	private String fooprop2;
	private String fooprop3;

	public String getFooprop1() {
		return fooprop1;
	}

	public void setFooprop1(String fooprop1) {
		this.fooprop1 = fooprop1;
	}

	public String getFooprop2() {
		return fooprop2;
	}

	public void setFooprop2(String fooprop2) {
		this.fooprop2 = fooprop2;
	}

	public String getFooprop3() {
		return fooprop3;
	}

	public void setFooprop3(String fooprop3) {
		this.fooprop3 = fooprop3;
	}

	@Override
	public String toString() {
		return "FooPropertiesConfiguration [fooprop1=" + fooprop1 + ", fooprop2=" + fooprop2 + ", fooprop3=" + fooprop3
				+ "]";
	}

}