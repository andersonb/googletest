package com.example.googletest;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class GoogletestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoogletestApplication.class, args);
    }

    @Bean
    ApplicationRunner init(HelloRepository repository){

        return args ->{
            Stream.of("Onix","Ka","Hb20","Gol","Celta","Corsa","Delrey","Palio","Monza","Civic").forEach(name ->{
                Hello car = new Hello();
                car.setValue(name);
                repository.save(car);
            });

            repository.findAll().forEach(System.out::println);

        };



    }

}
