package com.benyue.exercises;

public class FooBarQix {
    public String compute(int n) {
        if (n % 3 == 0) {
            return "Foo";
        }
        if (n % 5 == 0) {
            return "Bar";
        }
        return Integer.toString(n);
    }
}
