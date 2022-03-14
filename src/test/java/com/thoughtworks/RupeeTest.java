package com.thoughtworks;

import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void shouldAssertOneTenRupeeNotSameAsAnotherTenRupee() throws InvalidAmountException {
        Money rupee = new Money(10.0, Currency.RUPEE);
        Money anotherRupee = new Money(10.0, Currency.RUPEE);
        assertNotSame(rupee, anotherRupee);
    }

    @Test
    void shouldNotCreateRupeeInCaseOfNegativeInputProvided() {
        assertThrows(InvalidAmountException.class, () -> new Money(-10.0, Currency.RUPEE));
    }

    @Test
    void shouldAssertValueOfOneTenRupeeIsEqualToAnotherTenRupee() throws InvalidAmountException {
        Money rupee = new Money(10.0, Currency.RUPEE);
        Money anotherRupee = new Money(10.0, Currency.RUPEE);

        assertEquals(rupee, anotherRupee);
    }

    @Test
    void shouldAssertTenRupeeIsNotEqualToNull() throws InvalidAmountException {
        Money rupee = new Money(10.0, Currency.RUPEE);
        assertNotEquals(rupee, null);
    }

    @Test
    void shouldAssertTenRupeeIsNotEqualToADifferentType() throws InvalidAmountException {
        Money money = new Money(10.0, Currency.RUPEE);
        Wallet wallet = new Wallet();
        assertNotEquals(money, wallet);
    }

    @Test
    void shouldAssertTenRupeeIsEqualToAdditionOfSevenRupeeAndThreeRupee() throws InvalidAmountException {
        Money tenRupee = new Money(10.0, Currency.RUPEE);
        Money sevenRupee = new Money(7.0, Currency.RUPEE);
        Money threeRupee = new Money(3.0, Currency.RUPEE);

        assertEquals(tenRupee, sevenRupee.add(threeRupee));

    }

    @Test
    void shouldAssertOneDollarIsSeventySixRupee() throws InvalidAmountException {
        Money seventySixRupee = new Money(76.0, Currency.RUPEE);
        Money oneDollar = new Money(1, Currency.DOLLAR);
        assertEquals(seventySixRupee, oneDollar);
    }

    @Test
    void shouldAssertOneRupeeIsZeroPointZeroOneTwoEuro() throws InvalidAmountException {
        Money seventySixRupee = new Money(76.0, Currency.RUPEE);
        Money oneEuro = new Money(0.012, Currency.EURO);
        assertEquals(seventySixRupee, oneEuro);
    }
}
