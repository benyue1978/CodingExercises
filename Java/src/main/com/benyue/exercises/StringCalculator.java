package com.benyue.exercises;

import java.util.Arrays;

public class StringCalculator {

    public static final String DELIMITER_PREFIX = "//";

    public int Add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        int[] numberList = getNumbers(numbers, getDelimiters(numbers));

        negativeCheck(numberList);

        return Arrays.stream(numberList).filter(n -> n < 1000).sum();
    }

    private void negativeCheck(int[] numberList) {
        String[] negatives = Arrays.stream(numberList).filter(n -> n < 0).mapToObj(String::valueOf).toArray(String[]::new);

        if (negatives.length > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + String.join(",", negatives));
        }
    }

    private int[] getNumbers(String numbers, String delimiters) {
        String trimmedNumbers = isWithDelimiter(numbers) ? numbers.substring(4) : numbers;
        return Arrays.stream(trimmedNumbers.split(delimiters)).mapToInt(Integer::parseInt).toArray();
    }

    private String getDelimiters(String numbers) {
        return isWithDelimiter(numbers) ? numbers.substring(2, 3) : "[,\n]";
    }

    private boolean isWithDelimiter(String numbers) {
        return numbers.startsWith(DELIMITER_PREFIX);
    }
}
