package com.epam.catalog.controller.command;


import java.util.Set;

public interface Command {
    String execute(String request);
}
