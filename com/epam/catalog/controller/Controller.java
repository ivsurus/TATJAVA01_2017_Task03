package com.epam.catalog.controller;

/*данные на слое Controller будут приходить в виде форматированной строки.
Ответ клиенту Контроллер также будет осуществлять в виде форматированной строки*/

import com.epam.catalog.controller.command.Command;

public final class Controller {

    private final CommandProvider provider = new CommandProvider();

    private final String  paramDelimeter = "$%$";

    public String executeTask(String request){
        System.out.println(request);
        String commandName;
        Command executionCommand;
        //наша форматированная строка, первое слово до разделителя - имя команды - (ADD or FIND)
        //вид форматированной строки: FIND_BOOK$%$
        commandName = request.substring(0, request.indexOf(paramDelimeter));
        //передаем команду в провайдер add find
        executionCommand = provider.getCommand(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}
