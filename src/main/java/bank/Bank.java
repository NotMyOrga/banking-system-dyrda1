package bank;

import java.util.*;
import main.Person;

public class Bank {
    private final Map<Person, BankAccount> bankAccounts = new HashMap<>();

    public void registerCustomer(Person person, double initialDeposit) {
        if (!bankAccounts.containsKey(person)) {
            bankAccounts.put(person, new BankAccount(person, initialDeposit));
        }
    }

    public boolean transfer(Person from, Person to, double amount) {
        // TODO: Check if both are registered customers and perform transfer
        return false;
    }

    public double getBalance(Person customer) {
        if (bankAccounts.containsKey(customer)) {
            return bankAccounts.get(customer).getBalance();
        }
        return 0.0;
    }
}

