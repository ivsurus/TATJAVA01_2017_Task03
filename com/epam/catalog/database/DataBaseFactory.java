package com.epam.catalog.database;


import java.io.*;

public class DataBaseFactory {

    private static final DataBaseFactory instance = new DataBaseFactory();
    private Writer writer;
    //singleton
    private DataBaseFactory(){
         File file = new File("C:\\Users\\Ivan_Surus\\IdeaProjects\\Task3\\src\\com\\epam\\catalog\\database\\dataBase2.txt");
         try {
             writer = new BufferedWriter(new FileWriter(file));
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

    public static DataBaseFactory getInstance(){
        return instance;
    }

    public Writer getWriter(){
         return writer;
    }
}
