package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
    Message save(Message message);
    List<Message> finAll();
}
