package com.epam.catalog.dao;



import java.util.Set;


// параметризированный интерфейс

public interface EntityDAO<T> {
    void addEntity(T entity);
    Set<String> findEntity(String searchCriterion);
}
