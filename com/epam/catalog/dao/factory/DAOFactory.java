package com.epam.catalog.dao.factory;

import com.epam.catalog.dao.NewsDAO;
import com.epam.catalog.dao.impl.ExelNewsDAO;

/* Далее предоставим предоставим возможность получения доступа к реализации, не открывая имена конкретных классов.*/

/*Класс DAOFactory представляет собой singleton, у которого две задачи. Первая – это закрыть от пользователя слоя
 конкретную реализацию. Вторая – не создавать каждый раз новые объекты типа ExelNewsDAO, т.к. многократное
 создания этих объектов является грубой ошибкой.*/


/*если понадобится добавить новость в каталог, то нужно будет использовать следующий код:
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        NewsDAO newsDAO = daoObjectFactory.getBookDAO();
        newsDAO.addNews(news);*/


public final class DAOFactory {


    private static final DAOFactory instance = new DAOFactory();

    private final NewsDAO exelNewsImpl = new ExelNewsDAO();

    //singleton
    private DAOFactory(){}


    public static DAOFactory getInstance(){
        return instance;
    }

    public  NewsDAO getNewsDAO(){
        return exelNewsImpl;
    }

}
