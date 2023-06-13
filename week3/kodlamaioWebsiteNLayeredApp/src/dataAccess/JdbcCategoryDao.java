package dataAccess;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    public void add(Category category) {
        System.out.println("Added to database with jdbc category");
    }
}

