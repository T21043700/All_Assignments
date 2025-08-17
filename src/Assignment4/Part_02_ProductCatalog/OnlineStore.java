package Assignment4.Part_02_ProductCatalog;

import java.util.Arrays;

public class OnlineStore {
    public static void main(String[] args) {
        Product product1 = new Product("162", "Tablet", 1316, true);
        Product product2 = new Product("298", "Phone", 2785, false);
        Product product3 = new Product("317", "Headphones", 325, true);

        System.out.println("Product ID: " + product1.getProductId());
        System.out.println("Product Name: " + product1.getProductName());
        System.out.println("Product Price: " + product1.getPrice());
        System.out.println("Product Available: " + product1.getInStock());
        System.out.println();

        //set new price
        product1.setPrice(-10);
        product1.setPrice(665);

        //set new stock status
        System.out.println("Product Available: " + product1.getInStock());
        product1.setInStock(false);
        System.out.println("Product Available: " + product1.getInStock());


/*
        System.out.println("Product ID: " + product2.getProductId());
        System.out.println("Product Name: " + product2.getProductName());
        System.out.println("Product Price: " + product2.getPrice());
        System.out.println("Product Available: " + product2.getInStock());
        System.out.println();

        System.out.println("Product ID: " + product3.getProductId());
        System.out.println("Product Name: " + product3.getProductName());
        System.out.println("Product Price: " + product3.getPrice());
        System.out.println("Product Available: " + product3.getInStock());
        System.out.println();
*/

    }
}
