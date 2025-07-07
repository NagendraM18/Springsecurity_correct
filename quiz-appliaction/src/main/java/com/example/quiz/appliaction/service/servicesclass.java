package com.example.quiz.appliaction.service;

import com.example.quiz.appliaction.modelclass.quize;
import com.example.quiz.appliaction.repository.quizeinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class servicesclass
{
    private quizeinterface quizeintefaceobject;
    @Autowired
    public servicesclass(quizeinterface quizeintefaceobject)
    {
        this.quizeintefaceobject=quizeintefaceobject;
    }

    public void adddata(quize quizequestion)
    {
        quizeintefaceobject.save(quizequestion);

    }

    public List<quize> getquestion() {
       return  quizeintefaceobject.findAll();
    }

    public quize findproductbyid(int id)
    {
       return  quizeintefaceobject.findByQuestionnumber(id).get();

    }
}
