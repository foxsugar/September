package com.code.september.eureka.client;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by sunxianping on 2018-09-28.
 */
@ConfigurationProperties(prefix = "democonfigclient")
public class Config1 {

    private String message;

    public String getMessage() {
        return message;
    }

    public Config1 setMessage(String message) {
        this.message = message;
        return this;
    }
}
