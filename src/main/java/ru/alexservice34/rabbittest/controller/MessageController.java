package ru.alexservice34.rabbittest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.alexservice34.rabbittest.sender.RabbitMqSender;

@RestController
@RequestMapping("/rabbit")
@RequiredArgsConstructor
public class MessageController {
    private final RabbitMqSender rabbitMqSender;

    @GetMapping("/send")
    public void sendMessage(@RequestParam("message") String message) {
        rabbitMqSender.send(message);
    }
}
