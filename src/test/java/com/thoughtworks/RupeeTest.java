package com.thoughtworks;

import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void shouldAssertOneTenRupeeNotSameAsAnotherTenRupee() throws InvalidAmountException {
        Rupee rupee = new Rupee(10.0);
        Rupee anotherRupee = new Rupee(10.0);
        assertNotSame(rupee, anotherRupee);
    }

    @Test
    void shouldNotCreateRupeeInCaseOfNegativeInputProvided() {
        assertThrows(InvalidAmountException.class, () -> new Rupee(-10.0));
    }

    @Test
    void shouldAssertValueOfOneTenRupeeIsEqualToAnotherTenRupee() throws InvalidAmountException {
        Rupee rupee = new Rupee(10.0);
        Rupee anotherRupee = new Rupee(10.0);

        assertEquals(rupee, anotherRupee);
    }

    @Test
    void shouldAssertTenRupeeIsNotEqualToNull() throws InvalidAmountException {
        Rupee rupee = new Rupee(10.0);
        assertNotEquals(rupee, null);
    }

    @Test
    void shouldAssertTenRupeeIsNotEqualToADifferentType() throws InvalidAmountException {
        Rupee rupee = new Rupee(10.0);
        Wallet wallet = new Wallet();
        assertNotEquals(rupee, wallet);
    }

    @Test
    void shouldAssertTenRupeeIsEqualToAdditionOfSevenRupeeAndThreeRupee() throws InvalidAmountException {
        Rupee tenRupee = new Rupee(10.0);
        Rupee sevenRupee = new Rupee(7.0);
        Rupee threeRupee = new Rupee(3.0);

        assertEquals(tenRupee, sevenRupee.add(threeRupee));

    }

}
