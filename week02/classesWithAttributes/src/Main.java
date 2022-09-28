public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager=new ProductManager();
        productManager.add(product);

        //Constructor metodu ile çalışmak
        Product product1=new Product(2,"Fırın", "Delonghi Fast", 8900,7);
        productManager.add(product1);
    }
}