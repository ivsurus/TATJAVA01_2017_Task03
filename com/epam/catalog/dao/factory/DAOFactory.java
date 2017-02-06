package com.epam.catalog.dao.factory;

import com.epam.catalog.bean.Book;
import com.epam.catalog.bean.Disk;
import com.epam.catalog.bean.Movie;
import com.epam.catalog.dao.EntityDAO;
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

    private final EntityDAO<Book> txtBookDAOImpl = new TxtBookDAO();
    private final EntityDAO<Movie> txtMovieDAOImpl = new TxtMovieDAO();
    private final EntityDAO<Disk> txtDiskDAOImpl = new TxtDiskDAO();

    //singleton
    private DAOFactory(){}

    //геттеры
    public static DAOFactory getInstance(){
        return instance;
    }

    public EntityDAO<Book> getBookDAO(){
        return txtBookDAOImpl;
    }
    public EntityDAO<Movie> getMovieDAO(){
        return txtMovieDAOImpl;
    }
    public EntityDAO<Disk> getDiskDAO(){
        return txtDiskDAOImpl;
    }

}
