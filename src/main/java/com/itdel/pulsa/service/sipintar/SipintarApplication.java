package com.itdel.pulsa.service.sipintar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SipintarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SipintarApplication.class, args);
    }

}
