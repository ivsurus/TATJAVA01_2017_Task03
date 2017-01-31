package com.epam.catalog.controller;


import com.epam.catalog.controller.command.Command;
import com.epam.catalog.controller.command.impl.AddNews;
import com.epam.catalog.controller.command.impl.FindNews;

import java.util.HashMap;
import java.util.Map;

final public class CommandProvider {

    private final Map<CommandName, Command> repository = new HashMap<>();

    //конструктор
    CommandProvider() {
        repository.put(CommandName.ADD_NEWS, new AddNews());
        repository.put(CommandName.FIND_NEWS, new FindNews());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    Command getCommand(String name){
        CommandName commandName = null;
        Command command = null;
        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch(IllegalArgumentException | NullPointerException e){
        //write log
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
