package com.epam.catalog.view;


import com.epam.catalog.controller.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenu {

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
        final String Message1 = "Enter a command: (add find)";
        System.out.println(Message1);
        builder.append(readUserInput());
        builder.append(dilimeter);
        final String Message2 = "Enter a category: (book disk movie)";
        System.out.println(Message2);
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
