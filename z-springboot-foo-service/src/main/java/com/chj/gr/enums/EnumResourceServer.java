package com.chj.gr.enums;

/**
 * ${spring.application.name}-***.yml
 */
public enum EnumResourceServer {
	STS_DEFAULT_REGISTRATION("client0",  "sts-default-registration"),
	STS_BAR_SERVICE_REGISTRATION("client1",  "sts-bar-service-registration");

    private final String key;
    private final String registrationId;

    EnumResourceServer(String key, String registrationId) {
        this.key = key;
        this.registrationId = registrationId;
    }

	public String getKey() {
		return key;
	}

	public String getRegistrationId() {
		return registrationId;
	}
}
