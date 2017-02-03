package com.epam.catalog.controller.command.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.factory.ServiceFactory;


public class AddBook implements Command {
    @Override
    //может быть здесь передавать строку с параметрами а не обект???
    public String execute(String request) {
        String delimiter = "\\$%\\$";
        Book book = new Book();
        String[] parameters = request.split(delimiter);
        book.setTitle(parameters[1]);
        book.setAuthor(parameters[2]);
        book.setYear(parameters[3]);
        ServiceFactory serviceObjectFactory = ServiceFactory.getInstance();
        BookService bookService = serviceObjectFactory.getBookService();
        bookService.addBook(book);
        return null;
    }
}
