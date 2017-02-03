package com.epam.catalog.controller;

//у провайдера - getCommand распознать команду и получить конкретную реализацию интерфейса
// у конкретной реализации интерфеса - execute

import com.epam.catalog.controller.command.Command;

public final class Controller {

    private final CommandProvider provider = new CommandProvider();

    private final String paramDelimiter = "$%$";

    /*данные на слое Controller будут приходить в виде форматированной строки.
    Ответ клиенту Контроллер также будет осуществлять в виде форматированной строки*/

    public String executeTask(String request){
        System.out.println(request);
        String commandName;
        Command executionCommand;
        //наша форматированная строка, первое слово до разделителя - имя команды - (ADD or FIND)
        //вид форматированной строки: FIND_BOOK$%$
        commandName = request.substring(0, request.indexOf(paramDelimiter));
        //передаем команду в провайдер add find
        executionCommand = provider.getCommand(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}
