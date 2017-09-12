/**
 * @(#)zipkin.java, 十月 29, 2016.
 * <p>
 * Copyright 2016 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.midea.meicloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author zhangpeng
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class Zipkin {
    public static void main(String[] args) {
        SpringApplication.run(Zipkin.class, args);
    }
}