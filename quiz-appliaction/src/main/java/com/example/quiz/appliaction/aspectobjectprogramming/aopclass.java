package com.example.quiz.appliaction.aspectobjectprogramming;

import com.example.quiz.appliaction.service.servicesclass;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aopclass
{
   @Before("within(com.example.quiz.appliaction.service.*)")
    public void advicer()
    {
        System.out.println("inside aop to get data");
    }
}
