package com.chj.gr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.chj.gr.properties.BarPropertiesConfiguration;


@SpringBootApplication
@EnableConfigurationProperties(BarPropertiesConfiguration.class)
public class BarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarServiceApplication.class, args);
    }
}

