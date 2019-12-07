package com.benyue.exercises;

public class StringCalculator {
    public int Add(String numbers) {
        int result = 0;

        if (numbers.isEmpty())
            return 0;

        String delimiters = "[,\n]";

        if (numbers.startsWith("//")){
            delimiters = numbers.substring(2, 3);
            numbers = numbers.substring(4);
        }

        String[] numberList = numbers.split(delimiters);

        for (String number: numberList){
            result += Integer.parseInt(number);
        }
        return result;
    }
}
