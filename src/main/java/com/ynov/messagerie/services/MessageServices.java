package com.ynov.messagerie.services;

import com.ynov.messagerie.models.Message;

import java.util.List;

public interface MessageServices {
    Message saveMessage(Message message);
    List<Message> getAllMessages();
}
