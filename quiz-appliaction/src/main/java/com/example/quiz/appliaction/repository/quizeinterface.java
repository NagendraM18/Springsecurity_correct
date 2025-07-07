package com.example.quiz.appliaction.repository;

import com.example.quiz.appliaction.modelclass.quize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface
quizeinterface extends JpaRepository<quize,String>
{



    Optional<quize> findByQuestionnumber(int id);
}
