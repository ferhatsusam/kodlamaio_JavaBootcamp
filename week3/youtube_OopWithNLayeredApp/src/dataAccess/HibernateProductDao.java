package dataAccess;
import entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product) {
        System.out.println("Added to database with Hibernate. ");
    }

}

