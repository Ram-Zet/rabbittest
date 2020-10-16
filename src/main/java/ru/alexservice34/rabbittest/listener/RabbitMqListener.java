package ru.alexservice34.rabbittest.listener;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import ru.alexservice34.rabbittest.config.RabbitTestConfig;

@Service
@RequiredArgsConstructor
public class RabbitMqListener {

    @RabbitListener(queues = RabbitTestConfig.queueName)
    public void process(String string) {
        System.out.println("RabbitMq - got string");
        System.out.println(string);
    }
}
