package com.ynov.messagerie.implems;

import com.ynov.messagerie.models.Command;
import com.ynov.messagerie.repos.CommandRepo;
import com.ynov.messagerie.services.CommandServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandImplem implements CommandServices {
    @Autowired
    CommandRepo commandRepo;
    @Override
    public Command createCommand(Command command) {
        return commandRepo.save(command);
    }

    @Override
    public List<Command> getAllCommands() {
        return commandRepo.findAll();
    }
}
