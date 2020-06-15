package com.benyue.exercises.stringcalculator;

import java.util.Arrays;

public class StringCalculator {

    public int Add(String numbers) {
        int[] numberList = new InputParser(numbers).getNumbers();

        negativeCheck(numberList);

        return Arrays.stream(numberList).filter(n -> n < 1000).sum();
    }

    private void negativeCheck(int[] numberList) {
        String[] negatives = Arrays.stream(numberList).filter(n -> n < 0).mapToObj(String::valueOf).toArray(String[]::new);

        if (negatives.length > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + String.join(",", negatives));
        }
    }
}
