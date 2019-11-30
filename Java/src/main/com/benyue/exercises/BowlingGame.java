package com.benyue.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BowlingGame {
    private int score = 0;
    private int nextRollDouble = 1;

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
        int frameScore;
        if (frame.equals("--")) {
            frameScore = 0;
            nextRollDouble = 1;
        } else if (frame.startsWith("-")) {
            frameScore = Integer.parseInt(frame.substring(1, 2));
            nextRollDouble = 1;
        } else if (frame.endsWith("-")) {
            frameScore = nextRollDouble * Integer.parseInt(frame.substring(0, 1));
            nextRollDouble = 1;
        } else if (frame.endsWith("/")) {
            frameScore = 10 + Integer.parseInt(frame.substring(0, 1)) * (nextRollDouble - 1);
            nextRollDouble = 2;
        } else if (frame.equals("x")){
            frameScore = nextRollDouble * 10;
            nextRollDouble = 2;
        } else {
            frameScore = nextRollDouble * Integer.parseInt(frame.substring(0, 1)) + Integer.parseInt(frame.substring(1, 2));
            nextRollDouble = 1;
        }
        return frameScore;
    }

    public int getScore() {
        return score;
    }
}
