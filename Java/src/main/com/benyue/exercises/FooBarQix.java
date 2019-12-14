package com.benyue.exercises;

public class FooBarQix {
    public String compute(int n) {
        String result = "";

        if (n % 3 == 0) {
            result += "Foo";
        }

        if (n % 5 == 0) {
            result += "Bar";
        }

        if (result.isEmpty()) {
            result = Integer.toString(n);
        }
        return result;
    }
}
