package com.edigest.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    public String run() {
        return "dog running";
    }
}
