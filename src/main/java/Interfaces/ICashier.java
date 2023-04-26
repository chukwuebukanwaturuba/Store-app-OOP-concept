package Interfaces;

import Models.Customer;

public interface ICashier {

    void checkOut(Customer customer);
    void receipt(Customer customer);
}
