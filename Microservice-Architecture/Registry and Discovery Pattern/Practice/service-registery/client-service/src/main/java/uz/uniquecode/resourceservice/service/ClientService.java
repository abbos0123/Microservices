package uz.uniquecode.resourceservice.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {
    private final RestTemplate restTemplate;

    public ClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getData(){
       return restTemplate.getForObject("http://RESOURCE-SERVICE/api/recourse/name", String.class);
    }
}
