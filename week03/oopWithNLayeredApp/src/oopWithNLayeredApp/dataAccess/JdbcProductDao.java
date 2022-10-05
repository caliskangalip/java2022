package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Products;

public class JdbcProductDao implements ProductDao{
    public void add(Products product){
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
