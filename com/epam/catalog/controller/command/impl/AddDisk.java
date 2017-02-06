package com.epam.catalog.controller.command.impl;


import com.epam.catalog.bean.Disk;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.EntityService;
import com.epam.catalog.service.exeption.ServiceException;
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
        EntityService<Disk> diskService = serviceObjectFactory.getDiskService();
        try{
            diskService.addEntity(disk);
        } catch (ServiceException e){

        }

        return null;
    }
}
