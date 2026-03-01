package com.kafuidev.scinexus.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "sn")
public class Configuration {

    private String about;
    private String welcomeMessage;

}
