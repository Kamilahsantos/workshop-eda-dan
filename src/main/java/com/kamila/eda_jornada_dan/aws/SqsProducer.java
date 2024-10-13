package com.kamila.eda_jornada_dan.aws;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.InvalidMessageContentsException;
import com.amazonaws.services.sqs.model.QueueDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SqsProducer {

    @Autowired
    private AmazonSQS amazonSQSClient;

    private final String eventosDan = "https://sqs.sa-east-1.amazonaws.com/771177158205/eventos-dan";


    public SqsProducer() {
    }

    public void criarEvento(String event) {
        try {
            amazonSQSClient.sendMessage(eventosDan, event);


        } catch (QueueDoesNotExistException | InvalidMessageContentsException e) {
            System.out.println("Erro ao postar o evento" + e);
        }
    }
}
