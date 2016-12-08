package com.sbuiot.rest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by bm26903 on 8/1/2016.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories
@EntityScan("com/sbuiot/rest/entities")

public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
