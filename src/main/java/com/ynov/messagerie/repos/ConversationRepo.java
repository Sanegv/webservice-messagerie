package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConversationRepo extends JpaRepository<Conversation, Long> {
    Conversation save(Conversation conversation);
    List<Conversation> findAll();
    Optional<Conversation> findById(Long id);
}
