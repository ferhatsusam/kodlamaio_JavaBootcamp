package dataAccess;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    public void add(Category category) {
        System.out.println("Added to database with hibernate category");
    }
}