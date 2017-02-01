package com.epam.catalog.dao.factory;

import com.epam.catalog.dao.BookDAO;
import com.epam.catalog.dao.DiskDAO;
import com.epam.catalog.dao.MovieDAO;
import com.epam.catalog.dao.impl.TxtBookDAO;
import com.epam.catalog.dao.impl.TxtDiskDAO;
import com.epam.catalog.dao.impl.TxtMovieDAO;

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

    private final BookDAO txtBookDAOImpl = new TxtBookDAO();
    private final MovieDAO txtMovieDAOImpl = new TxtMovieDAO();
    private final DiskDAO txtDiskDAOImpl = new TxtDiskDAO();

    //singleton
    private DAOFactory(){}

    //геттеры
    public static DAOFactory getInstance(){
        return instance;
    }

    public BookDAO getBookDAO(){
        return txtBookDAOImpl;
    }
    public MovieDAO getMovieDAO(){
        return txtMovieDAOImpl;
    }
    public DiskDAO getDiskDAO(){
        return txtDiskDAOImpl;
    }

}
