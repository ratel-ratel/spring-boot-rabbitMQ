package com.ratel.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiver {

    @RabbitHandler
    public void process(Integer message) throws InterruptedException {
        System.out.println("Topic Receiver1  : " + message);
        Thread.sleep(100);
    }

}
