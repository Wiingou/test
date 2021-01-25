package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/home")
    public String test() {
        return "WELCOME WORLD";
    }

    @GetMapping("/home/{text}")
    public String test(@PathVariable String text) {
        return "WELCOME "+ text;
    }
}
