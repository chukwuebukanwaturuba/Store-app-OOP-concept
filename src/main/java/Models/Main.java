package Models;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Store store = new Store("Chukzplc");
    Manager manager = new Manager(store);

    Applicant applicant1 = new Applicant("Favor", 24);
    Applicant applicant2 = new Applicant("Promise", 35);
    Applicant applicant3 = new Applicant("King", 25);
    Applicant applicant4 = new Applicant("Nneka", 25);


    manager.hireEmployee(applicant1);
    manager.hireEmployee(applicant2);
    manager.hireEmployee(applicant3);
    manager.hireEmployee(applicant4);
        Cashier cashier1 = new Cashier(applicant1.getName(), store, 1000);
        Cashier cashier3 = new Cashier(applicant3.getName(), store, 1001);
        Cashier cashier4 = new Cashier(applicant4.getName(), store, 1002);
    manager.addNewCashier(cashier1);
    manager.addNewCashier(cashier3);
    manager.addNewCashier(cashier4);


    Product product1 = new Product("Beans", 2000, 90);
    Product product2 = new Product("Bread", 3000, 98);
    Product product3 = new Product("Milo", 400, 95);
    Product product4 = new Product("Milk", 500, 100);

    store.addProduct(product1);
    store.addProduct(product2);
    store.addProduct(product3);
    store.addProduct(product4);


    Customer customer1 = new Customer("Chi", 70000, store);
    Customer customer2 = new Customer("Chizoba", 90000, store);
    Customer customer3 = new Customer("Frank", 700000, store);
    Customer customer4= new Customer("Cynthia", 170000, store);

    customer1.buyProduct(product1, 5);
    customer2.buyProduct(product2, 3);
    customer3.buyProduct(product3, 7);
    customer4.buyProduct(product4, 10);
    customer2.buyProduct(product3, 3);

   cashier1.checkOut(customer1);
   cashier1.checkOut(customer2);
   cashier1.checkOut(customer3);
   cashier3.checkOut(customer4);

   manager.fireCashier(cashier1);
   manager.fireCashier(cashier3);
   manager.fireCashier(cashier4);

 }

}