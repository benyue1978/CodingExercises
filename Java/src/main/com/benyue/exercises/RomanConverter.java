package com.benyue.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RomanConverter {
    HashMap<Integer, String> numberRomanMap = new HashMap<>();
    HashMap<String, Integer> romanNumberMap = new HashMap<>();

    public RomanConverter() {
        numberRomanMap.put(1, "I");
        numberRomanMap.put(5, "V");
        numberRomanMap.put(10, "X");
        numberRomanMap.put(50, "L");
        numberRomanMap.put(100, "C");
        numberRomanMap.put(500, "D");
        numberRomanMap.put(1000, "M");
        numberRomanMap.put(4, "IV");
        numberRomanMap.put(9, "IX");
        numberRomanMap.put(40, "XL");
        numberRomanMap.put(90, "XC");
        numberRomanMap.put(400, "CD");
        numberRomanMap.put(900, "CM");

        romanNumberMap.put("I", 1);
        romanNumberMap.put("V", 5);
        romanNumberMap.put("X", 10);
        romanNumberMap.put("L", 50);
        romanNumberMap.put("C", 100);
        romanNumberMap.put("D", 500);
        romanNumberMap.put("M", 1000);
    }

    public String numberToRoman(int i) {
        StringBuilder roman = new StringBuilder();
        ArrayList<Integer> keys = new ArrayList<>(numberRomanMap.keySet());
        Collections.sort(keys);
        Collections.reverse(keys);
        for (int number : keys) {
            while (i >= number) {
                roman.append(numberRomanMap.get(number));
                i -= number;
            }
        }
        return roman.toString();
    }

    public int romanToNumber(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            int current = romanNumberMap.get(number.substring(i, i + 1));
            int next = i < number.length() - 1 ? romanNumberMap.get(number.substring(i + 1, i + 2)) : 0;
            if (current < next) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }
        return result;
    }
}
