package com.example.mag.service;

import com.example.mag.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mag.repository.MessageRepo;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepo mr;
    public Message setMessage(String message){
        try {
            Message m = new Message();
            m.setMessage(message);

            return mr.save(m);
        }catch (Exception e){
            System.out.println(e);
        }
        return new Message();
    }
    public List<Message> getMessage(){
        return mr.findAll();
    }
}
