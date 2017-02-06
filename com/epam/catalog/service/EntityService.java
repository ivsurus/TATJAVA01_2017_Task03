package com.epam.catalog.service;

import com.epam.catalog.bean.Book;

import java.util.Set;


public interface EntityService<T> {
    void addEntity(T entity);
    Set<Book> findEntity(String searchCriterion);
}
