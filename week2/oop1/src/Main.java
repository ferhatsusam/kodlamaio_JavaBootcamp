public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Philips Airfryer ");
        product1.setDiscount(7);
        product1.setUnitPrice(500);
        product1.setUnitInStock(30);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Xiaomi Airfryer");
        product2.setDiscount(7);
        product2.setUnitPrice(350);
        product2.setUnitInStock(50);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Schafer Airfryer");
        product3.setDiscount(7);
        product3.setUnitPrice(330);
        product3.setUnitInStock(60);
        product3.setImageUrl("image.jpg3");

        Product[] products = { product1, product2, product3 };
        for (Product product : products) {
            System.out.println(product.getName());

            IndividualCustomer individualCustomer = new IndividualCustomer();
            individualCustomer.setId(1);
            individualCustomer.setPhone("454512");
            individualCustomer.setCustomerNumber("254787");
            individualCustomer.setFirstName("Ferhat");
            individualCustomer.setLastName("Susam");

            CorporateCustomer corporateCustomer = new CorporateCustomer();
            corporateCustomer.setId(2);
            corporateCustomer.setCompanyName("Kodlama.io");
            corporateCustomer.setPhone("54545");
            corporateCustomer.setTaxNumber("1111");
            corporateCustomer.setCustomerNumber("2545");

            Customer[] customers = { individualCustomer, corporateCustomer };
        }
    }
}