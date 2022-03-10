package com.thoughtworks;

import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {

    @Test
    void shouldNotUseWalletIfNegativeAmountIsAdded() {
        Wallet wallet = new Wallet();
        double amount;
        assertThrows(InvalidAmountException.class, () -> wallet.addMoney(-8));
    }
}
