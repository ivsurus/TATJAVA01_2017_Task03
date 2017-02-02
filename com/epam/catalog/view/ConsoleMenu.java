package com.epam.catalog.view;


import com.epam.catalog.controller.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenu {

// можно сделать просто целые строки с коммандами
    //можно константы вынести в отдельный класс Enum

    private final String MESSAGE_1 = "Enter a command: (add find)";
    private final String MESSAGE_2 = "Enter a category: (book disk movie)";
    private final String MESSAGE_3 = "Enter a title:";
    private final String MESSAGE_4 = "Enter an author :";
    private final String MESSAGE_5 = "Enter a year:";
    private final String DELIMITER = "_";
    private final String PARAM_DELIMITER = "$%$";
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder builder;
    private Controller controller = new Controller();

    //чтение выбранного пользователем пункта консольного меню

    public void start(){

        controller.executeTask(readUserTask());
        controller.executeTask(readUserTask());
    }



    public String readUserTask(){
        builder = new StringBuilder();
        System.out.println(MESSAGE_1);
        builder.append(readUserInput());
        builder.append(DELIMITER);
        System.out.println(MESSAGE_2);
        builder.append(readUserInput());
        builder.append(PARAM_DELIMITER);
        System.out.println(MESSAGE_3);
        builder.append(readUserInput());
        builder.append(PARAM_DELIMITER);
        System.out.println(MESSAGE_4);
        builder.append(readUserInput());
        builder.append(PARAM_DELIMITER);
        System.out.println(MESSAGE_5);
        builder.append(readUserInput());
        builder.append(PARAM_DELIMITER);
        return builder.toString();
    }



    public String readUserInput(){
       String input = "";
        try {
            input = reader.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        return input;
    }
}
