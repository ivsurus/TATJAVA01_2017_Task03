package com.epam.catalog.dao.impl;


import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.DiskDAO;
import com.epam.catalog.database.DataBaseFactory;

import java.io.IOException;
import java.io.Writer;

public class TxtDiskDAO implements DiskDAO{

    DataBaseFactory dbObjectFactory = DataBaseFactory.getInstance();
    Writer writer;

    @Override
    public void addDisk(Disk disk) {
        try {
            writer = dbObjectFactory.getWriter();
            writer.write("!d" + disk.getTitle() + disk.getAuthor() + disk.getYear()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void findDisk(Disk disk) {

    }
}
