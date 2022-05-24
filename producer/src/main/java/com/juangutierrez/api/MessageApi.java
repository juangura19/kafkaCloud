package com.juangutierrez.api;

import com.juangutierrez.model.Message;
import com.juangutierrez.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public void send(@RequestBody Message message){
        this.messageService.sendMessage(message);
    }

    @PostMapping("/nttdata")
    public void nttdata(@RequestBody Message message){
        this.messageService.sendNttdata(message);
    }
}
