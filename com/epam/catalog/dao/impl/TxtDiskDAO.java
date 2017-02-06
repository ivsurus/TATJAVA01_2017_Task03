package com.epam.catalog.dao.impl;


import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.EntityDAO;
import com.epam.catalog.dao.exeption.DAOException;
import com.epam.catalog.dao.tools.DataBaseTools;

import java.util.Set;


public class TxtDiskDAO implements EntityDAO<Disk>{

    private DataBaseTools dbTools = DataBaseTools.getInstance();
    private final char IDENTIFIER = 'd';
    private final String DELIMITER = "$%$";

    @Override
    public void addEntity(Disk disk) throws DAOException {
        dbTools.writeToDB(IDENTIFIER+DELIMITER+disk.getTitle()+DELIMITER+disk.getAuthor()+DELIMITER+disk.getYear()+"\n");
        System.out.println(2);
    }

    @Override
    public Set<String> findEntity(String searchCriterion) throws DAOException{
        return dbTools.delUnnecessaryData(dbTools.readFromDB(),IDENTIFIER);
    }
}
