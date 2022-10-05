package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Products;

public class HibernateProductDao implements ProductDao{
    public void add(Products product){
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
