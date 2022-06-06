package com.mortgageCalculator;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageCalculator {
    public double principal;
    public double rateOfInterest;
    public double period;

    public String calculateMortgage(double principal, double interest, int period) {
        double monthlyInterestRate = interest / (12 * 100);
        int numberOfMonths = period * 12;
        double mortgage = principal * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfMonths))
                / ((Math.pow(1 + monthlyInterestRate, numberOfMonths)) - 1));
        return NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
    }
}
