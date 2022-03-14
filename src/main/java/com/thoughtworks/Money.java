package com.thoughtworks;

import exceptions.InvalidAmountException;

import java.util.Objects;

public class Money {
    private final double value;
    private final Currency currency;

    public Money(double value, Currency currency) throws InvalidAmountException {

        if (value < 0) {
            throw new InvalidAmountException("invalid amount specified");
        }
        this.value = value;
        this.currency = currency;
    }

    public Money add(Money rupee) throws InvalidAmountException {
        double value = this.value + rupee.value;
        return new Money(value, currency);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != Money.class)
            return false;
        Money anotherMoney = (Money) obj;
        return this.currency.convert(this.value) == anotherMoney.currency.convert(anotherMoney.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }
}


