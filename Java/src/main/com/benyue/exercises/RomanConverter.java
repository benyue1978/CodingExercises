package com.benyue.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RomanConverter {
    HashMap<Integer, String> numberNumeralMap = new HashMap<>();

    public RomanConverter() {
        numberNumeralMap.put(1, "I");
        numberNumeralMap.put(5, "V");
        numberNumeralMap.put(10, "X");
        numberNumeralMap.put(50, "L");
        numberNumeralMap.put(100, "C");
        numberNumeralMap.put(500, "D");
        numberNumeralMap.put(1000, "M");
        numberNumeralMap.put(4, "IV");
    }

    public String toRoman(int i) {
        StringBuilder roman = new StringBuilder();
        ArrayList<Integer> keys = new ArrayList<>(numberNumeralMap.keySet());
        Collections.sort(keys);
        Collections.reverse(keys);
        for (int number : keys) {
            while (i >= number) {
                roman.append(numberNumeralMap.get(number));
                i -= number;
            }
        }
        return roman.toString();
    }
}
