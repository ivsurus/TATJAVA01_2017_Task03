package com.epam.catalog.database;


import java.io.*;

public class DataBaseWriter {

    private File file = new File("C:\\Users\\Ivan_Surus\\IdeaProjects\\Task3\\src\\com\\epam\\catalog\\database\\dataBase2.txt");
    private Writer writer;
    private static final DataBaseWriter instance = new DataBaseWriter();

    //singleton
    private DataBaseWriter(){}

    public static DataBaseWriter getInstance(){
        return instance;
    }

    public void writeToDB(String param){
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(param);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
