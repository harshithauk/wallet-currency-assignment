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
        System.out.println(value);
        return new Rupee(value);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Rupee anotherRupee = (Rupee) obj;
        return this.value == anotherRupee.value;
    }
}


