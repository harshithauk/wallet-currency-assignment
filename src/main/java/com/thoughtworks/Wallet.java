package com.thoughtworks;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

public class Wallet {
    private Money balance;

    public Wallet() throws InvalidAmountException {
        balance = new Money(0, Currency.RUPEE);
    }

    public void deposit(Money money) throws InvalidAmountException {
        this.balance = this.balance.add(money);
    }

    public Money getBalance(Currency currency) throws InvalidAmountException {
        return this.balance.getBalance(currency);
    }

    public Money withdraw(Money money) throws InsufficientBalanceException, InvalidAmountException {
        this.balance = this.balance.subtract(money);
        return this.balance;
    }
}
