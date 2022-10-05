import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Products;

public class Main {
    public static void main(String[] args) throws Exception {
        Products product1=new Products(1,"IPhone XR", 10000);
        Logger[] loggers={new DatabaseLogger(), new FileLogger(),new MailLogger()};
        ProductManager productManager=new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
    }
}