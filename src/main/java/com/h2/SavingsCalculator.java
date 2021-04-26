package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator {
    private float credits;
    private float debits;

    public SavingsCalculator(float credits, float debits) {
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;
        for(float credit: credits) {
            sum += credits;
        }
        return sum;
    }

    private float sumOfdebits() {
        float sum = 0.0f;
        for(float debit: debits) {
            sum += debits;
        }
        return sum;
    }
    private static int remainingDaysInMouth(LocalDate date) {
        YearMonth yearMouth = YearMonth.of(date.getYear(), date.getMonth());
        int totalDaysInMoth = yearMouth.lengthOfMonth();
        int remainingDays = totalDaysInMoth - date.getDayOfMonth();
        return remainingDays
    }

    public float calculate() {
        return sumOfCredits() - sumOfdebits();
    }

    public static void main(String[] args) {
        final String[] creditsAsString = args[0].split(";");
        final String[] debitsAsString = args[1].split(",");

        final float credits = new float[creditsAsString.length];
        final float debits = new float[debitsAsString.length];

        for(int i = 0; i < creditsAsString.length; i++) {
            credits[i] = Float.parseFloat(creditsAsString[i]);
        }

        for(int i = 0; i < debitsAsString.length; i++) {
            debits[i] = Float.parseFloat(debitsAsString[i]);
        }

        final SavingsCalculator calculator = new SavingsCalculator(credits, debits);
        float netSavings = calculator.calculate();
        System.out.println("Net Savings = " netSavings + ", remaining days in month = " + remainingDaysInMouth(LocalDate.now()));
    }
}
