package com.deep.chatapp.controller;

import com.deep.chatapp.entity.MessageEntity;
import com.deep.chatapp.services.ChatServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/*
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatServices service;

    public ChatController(ChatServices service) {
        this.service = service;
    }

    
    @PostMapping("/send")
    public String send(@RequestBody MessageEntity msg) {
        service.sendMessage(msg.getUserName(), msg.getMessage());
        return "Message saved";
    }

    @GetMapping("/messages")
    public List<MessageEntity> getAll() {
        return service.getAllMessages();
    }
}
*/
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatServices service;

    public ChatController(ChatServices service) {
        this.service = service;
    }

    @PostMapping(
        value = "/send",
        consumes = "application/json"
    )
    public String send(@RequestBody Map<String, String> body) {

        String user = body.get("user");
        String message = body.get("message");

        service.sendMessage(user, message);

        return "Message saved";
    }

    @GetMapping("/messages")
    public List<MessageEntity> getAll() {
        return service.getAllMessages();
    }
}
