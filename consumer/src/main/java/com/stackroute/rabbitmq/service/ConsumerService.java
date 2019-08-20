package com.stackroute.rabbitmq.service;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @RabbitListener(queues = "${jsa.rabbitmq.queue}")
    public void receivedMsg(String msg){
        System.out.println("msg="+msg);
    }
}
