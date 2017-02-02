package com.epam.catalog.view;


import com.epam.catalog.controller.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenu {


    private final String MESSAGE_1 = "Enter a command: (add find)";
    private final String MESSAGE_2 = "Enter a category: (book disk movie)";

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder builder = new StringBuilder();
    private Controller controller = new Controller();

    //чтение выбранного пользователем пункта консольного меню

    public void start(){
        controller.executeTask(readUserTask());
    }


    public String readUserTask(){
        final String dilimeter = "_";
        final String paramDilimeter = "$%$";
        System.out.println(MESSAGE_1);
        builder.append(readUserInput());
        builder.append(dilimeter);
        System.out.println(MESSAGE_2);
        builder.append(readUserInput());
        builder.append(paramDilimeter);
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
