package io.datajek.spring.basics.movierecommendersystem.controller;

import io.datajek.spring.basics.movierecommendersystem.filter.CollaborativeFilter;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MovieController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(CollaborativeFilter collaborativeFilter) {
        System.out.println(Arrays.toString(collaborativeFilter.getRecommendations("test")));
        return ResponseEntity.ok().body("Response with headers\n");
    }

    @PostMapping("/hello")
    public String helloPut() {
        return "PUT Request received";

    }

    @GetMapping("/info")
    public String info(){
        System.out.println("Inside info");
        return "API Successful";
    }
}
