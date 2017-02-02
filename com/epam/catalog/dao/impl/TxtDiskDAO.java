package com.epam.catalog.dao.impl;


import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.DiskDAO;
import com.epam.catalog.database.DataBaseWriter;



public class TxtDiskDAO implements DiskDAO{

    DataBaseWriter dbWriter = DataBaseWriter.getInstance();

    @Override
    public void addDisk(Disk disk) {
        dbWriter.writeToDB("!d" + disk.getTitle() + disk.getAuthor() + disk.getYear()+"\n");
        System.out.println(2);
    }

    @Override
    public void findDisk(Disk disk) {

    }
}
