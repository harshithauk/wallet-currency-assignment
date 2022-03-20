package com.thoughtworks;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void shouldCheckWhetherCorrectBalanceIsPresentOnAddingMoneyInWallet() throws InvalidAmountException {
        Wallet wallet = new Wallet();
        Money rupee = new Money(30.0, Currency.RUPEE);

        wallet.deposit(rupee);
        Money balance = wallet.getBalance(Currency.RUPEE);

        assertEquals(balance, new Money(30.0, Currency.RUPEE));

    }

    @Test
    void shouldCheckBalanceIsEightySixRupeeAfterAddingTenRupeeAndOneDollar() throws InvalidAmountException {
        Wallet wallet = new Wallet();
        Money rupee = new Money(10, Currency.RUPEE);
        wallet.deposit(rupee);
        Money dollar = new Money(1, Currency.DOLLAR);
        wallet.deposit(dollar);

        Money balance = wallet.getBalance(Currency.RUPEE);

        assertEquals(balance, new Money(86.0, Currency.RUPEE));
    }

    @Test
    void shouldCheckBalanceIsSeventyRupeeAfterWithDrawingSixteenRupeeFromEightSixRupee() throws InvalidAmountException, InsufficientBalanceException {
        Wallet wallet = new Wallet();
        Money rupee = new Money(10, Currency.RUPEE);
        wallet.deposit(rupee);
        Money dollar = new Money(1, Currency.DOLLAR);
        wallet.deposit(dollar);

        Money withdrawRupee = new Money(16, Currency.RUPEE);
        Money balance = wallet.withdraw(withdrawRupee);

        assertEquals(new Money(70.0,Currency.RUPEE), balance);
    }

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
