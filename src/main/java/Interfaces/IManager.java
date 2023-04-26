package Interfaces;

import Models.Applicant;
import Models.Cashier;

public interface IManager {
     void fireCashier(Cashier cashier);
    void hireEmployee(Applicant applicant);
    void addNewCashier(Cashier cashier);
}
