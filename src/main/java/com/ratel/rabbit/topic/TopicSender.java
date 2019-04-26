package com.ratel.rabbit.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(int integer) {
		System.out.println("Sender : " + integer);
		this.rabbitTemplate.convertAndSend("topicExchange", "topic.1", integer);
	}
	public void send1(int i) {
		System.out.println("Sender : " + i);
		this.rabbitTemplate.convertAndSend("topicExchange", "topic.message", i);
	}

	public void send2(int i) {
		System.out.println("Sender : " + i);
		this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages", i);
	}
}