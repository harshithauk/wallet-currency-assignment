package com.thoughtworks;

import exceptions.InvalidAmountException;

public class Wallet {
    private Rupee balance;

    public Wallet() throws InvalidAmountException {
        balance = new Rupee(0);
    }

    public void deposit(Rupee rupee) throws InvalidAmountException {
        this.balance = this.balance.add(rupee);
    }
    public Rupee getBalance(){
        return this.balance;
    }

}
