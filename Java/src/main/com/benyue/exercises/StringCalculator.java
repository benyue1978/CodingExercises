package com.benyue.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {

    public static final String DELIMITER_PREFIX = "//";

    public int Add(String numbers) {
        int result = 0;

        if (numbers.isEmpty())
            return 0;

        String delimiters = getDelimiters(numbers);

        int[] numberList = getNumbers(numbers, delimiters);

        ArrayList<String> negatives = new ArrayList<>();

        for (int number : numberList) {
            if (number < 0) {
                negatives.add(Integer.toString(number));
            }

            if (number > 1000) {
                continue;
            }
            result += number;
        }

        if (negatives.size() > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + String.join(",", negatives));
        }

        return result;
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
