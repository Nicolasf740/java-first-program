package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
    public static final Map<Integer, Float> bestRates = Map.of(
            1, 5.50f, 2, 3.45f, 3, 2.67f
    );

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);


        System.out.println("Enter the Loan term (in years");
        int LoanTermInYears = scanner.nextInt();
        float bestRate = getRates(LoanTermInYears);
        if(bestRate == 0.0f) {
            System.out.println("No available rates for term: " + LoanTermInYears + "years");

        } else {
            System.out.println("Best available rate: " + getRates(LoanTermInYears) + "%");
        }
        scanner.close();
    }


    public static <LoanTermInYears> float getRates (LoanTermInYears) {
        if(bestRates.containsKey(LoanTermInYears)) {
            return bestRates.get(LoanTermInYears);
        }
        return 0.0f;
    }
}