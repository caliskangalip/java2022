public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product=new Product();
        product.name="Çokoprens";
        product.id=001;
        product.price=4.75;

        manager.add(product);
    }
}