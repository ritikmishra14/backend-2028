package com.edigest.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import something.Cat;

@RestController
@RequestMapping("/hello")
public class HelloBoot {


    @Autowired
    private Dog dog;

    @Autowired
    private Cat cat;

    @GetMapping
    public String hello() {
        return dog.run();

    }

    @GetMapping("/cat")
    public String catMeow() {
        return cat.meow();
    }
}
