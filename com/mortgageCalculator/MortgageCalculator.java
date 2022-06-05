package com.mortgageCalculator;

public class MortgageCalculator {
    public double principal;
    public double rateOfInterest;
    public double period;

    public double calculateMortgage(double principal, double interest, int period) {
        double monthlyInterestRate = interest / 12;
        int numberOfMonths = period * 12;
        System.out.println("This function is being called");
        return monthlyInterestRate;
    }
}
