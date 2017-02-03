package com.epam.catalog.experiment;



public class Experiment {

    public static void main(String[] args) {
        String delimiter = "%$%";
        String str = "b!!!add_book%$%title%$%author%$%year";
        System.out.println(str.substring(str.indexOf(delimiter)+3,20));
        System.out.println(str.indexOf(delimiter));
        System.out.println(str.indexOf(delimiter));
       // System.out.println(delimiter,str.indexOf(delimiter));
    }
}
