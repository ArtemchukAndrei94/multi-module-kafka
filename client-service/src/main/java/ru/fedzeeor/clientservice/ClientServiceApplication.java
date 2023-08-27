package ru.fedzeeor.clientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ClientServiceApplication {
    public static void main(String[]args){
        SpringApplication.run(ClientServiceApplication.class, args);
    }
}

