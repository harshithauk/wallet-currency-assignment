package com.thoughtworks;

import exceptions.InvalidAmountException;

public class USDollar {
    private final double value;
    public USDollar(double value) throws InvalidAmountException {
        if (value < 0) {
            throw new InvalidAmountException("invalid amount specified");
        }
        this.value = value;
    }
    public USDollar add(USDollar dollar) throws InvalidAmountException {
        double value = this.value + dollar.value;
        System.out.println(value);
        return new USDollar(value);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        USDollar anotherDollar = (USDollar) obj;
        return this.value == anotherDollar.value;
    }

    public Rupee convertToRupee() throws InvalidAmountException {
        return new Rupee(value*76);
    }
}
