package com.ynov.messagerie.implems;

import com.ynov.messagerie.models.Conversation;
import com.ynov.messagerie.repos.ConversationRepo;
import com.ynov.messagerie.services.ConversationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConvesationImplem implements ConversationServices {
    @Autowired
    ConversationRepo conversationRepo;

    @Override
    public Conversation createConversation(Conversation conversation) {
        return conversationRepo.save(conversation);
    }

    @Override
    public List<Conversation> getAllConversations() {
        return conversationRepo.findAll();
    }

    @Override
    public Optional<Conversation> getConversationById(Long id) {
        return conversationRepo.findById(id);
    }
}
