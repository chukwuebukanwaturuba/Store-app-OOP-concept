package Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {
Store store = new Store("Frankz");
Manager manager = new Manager(store);
Cashier cashier = new Cashier("Promise", store, 3200);
Customer customer = new Customer("Deji", 95000, store);

Product product1 = new Product("Milo", 100.05, 50);
Product product2 = new Product("Corn Flakes", 50.43, 30);
    @Test
    void checkOut() {
        store.addProduct(product1);
        store.addProduct(product2);

        customer.buyProduct(product1, 3);
        customer.buyProduct(product2, 5);

        cashier.checkOut(customer);

        assertEquals(1, cashier.getNoOfSales());
    }


}