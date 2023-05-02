package com.radouaneoubakhane.serviceinscription.openfeingClients;


import com.radouaneoubakhane.serviceinscription.dto.EtudientRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "etudient-service", url = "${etudient.service.url}", path = "/api/etudients")

public interface EtudientClient {
    @PostMapping
    void addEtudient(EtudientRequest etudientRequest);
}
