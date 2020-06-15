package com.benyue.exercises.stringcalculator;

import java.util.Arrays;

public class InputParser {
    private static final String DELIMITER_PREFIX = "//";
    private final String numbers;
    private final String delimiters;

    public InputParser(String numbers) {
        this.numbers = numbers;
        this.delimiters = getDelimiters(numbers);

    }

    private String getDelimiters(String numbers) {
        return isWithDelimiter(numbers) ? extractDelimiter(numbers) : "[,\n]";
    }

    private static String extractDelimiter(String numbers) {
        return numbers.substring(2, 3);
    }

    public int[] getNumbers() {
        if (emptyList()){
            return new int[]{};
        }
        String trimmedNumbers = isWithDelimiter(numbers) ? numbers.substring(4) : numbers;
        return Arrays.stream(trimmedNumbers.split(delimiters)).mapToInt(Integer::parseInt).toArray();
    }

    private boolean isWithDelimiter(String numbers) {
        return numbers.startsWith(DELIMITER_PREFIX);
    }

    private boolean emptyList() {
        return numbers.isEmpty();
    }
}
