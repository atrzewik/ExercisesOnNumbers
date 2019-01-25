package com.trzewik.narcissisticNumber;

import java.util.ArrayList;
import java.util.List;

public class VerificationOfNarcissisticNumber {

    public boolean checkIfNarcissisticNumber(int number) {
        List<Double> numberDigits = collectDigitsOfNumber(number);
        int numberOfDigits = numberDigits.size();
        int count = 0;
        for (Double digit : numberDigits) {
            count += Math.pow(digit, numberOfDigits);
        }
        return count == number;
    }

    private List<Double> collectDigitsOfNumber(int number) {
        List<Double> numberDigits = new ArrayList<>();
        while (number > 0) {
            Integer digit = number % 10;
            numberDigits.add(digit.doubleValue());
            number /= 10;
        }
        return numberDigits;
    }
}
