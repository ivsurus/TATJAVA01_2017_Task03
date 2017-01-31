package com.epam.catalog.controller;

/*данные на слое Controller будут приходить в виде форматированной строки.
Ответ клиенту Контроллер также будет осуществлять в виде форматированной строки*/

import com.epam.catalog.controller.command.Command;

public final class Controller {

    private final CommandProvider provider = new CommandProvider();

    private final char paramDelimeter = ' ';

    public String executeTask(String request){
        String commandName;
        Command executionCommand;
        commandName = request.substring(0, request.indexOf(paramDelimeter));
        executionCommand = provider.getCommand(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }

}
