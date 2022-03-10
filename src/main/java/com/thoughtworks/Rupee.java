package com.thoughtworks;

import exceptions.InvalidAmountException;

public class Rupee {
    private final double value;

    public Rupee(double value) throws InvalidAmountException {
        if (value < 0) {
            throw new InvalidAmountException("invalid amount specified");
        }
        this.value = value;
    }

    public Rupee add(Rupee rupee) throws InvalidAmountException {
        double value = this.value + rupee.value;
        return new Rupee(value);
    }

}
