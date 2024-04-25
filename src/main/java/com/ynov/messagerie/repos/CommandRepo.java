package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Command;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandRepo extends JpaRepository<Command, Long> {
    Command save(Command command);
    List<Command> findAll();
}
