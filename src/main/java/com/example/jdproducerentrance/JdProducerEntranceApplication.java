package com.example.jdproducerentrance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class JdProducerEntranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdProducerEntranceApplication.class, args);
    }

}

