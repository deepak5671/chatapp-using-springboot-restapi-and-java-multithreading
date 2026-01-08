package com.deep.chatapp.services;
import com.deep.chatapp.entity.MessageEntity;
import com.deep.chatapp.repository.MessageRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Service
public class ChatServices {

    private final MessageRepository repository;

    private ExecutorService executor =
            Executors.newFixedThreadPool(10);

    public ChatServices(MessageRepository repository) {
        this.repository = repository;
    }

    public void sendMessage(String user, String msg) {

        executor.submit(() -> {

            System.out.println(
                "[" + Thread.currentThread().getName() + "] "
                + user + ": " + msg
            );

            MessageEntity entity =
                new MessageEntity(user, msg);

            repository.save(entity);
        });
    }

    public List<MessageEntity> getAllMessages() {
        return repository.findAll();
    }
}
