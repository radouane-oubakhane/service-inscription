package com.radouaneoubakhane.serviceinscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceInscriptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceInscriptionApplication.class, args);
    }

}
