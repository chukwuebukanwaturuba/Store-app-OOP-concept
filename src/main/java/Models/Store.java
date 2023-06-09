package Models;

import java.util.ArrayList;

public class Store {
    private String storeName;
    private ArrayList<Cashier> listOfCashier;
    private ArrayList<Product> listOfProduct;


    public Store (String storeName) {
        this.storeName = storeName;
        this.listOfCashier = new ArrayList<>();
        this.listOfProduct = new ArrayList<>();
    }

    public void addNewCashier(Cashier cashier) {
        listOfCashier.add(cashier);
    }
    public void addProduct(Product product){
        listOfProduct.add(product);
    }

    public ArrayList<Cashier> getListOfCashiers() {
        return listOfCashier;
    }

    public ArrayList<Product> getListOfProduct() {
        return listOfProduct;
    }

}


