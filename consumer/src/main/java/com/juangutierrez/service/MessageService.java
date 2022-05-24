package com.juangutierrez.service;

import com.juangutierrez.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Slf4j
//@EnableBinding(Sink.class)
@Service
public class MessageService {
    /*@StreamListener(Sink.INPUT)
    public void read(Message<String> message){
        log.info("message: " + message.getPayload());
    }

    @StreamListener(Sink.INPUT)
    public void read(com.juangutierrez.model.Message message){
        log.info("message: " + message);
    }*/

    @Bean
    Consumer<Message> input() {
        return message -> {
            log.info("message: " + message);
        };
    }

    @Bean
    Consumer<Message> nttdata() {
        return message -> {
            log.info("nttdata: " + message);
        };
    }

}
