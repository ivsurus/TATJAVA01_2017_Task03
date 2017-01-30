package com.epam.catalog.dao;

import com.epam.catalog.bean.News;

/**
 * Created by Ivan_Surus on 1/30/2017.
 */
public interface NewsDAO {
    void addNews(News news);
    void findNews(News news);
}
