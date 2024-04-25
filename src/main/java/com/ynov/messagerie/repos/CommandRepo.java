package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepo extends JpaRepository<Command, Long> {
    Command save(Command command);
}
