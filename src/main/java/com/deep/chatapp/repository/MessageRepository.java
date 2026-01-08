package com.deep.chatapp.repository;
import com.deep.chatapp.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MessageRepository
        extends JpaRepository<MessageEntity, Long> {
}
