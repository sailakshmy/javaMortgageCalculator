package com.mortgageCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println("First attempt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        long principal = scanner.nextLong();
        System.out.print("Enter the annual interest rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Enter the period (in years): ");
        short period = scanner.nextShort();
        MortgageCalculator mc = new MortgageCalculator();
        String mortgage = mc.calculateMortgage(principal, annualInterestRate, period);
        System.out.println("Mortgage: " + mortgage);

    }
}
