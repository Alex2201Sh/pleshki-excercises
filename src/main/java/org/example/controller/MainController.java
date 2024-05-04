package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping()
    public String mainGet(){
        return "main GET method";
    }

    @GetMapping(params = "name")
    public String mainGetWithParams(@RequestParam String name){
        return "Hello " + name;
    }

    @PostMapping()
    public String mainPost(@RequestBody String body){
        System.err.println(body);
        return body;
    }

}
