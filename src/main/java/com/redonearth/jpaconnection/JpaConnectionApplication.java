package com.redonearth.jpaconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.redonearth.jpaconnection"})
@EnableJpaRepositories(basePackages = {"com.redonearth.jpaconnection"})
public class JpaConnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaConnectionApplication.class, args);
    }

}
