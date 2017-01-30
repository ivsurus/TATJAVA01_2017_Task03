package com.epam.catalog.dao.factory;

import com.epam.catalog.dao.NewsDAO;
import com.epam.catalog.dao.impl.ExelNewsDAO;

/**
 * Created by Ivan_Surus on 1/30/2017.
 */
public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    //singleton
    private DAOFactory(){}

    private final NewsDAO exelNewsImpl = new ExelNewsDAO();

    public static DAOFactory getInstance(){
        return instance;
    }

    public  NewsDAO getNewsDAO(){
        return exelNewsImpl;
    }

}
