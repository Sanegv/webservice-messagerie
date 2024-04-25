package com.ynov.messagerie.services;

import com.ynov.messagerie.models.Command;

import java.util.List;

public interface CommandServices {
    Command createCommand(Command command);
    List<Command> getAllCommands();
}
