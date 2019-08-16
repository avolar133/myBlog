package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class WelcomeController {

    @RequestMapping(path = "/welcome")
    public String welcome(@RequestParam(value = "name") Optional<String> name){
        return "Welcome ".concat(name.orElse("World")).concat("!");
    }
}
