package com.thoughtworks;

import exceptions.InvalidAmountException;

public class Wallet {
    private double balance;

    public void addMoney(double amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("invalid amount entered");
        }
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }
}
