package com.epam.catalog.service.factory;


import com.epam.catalog.service.BookService;
import com.epam.catalog.service.DiskService;
import com.epam.catalog.service.MovieService;
import com.epam.catalog.service.impl.BookServiceImpl;
import com.epam.catalog.service.impl.DiskServiceImpl;
import com.epam.catalog.service.impl.MovieServiceImpl;

/*предоставим предоставим возможность получения доступа к реализации, не открывая имена конкретных классов.*/

/*Класс ServiceFactory представляет собой singleton, у которого две задачи. Первая – это закрыть от пользователя слоя
 конкретную реализацию. Вторая – не создавать каждый раз новые объекты типа CatalogServiceImpl, т.к. многократное
 создания этих объектов является грубой ошибкой.*/

/*Слой Service обращаясь к DAO использует только интерфейсную его часть, и не перегружен
знанием конкретной реализации, используемой при доступе к данным.*/


public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    //эти объекты многократно создавать тоже нельзя
    private final BookService bookService = new BookServiceImpl();
    private final DiskService diskService = new DiskServiceImpl();
    private final MovieService movieService = new MovieServiceImpl();

    //singleton
    private ServiceFactory(){}


    public static ServiceFactory getInstance(){
        return instance;
    }


    public BookService getBookService(){
        return bookService;
    }
    public DiskService getDiskService(){
        return diskService;
    }
    public MovieService getMovieService(){
        return movieService;
    }


}
