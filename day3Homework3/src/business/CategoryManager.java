package business;

import dataAccess.interfaces.CategoryDao;

public class CategoryManager {

    private CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

}
