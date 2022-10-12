package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;

public class CategoryManager {
    private ArrayList<String> availableCategories = new ArrayList<String>();
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception{
        if (availableCategories.contains(category.getCategoryName())){
            throw new Exception("Bu isimde bir kategori zaten mevcut");
        }
        availableCategories.add(category.getCategoryName());
        categoryDao.add(category);
        for (Logger logger:loggers){
            logger.log("Yeni kategori eklendi : "+category.getCategoryName());
        }

    }
}
