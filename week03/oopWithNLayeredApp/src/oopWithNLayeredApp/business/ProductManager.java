package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Products;

import java.util.List;


public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }


    public void add(Products product) throws Exception{
        //iş kuralları
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 liradan daha az olamaz");
        }
        //Bir katman başka bir katmanın klasını kullanmakta iken sadece interface üzerinden erişim kurmalıdır
        //ProductDao productDao =new JdbcProductDao();
        productDao.add(product);
        for (Logger logger:loggers) {
            System.out.println(product.getName());
        }
    }
}
