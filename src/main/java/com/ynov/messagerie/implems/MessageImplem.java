package com.ynov.messagerie.implems;

import com.ynov.messagerie.models.Message;
import com.ynov.messagerie.repos.MessageRepo;
import com.ynov.messagerie.services.MessageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageImplem implements MessageServices {
    @Autowired
    MessageRepo messageRepo;

    @Override
    public Message saveMessage(Message message) {
        return messageRepo.save(message);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepo.finAll();
    }
}
