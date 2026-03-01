package com.kafuidev.scinexus;

import com.kafuidev.scinexus.config.Configuration;
import com.kafuidev.scinexus.config.DataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = Configuration.class)
public class ScinexusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScinexusApplication.class, args);
    }

}
