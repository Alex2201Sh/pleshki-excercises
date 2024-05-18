package org.example;

import org.example.repository.PlanetRepository;
import org.example.repository.impl.PlanetRepositoryJDBCImpl;
import org.example.service.PlanetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        PlanetRepository planetRepository = new PlanetRepositoryJDBCImpl();
//        System.out.println(planetRepository.getPlanetList());

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        PlanetService planetService = applicationContext.getBean("planetService", PlanetService.class);
//        System.out.println(planetService.getPlanetList());
    }
}