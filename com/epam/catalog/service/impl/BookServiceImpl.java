package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDAO;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.BookService;

import java.util.Set;

// на сервисах будут создаваться бины после проверок строк как на вход так и на выход



/*!!! Каждый открытый метод реализации слоя сервисов имеет обязанность проверять входящие параметры
(кто бы и где бы до него это не делал)!*/

public class BookServiceImpl implements BookService {


    DAOFactory daoObjectFactory = DAOFactory.getInstance();
    BookDAO bookDAO = daoObjectFactory.getBookDAO();

    @Override
    public void addBook(Book book) {
        //проверить входные параметры на null
        //проверть входные параметры по паттернам

        bookDAO.addBook(book);

    }


    //получаем массив строк с книгами
    //парсим строки, проверяем данные на валидность
    //создаем коллекцию бинов
    //коллекцию передаем контроллеру

    @Override
    public void findBook(Book book) {
       //проверим ненулевое поле на валидность
       // если валидно - передаем book если нет - исключение
        // можно отсортировать коллекцию с компораторм

        //set из строк с книгами
        bookDAO.findBook(book);

    }

    public void parse(String response){
       /* Matcher matcher = Pattern.compile("[A-Za-zА-Яа-я0-9Ёё-]{1,150}").matcher(fml_name_part);
        return matcher.matches();*/
    }
    String identifierPattern = "[bmd]{1,1}";
        String titlePattern = "";
        String authorPattern = "[A-Za-zА-Яа-яЁё-]{1,20}[ ]{0,1}[A-Za-zА-Яа-яЁё-]{0,20}";
        String yearPattern = "^[12][0-9]{3}$"; //Years from 1000 to 2999

    String delimiter = "\\$%\\$";
        String[] parameters = response.split(delimiter);
        String identifier = parameters[0];
        String title = parameters[1];
        String author = parameters[2];
        String year = parameters[3];
    }






}