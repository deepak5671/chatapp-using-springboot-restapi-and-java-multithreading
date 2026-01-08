package com.deep.chatapp.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name = "messages")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column
    private String userName;
@Column
    private String message;

    public MessageEntity() {}

    public MessageEntity(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    // getters & setters
    public Long getId() { return id; }

    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }
}
