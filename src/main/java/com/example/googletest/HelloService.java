package com.example.googletest;

import org.springframework.stereotype.Service;

@Service
public class HelloService {


    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public Hello findAll() {
        return helloRepository.findAll().get(0);
    }
}
