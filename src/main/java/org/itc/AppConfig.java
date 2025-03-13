package org.itc;

import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;


public class AppConfig {

    @Autowired
    private Environment env;

    @Bean
    public String appName() {
        return env.getProperty("app.name");
    }
}