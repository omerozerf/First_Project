import business.abstacts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.HibernateProductDao;
import dataAccess.concretes.OrkunProductDao;
import entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductManager(new OrkunProductDao(), new JLoggerManagerAdapter());

        Product product = new Product(1, 2, "Table", 500, 4);
        productService.add(product);

    }
}