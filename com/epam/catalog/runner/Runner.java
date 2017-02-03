package com.epam.catalog.runner;


import com.epam.catalog.dao.tools.DataBaseTools;
import com.epam.catalog.view.ConsoleMenu;

public class Runner {

    public static void main(String[] args) {
        new ConsoleMenu().start();
        System.out.println(DataBaseTools.getInstance().readFromDB().size());
    }
}
