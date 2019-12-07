package com.benyue.exercises;

import java.util.Arrays;

public class StringCalculator {

    public static final String DELIMITER_PREFIX = "//";

    public int Add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        int[] numberList = getNumbers(numbers, getDelimiters(numbers));

        String[] negatives = Arrays.stream(numberList).filter(n -> n < 0).mapToObj(String::valueOf).toArray(String[]::new);

        if (negatives.length > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + String.join(",", negatives));
        }

        return Arrays.stream(numberList).filter(n -> n < 1000).sum();
    }

    private int[] getNumbers(String numbers, String delimiters) {
        if (numbers.startsWith(DELIMITER_PREFIX)) {
            numbers = numbers.substring(4);
        }
        return Arrays.stream(numbers.split(delimiters)).mapToInt(Integer::parseInt).toArray();
    }

    private String getDelimiters(String numbers) {
        if (numbers.startsWith(DELIMITER_PREFIX)) {
            return numbers.substring(2, 3);
        }
        return "[,\n]";
    }
}
