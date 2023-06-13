package business;
import core.Logger;
import dataAccess.CategoryDao;
import entities.Category;
import java.util.List;

public class CategoryManager {


        private CategoryDao categoryDao;
        private Logger[] loggers;
        private List<Category> categories;

        public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
            this.categoryDao = categoryDao;
            this.loggers = loggers;
            this.categories = categories;
        }

        public void add(Category category) throws Exception {

            for (Category ct : categories) {
                if (ct.getCategoryName().equals(ct.getCategoryName()))
                    throw new Exception("Category name can't be the same");
            }

            categories.add(category);
            categoryDao.add(category);

            for (Logger logger : loggers)
                logger.log(category.getCategoryName());

        }
}