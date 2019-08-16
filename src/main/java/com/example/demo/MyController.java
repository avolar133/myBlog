package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;


@Controller
public class MyController {

    private final Greeter greeter;

    public MyController(Greeter greeter) {
        this.greeter = greeter;
    }

    //@GetMapping(path = "/hello") <--- the same
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
                        //@RequestParam(name = "name", required = false, defaultValue = "world") String name , Model model
    public String hello(@RequestParam Optional<String> name, Model model){

        //model.addAttribute("name",name.orElse("World!"));
        String whoToGreet = name.map(it -> greeter.greet(it)).orElse("World");

        model.addAttribute("name", whoToGreet);
        return "hello";
    }
}
