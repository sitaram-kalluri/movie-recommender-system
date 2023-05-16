package io.datajek.spring.basics.movierecommendersystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(Authentication authentication) {
        return ResponseEntity.ok().body("Response with headers\n");

    }

    @PostMapping("/hello")
    public String helloPut() {
        return "PUT Request received";
    }
}
