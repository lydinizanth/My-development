package com.lydia.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication

public class RestApi {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(RestApi.class);
        Map<String, Object> map = new HashMap<>();
        map.put("SERVER_PORT", "8585");
        application.setDefaultProperties(map);
        application.run(args);
    }
}
