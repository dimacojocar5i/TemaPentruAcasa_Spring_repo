package com.expentruacasa.exercitiudemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/")
    public String hello() {
        return "Bine Ati Venit!";
    }

    @GetMapping("/moldova")
    public String moldova() {
        return "Capitala este Chisinau.";
    }

    @GetMapping("/france")
    public String france () {
        return "Capitala este Paris.";
    }

    @GetMapping("/germany")
    public String germany() {
        return "Capitala este Berlin";
    }
}
