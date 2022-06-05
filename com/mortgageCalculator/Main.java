package com.mortgageCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println("First attempt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the period (in years): ");
        int period = scanner.nextInt();
        MortgageCalculator mc = new MortgageCalculator();
        double mortgage = mc.calculateMortgage(principal, annualInterestRate, period);
        System.out.println("Mortgage: " + mortgage);

    }
}
