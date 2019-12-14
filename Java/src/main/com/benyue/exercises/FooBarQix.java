package com.benyue.exercises;

public class FooBarQix {

    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    public String compute(int n) {
        String result = "";

        if (n % 3 == 0) {
            result += FOO;
        }

        if (n % 5 == 0) {
            result += BAR;
        }

        if (n % 7 == 0) {
            result += QIX;
        }

        String s = Integer.toString(n);
        if (s.contains("3")) {
            result += FOO;
        }
        if (s.contains("5")) {
            result += BAR;
        }
        if (s.contains("7")) {
            result += QIX;
        }

        if (result.isEmpty()) {
            result = s;
        }
        return result;
    }
}
