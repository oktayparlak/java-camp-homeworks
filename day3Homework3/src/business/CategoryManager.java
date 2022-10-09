package business;

import core.logging.Logger;
import dataAccess.category.CategoryDao;
import entities.Category;

public class CategoryManager {

    private CategoryDao[] categoryDaos;
    private Logger[] loggers;

    public CategoryManager(CategoryDao[] categoryDaos, Logger[] loggers) {
        this.categoryDaos = categoryDaos;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        if (category.getCategoryName() == "Database") {
            throw new Exception("Bu kategori zaten eklendi!");
        } else {
            for (CategoryDao categoryDao : categoryDaos) {
                categoryDao.add(category);
                for (Logger logger : loggers) {
                    logger.log(category.getCategoryName());
                }
            }


        }
    }

}
