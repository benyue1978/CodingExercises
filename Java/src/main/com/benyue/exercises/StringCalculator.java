package com.benyue.exercises;

import java.util.ArrayList;

public class StringCalculator {
    public int Add(String numbers) {
        int result = 0;

        if (numbers.isEmpty())
            return 0;

        String delimiters = "[,\n]";

        if (numbers.startsWith("//")) {
            delimiters = numbers.substring(2, 3);
            numbers = numbers.substring(4);
        }

        String[] numberList = numbers.split(delimiters);
        ArrayList<String> negatives = new ArrayList<>();

        for (String number : numberList) {
            int n = Integer.parseInt(number);
            if (n < 0) {
                negatives.add(number);
            }
            result += n;
        }

        if (negatives.size() > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + String.join(",", negatives));
        }

        return result;
    }
}
