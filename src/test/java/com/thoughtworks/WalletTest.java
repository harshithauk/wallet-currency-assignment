package com.thoughtworks;

import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {

    @Test
    void shouldNotUseWalletIfNegativeAmountIsAdded() {
        Wallet wallet = new Wallet();
        double amount;
        assertThrows(InvalidAmountException.class, () -> wallet.addMoney(-8.0));
    }

    @Test
    void shouldReturnCorrectBalanceInCaseOfSuccessfulDeposit() throws InvalidAmountException {
        Wallet wallet = new Wallet();
        wallet.addMoney(100.0);
        double balance = wallet.getBalance();
        assertEquals(balance,100.0);
    }
}
