package com.simultechnology.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getGreeting   () {
        return "Hello from Catalog Service";
    }
}
