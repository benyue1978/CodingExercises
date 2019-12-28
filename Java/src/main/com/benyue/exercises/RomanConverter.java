package com.benyue.exercises;

import java.util.HashMap;

public class RomanConverter {
    HashMap<Integer, String> numberNumeralMap = new HashMap<>();

    public RomanConverter() {
        numberNumeralMap.put(1, "I");
        numberNumeralMap.put(2, "II");
        numberNumeralMap.put(5, "V");
        numberNumeralMap.put(10, "X");
        numberNumeralMap.put(50, "L");
        numberNumeralMap.put(100, "C");
        numberNumeralMap.put(500, "D");
        numberNumeralMap.put(1000, "M");
    }

    public String toRoman(int i) {
        return numberNumeralMap.get(i);
    }
}
