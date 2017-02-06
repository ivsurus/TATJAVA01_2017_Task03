package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.EntityDAO;
import com.epam.catalog.dao.exeption.DAOException;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.EntityService;
import com.epam.catalog.service.exeption.ServiceException;

import java.util.*;

// на сервисах будут создаваться бины после проверок строк как на вход так и на выход

/*!!! Каждый открытый метод реализации слоя сервисов имеет обязанность проверять входные параметры
(кто бы и где бы до него это не делал)!*/

public class BookServiceImpl implements EntityService<Book> {


    private DAOFactory daoObjectFactory = DAOFactory.getInstance();
    private EntityDAO<Book> bookDAO = daoObjectFactory.getBookDAO();

    private final String IDENTIFIER_PATTERN = "[bmd]{1,1}";
    private final String TITLE_PATTERN = "[A-Za-zА-Яа-яЁё-!?, ]{1,30}";
    private final String AUTHOR_PATTERN = "[A-Za-zА-Яа-яЁё-]{1,20}[ ]{0,1}[A-Za-zА-Яа-яЁё-]{0,20}";
    private final String YEAR_PATTERN = "^[12][0-9]{3}$"; //Years from 1000 to 2999
    private final String DELIMITER = "\\$%\\$";
    private String[] parameters;


    @Override
    public void addEntity(Book book) throws ServiceException {
        //проверить входные параметры на null
        //проверть входные параметры по паттернам
        //создать книгу
        try {
            bookDAO.addEntity(book);
        } catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    //провепока возвращшает просто все книги с проверенными параметрами
    //нужно сделать чтобы он добпвлял в сет книги только с нужными параметрами
    //по возможности сделать сортировку по этим параметрам

    @Override
    public Set<Book> findEntity(String request) throws ServiceException {
        System.out.println("USER REQUEST" + request);
        //проверим ненулевое поле на валидность
        // если валидно - передаем book если нет - исключение
        // можно отсортировать коллекцию с компораторм
        //set из строк с книгами

        // получем реквкст - строку, парсим - как-то находим нужный параметр, проверяем его на валидность
        //передаем параметр, получем ответ из БД, парсим, проверяем на валидность, создаем коллекцию бинов и передаем контроллеру

        String searchCriterion = findSearchCriterion(request);
        Set<Book> booksForUser = new HashSet<>();
        try{
            Set<String> books = bookDAO.findEntity(searchCriterion);

        for (String bookStr: books){
           boolean parmametersAreValid = validateParameters(parseDataBaseResponse(bookStr));
            if (parmametersAreValid){
               booksForUser.add(createBook());
            }
        }
        }catch (DAOException e){
            throw new ServiceException(e);
        }
        System.out.println("Я тут");
        System.out.println("Количество возвращаемых пользователю книг " + booksForUser.size());
        return booksForUser;
   }

    //находим критерий для поиска сущности в базе данных
    private String findSearchCriterion(String request){
        return request.split(DELIMITER)[1];
    }


    //инициализируем сущность (книгу)
    private Book createBook(){
        Book book = new Book();
        book.setAuthor(parameters[1]);
        book.setTitle(parameters[2]);
        book.setYear(parameters[3]);
        return book;
    }

    //одна книга
    //парсим одну строчку из базы данных на парметры, добавляем параметры как значения и паттерны как ключи
    private Map<String,String> parseDataBaseResponse(String dataBaseResponse){
        Map<String,String> map = new HashMap<>();
        parameters = dataBaseResponse.split(DELIMITER);
        map.put(IDENTIFIER_PATTERN,parameters[0]);
        map.put(TITLE_PATTERN,parameters[1]);
        map.put(AUTHOR_PATTERN,parameters[2]);
        map.put(YEAR_PATTERN,parameters[3]);
        return map;
    }

    //получаем проверем все параметры для одной книги по паттернам
    private boolean validateParameters (Map map){
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (!pair.getValue().matches(pair.getKey()))
            return false;
        }
        System.out.println("Параметры из базы верны");
        return true;
    }
}