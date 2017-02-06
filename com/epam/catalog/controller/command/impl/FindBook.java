package com.epam.catalog.controller.command.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.EntityService;
import com.epam.catalog.service.exeption.ServiceException;
import com.epam.catalog.service.factory.ServiceFactory;


public class FindBook implements Command {

    //пока ищем только одну книгу по title
    //в строке request параметр для поиска записан, остальные параметры имеют специализированное значение
    //при парсинге сделать - заполнить недостающие параметры для этого бина и верннуть его наверх

    //если будет много чего возвращать то вернем коллекию бинов

    @Override
    public String execute(String request) {
        ServiceFactory serviceObjectFactory = ServiceFactory.getInstance();
        EntityService<Book> bookService = serviceObjectFactory.getBookService();

        try{
            bookService.findEntity(request);
        } catch (ServiceException e){

        }

        return null;
    }
}
