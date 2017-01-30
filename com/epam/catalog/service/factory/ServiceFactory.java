package com.epam.catalog.service.factory;


import com.epam.catalog.service.CatalogService;
import com.epam.catalog.service.impl.CatalogServiceImpl;

/*предоставим предоставим возможность получения доступа к реализации, не открывая имена конкретных классов.*/

/*Класс ServiceFactory представляет собой singleton, у которого две задачи. Первая – это закрыть от пользователя слоя
 конкретную реализацию. Вторая – не создавать каждый раз новые объекты типа CatalogServiceImpl, т.к. многократное
 создания этих объектов является грубой ошибкой.*/

/*Слой Service обращаясь к DAO использует только интерфейсную его часть, и не перегрузен
знанием конкретной реализации, используемой при доступе к данным.*/


public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();


    private final CatalogService catalogService = new CatalogServiceImpl();

    //singleton
    private ServiceFactory(){}


    public static ServiceFactory getInstance(){
        return instance;
    }


    public CatalogService getCatalogService(){
        return catalogService;
    }


}
