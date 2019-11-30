package com.benyue.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BowlingGame {
    private int score = 0;

    public BowlingGame(String s) {
        String regex = "(\\d)(\\d) (\\d)(\\d) (\\d)(\\d) (\\d)(\\d) (\\d)(\\d) (\\d)(\\d) (\\d)(\\d) (\\d)(\\d) (\\d)(\\d) (\\d)(\\d)";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        if (m.matches()) {
            for (int i = 1; i <= 20; i++) {
                score += Integer.parseInt(m.group(i));
            }
        }
    }

    public int getScore() {
        return score;
    }
}
