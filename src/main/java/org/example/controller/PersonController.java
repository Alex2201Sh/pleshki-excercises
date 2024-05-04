package org.example.controller;

import org.example.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping
    public Person returnDummyPerson(){
        return new Person("Dummy", 111);
    }
}
