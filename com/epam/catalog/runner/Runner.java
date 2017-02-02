package com.epam.catalog.runner;


import com.epam.catalog.database.DataBaseFactory;
import com.epam.catalog.view.ConsoleMenu;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) {

        new ConsoleMenu().start();
// убрать отсюда потом
        try {
            DataBaseFactory.getInstance().getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
