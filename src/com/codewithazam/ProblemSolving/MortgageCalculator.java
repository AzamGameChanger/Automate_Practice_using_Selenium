package com.codewithazam.ProblemSolving;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int loan = (int) readNumber("Personal loan", 1000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate", 1, 30);
        byte years = (byte) readNumber("Period (Years)", 1, 30);

        printMortgage(loan, annualInterestRate, years);
        printScheduledPayments(loan, annualInterestRate, years);
    }

    private static void printScheduledPayments(int loan, float annualInterestRate, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        for (short months = 1; months<= years *MONTHS_IN_YEAR; months++){
           double balance= calculateRemainingBalance(loan, annualInterestRate, years,months);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    private static void printMortgage(int loan, float annualInterestRate, byte years) {
        double mortgage = calculateMortgage(loan, annualInterestRate, years);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("______________");
        System.out.println("Monthly payment : " + formattedMortgage);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number greater than " + min + " or less than equal to " + max);
        }
        return value;
    }

    public static double calculateMortgage(int loan, float annualInterestRate, byte years) {
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        double mortgage =
                loan * ((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayments))) / ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1));
        return mortgage;
    }

    public static double calculateRemainingBalance(int loan, float annualInterestRate, byte years, short numberOfPaymentsMade) {
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        double balance =
                loan * ((Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                        / (Math.pow(1 + monthlyInterestRate,numberOfPayments) - 1));
        return balance;
    }
}
