package Models;

import Interfaces.IManager;

import java.util.ArrayList;

public class Manager implements IManager {
    private Store store;
    private static int employeeStaffID = 0;

    public Manager(Store store) {
        this.store = store;
    }
@Override
    public void hireEmployee(Applicant applicant) {
        if (applicant.getAge() >= 19 && applicant.getAge() <= 30) {
            applicant.setEmployed(true);
            System.out.println(String.format("You have hired a new %s Staff.", applicant.getName()));

        } else {
            System.out.printf("%s, Sorry you are not within the age limit for employment.", applicant.getName());
            System.out.println();
        }
    }
@Override
    public void addNewCashier(Cashier cashier) {
        store.getListOfCashiers().add(cashier);
    }
@Override
        public void fireCashier(Cashier cashier) {
        for(int i=0; i < store.getListOfCashiers().size(); i++) {
            if (store.getListOfCashiers().get(i).getStaffID() == cashier.getStaffID()) {
                if(cashier.getNoOfSales() < 2) {
                    store.getListOfCashiers().remove(cashier);
                    System.out.println(cashier.getName() + " has been fired.");
                    break;
                }else{
                    System.out.println(cashier.getName() + " cannot be fired");
                    break;
                }
            }

        }
        }


    }

