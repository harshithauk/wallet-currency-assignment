package com.thoughtworks;

import exceptions.InvalidAmountException;

public class Wallet {
    private Money balance;

    public Wallet() throws InvalidAmountException {
        balance = new Money(0, Currency.RUPEE);
    }

    public void deposit(Money rupee) throws InvalidAmountException {
        this.balance = this.balance.add(rupee);
    }
    public Money getBalance(){
        return this.balance;
    }

}
