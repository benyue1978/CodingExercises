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
        result += s.replaceAll("[124689]", "").replaceAll("3", FOO).replaceAll("5", BAR).replaceAll("7", QIX);

        if (result.matches("0*")) {
            result = s;
        }
        return result.replaceAll("0", "*");
    }
}
