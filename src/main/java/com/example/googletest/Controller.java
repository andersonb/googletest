package com.example.googletest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class Controller {


    private final HelloService helloService;

    public Controller(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public ResponseEntity<Hello> hello(){

        Hello hello = helloService.findAll();


        return ResponseEntity.ok(hello);

    }
}
