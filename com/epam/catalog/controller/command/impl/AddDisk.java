package com.epam.catalog.controller.command.impl;


import com.epam.catalog.bean.Disk;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.DiskService;
import com.epam.catalog.service.factory.ServiceFactory;

public class AddDisk implements Command{
    @Override
    public String execute(String request) {
        String delimiter = "\\$%\\$";
        Disk disk = new Disk();
        String[] parameters = request.split(delimiter);
        disk.setTitle(parameters[1]);
        disk.setAuthor(parameters[2]);
        disk.setYear(parameters[3]);
        ServiceFactory serviceObjectFactory = ServiceFactory.getInstance();
        DiskService diskService = serviceObjectFactory.getDiskService();
        diskService.addDisk(disk);
        return null;
    }
}
