package com.epam.catalog.service.impl;


import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.DiskDAO;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.DiskService;

public class DiskServiceImpl implements DiskService {
    @Override
    public void addDisk(Disk disk) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        DiskDAO diskDAO = daoObjectFactory.getDiskDAO();
        diskDAO.addDisk(disk);
    }

    @Override
    public void findDisk(Disk disk) {

    }
}
