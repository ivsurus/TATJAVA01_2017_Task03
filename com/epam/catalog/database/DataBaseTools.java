package com.epam.catalog.database;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseTools {

   // private final String PATH = "C:\\Users\\Ivan_Surus\\IdeaProjects\\Task3\\src\\com\\epam\\catalog\\database\\dataBase2.txt";
    private final String PATH = "D:\\Сурус\\JAVA\\Task3\\src\\com\\epam\\catalog\\database\\dataBase2.txt";
    private File file = new File(PATH);
    private BufferedWriter writer;
    private BufferedReader reader;
    private static final DataBaseTools instance = new DataBaseTools();

    //singleton
    private DataBaseTools(){}

    public static DataBaseTools getInstance(){
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
    public List readFromDB(){
        List<String> list = new ArrayList<>();
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String string;
            while ((string = reader.readLine()) != null) {
                list.add(string);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    return list;
    }

}

