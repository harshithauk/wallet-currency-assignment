package com.thoughtworks;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

public class Wallet {
    private Money balance;

    public Wallet() throws InvalidAmountException {
        balance = new Money(0, Currency.RUPEE);
    }

    public void deposit(Money rupee) throws InvalidAmountException {
        this.balance = this.balance.add(rupee);
    }

    public Money getBalance(Currency currency) throws InvalidAmountException {
        if (currency == Currency.DOLLAR) {
            return this.balance.convertToDollar();
        }
        return this.balance;
    }

    public Money withdraw(Money rupee) throws InsufficientBalanceException, InvalidAmountException {
        this.balance = this.balance.subtract(rupee);
        return this.balance;
    }
}
