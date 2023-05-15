package uz.uniquecode.resourceservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.uniquecode.resourceservice.service.ClientService;

@RestController
@RequestMapping("/api/data")
public class ClientController {
    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping
    public String getThirdPartyData(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++){
            sb.append(service.getData()).append("\n");
        }
        return sb.toString();
    }
}
