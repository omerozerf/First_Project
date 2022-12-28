package business.concretes;

import business.abstacts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {

        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategorideki ürünü sistem kabul etmiyor");
            return;
        }

        this.productDao.add(product);
        this.loggerService.logToSystem("Success");

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
