package com.benyue.exercises;

import java.util.HashMap;

public class RomanConverter {
    HashMap<Integer, String> numberNumeralMap = new HashMap<>();

    public RomanConverter() {
        numberNumeralMap.put(1, "I");
        numberNumeralMap.put(2, "II");
        numberNumeralMap.put(5, "V");
    }

    public String toRoman(int i) {
        return numberNumeralMap.get(i);
    }
}
