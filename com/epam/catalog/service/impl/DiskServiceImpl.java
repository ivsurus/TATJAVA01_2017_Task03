package com.epam.catalog.service.impl;


import com.epam.catalog.bean.Book;
import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.EntityDAO;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.EntityService;

import java.util.Set;

public class DiskServiceImpl implements EntityService<Disk> {
    @Override
    public void addEntity(Disk disk) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        EntityDAO<Disk> diskDAO = daoObjectFactory.getDiskDAO();
        diskDAO.addEntity(disk);
    }

    @Override
    public Set<Book> findEntity(String searchCriterion) {
        return null;
    }


}
