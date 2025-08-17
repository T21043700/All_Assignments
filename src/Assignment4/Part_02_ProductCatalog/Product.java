package Assignment4.Part_02_ProductCatalog;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private boolean inStock;

    public Product(String productId, String productName, double price, boolean inStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.inStock = inStock;
    }

    //setter methods
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(double newPrice) {
        System.out.println("Current Price = " + price);
        //this.price = price;
        if (newPrice <= 0 ){
            System.out.println("Price can't be negative value or 0");
            System.out.println();
        }else{
            System.out.println("New price = " + newPrice);
            this.price = newPrice;
            System.out.println();
        }
    }
    public void setInStock(boolean status) {
        this.inStock = status;
    }


    //Getter methods
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public boolean getInStock() {
        return inStock;
    }
}
