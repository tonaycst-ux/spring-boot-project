package com.example.mag.controller;

import com.example.mag.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.mag.service.MessageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class HomeController {
    @Autowired
    MessageService ms;
    @GetMapping("/")
    public String hello(){
        return "Application is running";
    }
    @PostMapping("/send")
    public Message send(@RequestBody String s){
        return ms.setMessage(s);
    }
    @GetMapping("/messages")
    public List<Message> getMessage(){
        return ms.getMessage();
    }
}
