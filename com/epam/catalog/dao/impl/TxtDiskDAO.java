package com.epam.catalog.dao.impl;


import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.DiskDAO;
import com.epam.catalog.dao.tools.DataBaseTools;



public class TxtDiskDAO implements DiskDAO{

    DataBaseTools dbTools = DataBaseTools.getInstance();

    @Override
    public void addDisk(Disk disk) {
        dbTools.writeToDB("d$%$" + disk.getTitle() + disk.getAuthor() + disk.getYear()+"\n");
        System.out.println(2);
    }

    @Override
    public void findDisk(Disk disk) {

    }
}
