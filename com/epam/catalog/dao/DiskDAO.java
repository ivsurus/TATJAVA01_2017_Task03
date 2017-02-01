package com.epam.catalog.dao;


import com.epam.catalog.bean.Disk;

public interface DiskDAO {
    void addDisk(Disk disk);
    void findDisk(Disk disk);
}
