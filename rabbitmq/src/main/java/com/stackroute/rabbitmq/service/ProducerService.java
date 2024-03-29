package com.stackroute.rabbitmq.service;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Value("${jsa.rabbitmq.exchange}")
    private String exchange;

    @Value("${jsa.rabbitmq.routingkey}")
    private String routingKey;

    public void producedMsg(String msg){
        amqpTemplate.convertAndSend(exchange, routingKey, msg);
        System.out.println("send msg="+msg);
    }

}
