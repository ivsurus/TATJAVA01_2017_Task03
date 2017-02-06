package com.epam.catalog.service.impl;


import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.EntityDAO;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.DiskService;

public class DiskServiceImpl implements DiskService {
    @Override
    public void addDisk(Disk disk) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        EntityDAO<Disk> diskDAO = daoObjectFactory.getDiskDAO();
        diskDAO.addEntity(disk);
    }

    @Override
    public void findDisk(Disk disk) {

    }
}
