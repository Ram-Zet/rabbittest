package ru.alexservice34.rabbittest.sender;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import ru.alexservice34.rabbittest.config.RabbitTestConfig;

@Service
@RequiredArgsConstructor
public class RabbitMqSender {
    private final RabbitTemplate rabbitTemplate;

    public void send(String message) {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(RabbitTestConfig.queueName, message);
    }

}
