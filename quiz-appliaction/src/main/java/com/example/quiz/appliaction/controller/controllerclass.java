package com.example.quiz.appliaction.controller;

import com.example.quiz.appliaction.modelclass.quize;
import com.example.quiz.appliaction.service.servicesclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controllerclass
{
    private servicesclass service;
    @Autowired
    public controllerclass(servicesclass service)
    {
        this.service=service;

    }
    @PostMapping("/postdata")
    public String postquestion(@RequestBody quize quizequestion)
    {
        service.adddata(quizequestion);
        return "added";
    }

    @GetMapping("/getquestion")
    public List<quize> getquestion()
    {
        return service.getquestion();

    }
    @GetMapping("/getquestion/{byid}")
    public ResponseEntity<quize> getbyid(@PathVariable(value = "byid") int id)
    {
       quize object=service.findproductbyid(id);
       if(object==null)
           throw new RuntimeException("elemnt not found");
       else {
           return new ResponseEntity<>(object, HttpStatus.OK);
       }
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception e)
    {
        return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
    }
}
