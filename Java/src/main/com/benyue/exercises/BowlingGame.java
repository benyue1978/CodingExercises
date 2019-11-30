package com.benyue.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BowlingGame {
    private int score = 0;

    public BowlingGame(String s) {
        String regex = "(\\S+) (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) (\\S+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        if (m.matches()) {
            for (int i = 1; i <= 10; i++) {
                score += parseFrame(m.group(i));
            }
        }
    }

    private int parseFrame(String frame) {
        if (frame.startsWith("-")) {
            if (frame.endsWith("-")) {
                return 0;
            } else {
                return Integer.parseInt(frame.substring(1, 2));
            }
        } else {
            if (frame.endsWith("-")) {
                return Integer.parseInt(frame.substring(0, 1));
            } else
                return Integer.parseInt(frame.substring(0, 1)) + Integer.parseInt(frame.substring(1, 2));
        }
    }

    public int getScore() {
        return score;
    }
}
