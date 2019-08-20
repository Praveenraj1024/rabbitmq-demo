package com.stackroute.rabbitmq.controller;
import com.stackroute.rabbitmq.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value= "api/v1")
public class ProducerController {

    @Autowired
    private ProducerService producerService;


    public ProducerController(ProducerService producerService)
    {
        this.producerService=producerService;
    }

    @PostMapping("/send")
    public String  sendMessage(@RequestParam("msg") String msg){
        producerService.producedMsg(msg);
        return "sent successfully";
    }
}
