package com.thoughtworks;

import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void shouldReturnFalseWhenTwoRupeeObjectsArePassed() throws InvalidAmountException {
        Rupee rupee = new Rupee(10.0);
        Rupee anotherRupee = new Rupee(10.0);
        assertNotEquals(rupee, anotherRupee);
    }
    @Test
    void shouldNotCreateRupeeInCaseOfNegativeInputProvided(){
        assertThrows(InvalidAmountException.class,()->new Rupee(-10.0));
    }

}
