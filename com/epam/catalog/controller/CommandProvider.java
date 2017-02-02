package com.epam.catalog.controller;


import com.epam.catalog.controller.command.Command;
import com.epam.catalog.controller.command.impl.*;


import java.util.HashMap;
import java.util.Map;

final public class CommandProvider {

    private final Map<CommandName, Command> repository = new HashMap<>();

    //конструктор, создаем нужную реализацию интерфеса исходя из команды
    CommandProvider() {
        repository.put(CommandName.ADD_BOOK, new AddBook());
        repository.put(CommandName.FIND_BOOK, new FindBook());
        repository.put(CommandName.ADD_DISK, new AddDisk());
        repository.put(CommandName.FIND_DISK, new FindDisk());
        repository.put(CommandName.ADD_MOVIE, new AddMovie());
        repository.put(CommandName.FIND_MOVIE, new FindMovie());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    //получает только имя команды
    Command getCommand(String name){
        CommandName commandName = null;
        Command command = null;
        try{
            //переводит имя команды в верхний регистр и берет из ENUM
            commandName = CommandName.valueOf(name.toUpperCase());
            //ключ - имя команды из ENUM, по ключу берем из репозитория заранее созданный объект (будет 7 объектов)
            //command - объект , конкретный BEAN
            command = repository.get(commandName);
        }catch(IllegalArgumentException | NullPointerException e){
            //write log
            //если неправильное имя команды либо имя сущности то берем объект  wrong request
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
