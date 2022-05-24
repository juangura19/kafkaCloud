package com.juangutierrez.service;

import com.juangutierrez.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.function.SupplierUtils;

import java.util.function.Function;
import java.util.function.Supplier;

//@EnableBinding(Source.class)
@Service
public class MessageService {

    //deprecado...
    /*@Autowired
    private Source source;

    @SendTo
    public boolean send(Message message){
        return source.output().send(MessageBuilder.withPayload(message).build());
    }*/


    //envia un mensaje cada segundo...
    /*@Bean
    public Supplier<Message> output(){
        return () -> new Message("autor", "text");
    }*/

    //enviar mensaje a demanda...
    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage(Message message){
        streamBridge.send("output-out-0",message);
    }

    public void sendNttdata(Message message){
        streamBridge.send("nttdata-out-0",message);
    }
}
