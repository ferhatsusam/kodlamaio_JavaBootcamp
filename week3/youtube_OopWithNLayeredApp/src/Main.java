import business.ProductManager;
import core.logging.*;
import dataAccess.HibernateProductDao;
import entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {

        Product product1 = new Product(01,"Console",399);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()	};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);

    }
}
