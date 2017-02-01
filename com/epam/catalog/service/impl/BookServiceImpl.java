package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDAO;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.BookService;





/*!!! Каждый открытый метод реализации слоя сервисов имеет обязанность проверять входящие параметры
(кто бы и где бы до него это не делал)!*/

public class BookServiceImpl implements BookService {

    @Override
    public void addBook(Book book) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        BookDAO bookDAO = daoObjectFactory.getBookDAO();
        bookDAO.addBook(book);

    }

    @Override
    public void findBook(Book book) {

    }




}