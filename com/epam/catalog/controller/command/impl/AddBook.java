package com.epam.catalog.controller.command.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.factory.ServiceFactory;


public class AddBook implements Command {
    @Override
    public String execute(String request) {
        Book book = new Book();
        book.setAuthor("Pushkin");
        book.setTitle("Onegin");
        book.setYear("1800");
        ServiceFactory serviceObjectFactory = ServiceFactory.getInstance();
        BookService bookService = serviceObjectFactory.getBookService();
        bookService.addBook(book);
        return null;
    }
}
