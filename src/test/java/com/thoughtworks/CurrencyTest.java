package com.thoughtworks;

import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {

    @Test
    void checkIfBalanceInDollarWhenThePReferredCurrencyIsDollar() throws InvalidAmountException {
        Wallet wallet = new Wallet();
        Money rupee = new Money(75.85, Currency.RUPEE);
        wallet.deposit(rupee);
        Money dollar = new Money(1, Currency.DOLLAR);
        wallet.deposit(dollar);
        Money anotherRupee = new Money(152.15, Currency.RUPEE);
        wallet.deposit(anotherRupee);

        Money balance = wallet.getBalance(Currency.DOLLAR);

        assertEquals(balance, new Money(4,Currency.DOLLAR));
    }


}
