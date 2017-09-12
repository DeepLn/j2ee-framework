package com.midea.meicloud.trubine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TurbineApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineApp.class).web(true).run(args);
    }
}
