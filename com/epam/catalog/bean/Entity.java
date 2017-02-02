package com.epam.catalog.bean;


public class Entity {

    public Entity(){}

    private CategoryName category;
    private String author;
    private String year;
    private String title;

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String getYear(){
        return year;
    }
    public CategoryName getCategory(){
        return category;
    }

    public void setCategory(CategoryName category){
        this.category = category;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(String year){
        this.year = year;
    }
}
