package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
@Component
public class Greeter {
    public String greet(String input){
        return input.equals("TU Dresden")? input.concat(", Yay") : input;
    }
}
