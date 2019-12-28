package com.benyue.exercises;

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
    }

    public String toRoman(int i) {
        if (numberNumeralMap.get(i) != null) {
            return numberNumeralMap.get(i);
        }

        StringBuilder roman = new StringBuilder();

        while (i >= 5) {
            roman.append(numberNumeralMap.get(5));
            i -= 5;
        }
        while (i >= 1) {
            roman.append(numberNumeralMap.get(1));
            i -= 1;
        }
        return roman.toString();
    }
}
