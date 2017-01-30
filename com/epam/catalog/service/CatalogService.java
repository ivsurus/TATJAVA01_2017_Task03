package com.epam.catalog.service;

import com.epam.catalog.bean.News;

/**
 * Created by Ivan_Surus on 1/30/2017.
 */
public interface CatalogService {
    void addNewsFromServiceLayer(News news);
    void findNewsFromServiceLayer(News news);
}
