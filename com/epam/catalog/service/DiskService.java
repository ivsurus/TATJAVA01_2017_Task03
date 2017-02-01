package com.epam.catalog.service;


import com.epam.catalog.bean.Disk;

public interface DiskService {
    void addDisk(Disk disk);
    void findDisk(Disk disk);
}
