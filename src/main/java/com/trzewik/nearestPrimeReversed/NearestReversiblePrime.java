package com.trzewik.nearestPrimeReversed;

public class NearestReversiblePrime {

    public int findNearestReversiblePrime(int number) {
        int primeNumber = number > 0 ? number : 1;
        while (true) {
            if (checkIfNotPrime(primeNumber += 1)) {
                continue;
            }
            if (checkIfNotPrime(reverseNumber(primeNumber))) {
                continue;
            }
            return primeNumber;
        }
    }

    private int reverseNumber(int number) {
        String currentNumber = Integer.toString(number);
        StringBuilder reversedNumber = new StringBuilder();
        int currentNumberLength = currentNumber.length();
        for (int i = 1; i <= currentNumberLength; i++) {
            reversedNumber.append(currentNumber.charAt(currentNumberLength - i));
        }
        return Integer.parseInt(reversedNumber.toString());
    }

    private boolean checkIfNotPrime(int number) {
        boolean verification = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                verification = true;
                break;
            }
        }
        return verification;
    }
}