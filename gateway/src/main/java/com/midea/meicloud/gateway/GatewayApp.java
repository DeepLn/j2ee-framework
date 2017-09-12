package com.midea.meicloud.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayApp.class).web(true).run(args);
    }
}
