package org.itc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Value("${app.name}")
    private String appName;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Nombre de la aplicación: " + appName);
    }
}