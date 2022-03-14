package com.thoughtworks;

import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void shouldCheckWhetherCorrectBalanceIsPresentOnAddingMoneyInWallet() throws InvalidAmountException {
        Wallet wallet = new Wallet();
        Money rupee = new Money(30.0, Currency.RUPEE);
        wallet.deposit(rupee);
        Money balance = wallet.getBalance();
        assertEquals(balance, new Money(30.0, Currency.RUPEE));

    }
}
