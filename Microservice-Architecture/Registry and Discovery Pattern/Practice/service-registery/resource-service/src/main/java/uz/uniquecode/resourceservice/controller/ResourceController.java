package uz.uniquecode.resourceservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api/recourse")
public class ResourceController {
    private static int counter = 0;

    @Value("${server.port}")
    private String port;
    private String instanceName = "Instance- ";

    @GetMapping("/name")
    public String getServiceName() {
        return instanceName + port + " : " + counter++;
    }
}
