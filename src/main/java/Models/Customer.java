package Models;

import Interfaces.ICustomer;

import java.util.ArrayList;

public class Customer extends Person implements ICustomer {
   private double walletBalance;
   private Store store;

   private ArrayList<Product> cart;
   private double amount = 0;

    Customer(String name, double walletBalance, Store store){
        super(name);
        this.walletBalance = walletBalance;
        this.store = store;
        this.cart = new ArrayList<>();
    }
    @Override
            public void buyProduct(Product product, int quantity) {
               Product newProd = new Product(product.getProductName(), product.getPricePerUnit(), quantity);
                for (Product p: store.getListOfProduct()) {
                    if(p.getProductName().equals(newProd.getProductName())){
                    cart.add(newProd);
            }
    }
}

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount += amount;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double amount) {
        this.walletBalance -= amount;
    }
}
