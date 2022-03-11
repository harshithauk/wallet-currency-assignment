package com.thoughtworks;

import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {
    @Test
    void shouldCheckWhetherCorrectBalanceIsPresentOnAddingMoneyInWallet() throws InvalidAmountException {
        Wallet wallet = new Wallet();
        Rupee rupee = new Rupee(30.0);
        wallet.deposit(rupee);
        Rupee balance = wallet.getBalance();
        assertEquals(balance,new Rupee(30.0));

    }
}
