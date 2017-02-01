package com.epam.catalog.controller.command.impl;

import com.epam.catalog.controller.command.Command;


public class FindBook implements Command {
    @Override
    public String execute(String request) {
        String delimeter = "$%$";
        System.out.println(request);
        String parameterName;
        return null;
    }
}
