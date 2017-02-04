package com.epam.catalog.controller.command.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.factory.ServiceFactory;


public class FindBook implements Command {

    //пока ищем только одну книгу по title
    //в строке request параметр для поиска записан, остальные параметры имеют специализированное значение
    //при парсинге сделать - заполнить недостающие параметры для этого бина и верннуть его наверх

    //если будет много чего возвращать то вернем коллекию бинов
    @Override
    public String execute(String request) {
        //использовать хитрый парсинг с регуляркой допустим помечаем нужный параметр спец символ
       // String delimiter = "\\$%\\$";
        //Book book = new Book();
//        String[] parameters = request.split(delimiter);
//        book.setTitle(parameters[1]);
//        book.setAuthor(parameters[2]);
//        book.setYear(parameters[3]);
        ServiceFactory serviceObjectFactory = ServiceFactory.getInstance();
        BookService bookService = serviceObjectFactory.getBookService();
        bookService.findBook(request);
        return null;
    }
}
