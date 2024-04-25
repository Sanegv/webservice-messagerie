package com.ynov.messagerie.services;

import com.ynov.messagerie.models.Conversation;

import java.util.Optional;

public interface ConversationServices {
    Conversation createConversation(Conversation conversation);
    Optional<Conversation> getConversationById(Long id);
}
