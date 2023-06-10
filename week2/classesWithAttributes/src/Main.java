

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Apple Vision Pro");
        product.setId(01);
        product.setDescription("Augmented Reality Glasses");
        product.setPrice(3499);
        product.setStockAmount(100);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
