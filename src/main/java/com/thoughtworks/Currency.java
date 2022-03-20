package com.thoughtworks;

public enum Currency {
    RUPEE(1),
    DOLLAR(76),
    EURO(1 / 0.012);


    private final double baseAmount;

    Currency(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public double convert(double amount) {
        return baseAmount * amount;
    }


}
