package com.example.simplegithubcheckingproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerclass {
     @GetMapping("/")
     public String greet()
     {
          return "welcome to spring security class";
     }

}
