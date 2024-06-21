package com.cts.kafkademo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {

	private final KafkaTemplate<String, Employee> kafkaTemplate;

	public void sendMessage(Employee employee) {

		Message<Employee> message = MessageBuilder.withPayload(employee).setHeader(KafkaHeaders.TOPIC, "Topic1")
				.build();

		kafkaTemplate.send(message);

	}

}
