package com.trzewik.perfectNumber;

import java.util.ArrayList;
import java.util.List;

public class VerificationOfPerfectNumber {

    public boolean checkIfPerfectNumber(int number) {
        int sumOfDivisors = 0;
        List<Integer> divisors = findAllDivisors(number);
        for (int divisor : divisors) {
            sumOfDivisors += divisor;
            if (sumOfDivisors > number) {
                break;
            }
        }
        return sumOfDivisors == number && number!=0;
    }

    private List<Integer> findAllDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
