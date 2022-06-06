package com.mortgageCalculator;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageCalculator {
    public double principal;
    public double rateOfInterest;
    public double period;

    public String calculateMortgage(long principal, float interest, short period) {
        final byte NO_OF_MONTHS_IN_A_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterestRate = interest / (NO_OF_MONTHS_IN_A_YEAR * PERCENT);
        int numberOfMonths = period * NO_OF_MONTHS_IN_A_YEAR;
        double mortgage = principal * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfMonths))
                / ((Math.pow(1 + monthlyInterestRate, numberOfMonths)) - 1));
        return NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
    }
}
