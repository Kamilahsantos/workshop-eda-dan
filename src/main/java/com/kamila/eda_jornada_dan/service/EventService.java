package com.kamila.eda_jornada_dan.service;


import com.kamila.eda_jornada_dan.aws.SqsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    SqsProducer sqsProducer;


    public void criarEvento(String event){
        sqsProducer.criarEvento(event);

    }
}
