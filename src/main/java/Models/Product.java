package Models;

public class Product {
    private String productName;
    private double pricePerUnit;
    private int quantity;

    Product(String productName, double pricePerUnit, int quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
       return "Product Name: "+ productName+" Price: "+ pricePerUnit+ " Quantity: "+quantity;
    }
}
