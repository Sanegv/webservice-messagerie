package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepo extends JpaRepository<Conversation, Long> {
    Conversation save(Conversation conversation);
}
