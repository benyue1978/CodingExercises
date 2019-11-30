package com.benyue.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BowlingGame {
    private int score = 0;
    private int nextRollDouble = 1;
    private int nextNextRollDouble = 1;

    public BowlingGame(String s) {
        s = s.replace("-", "0");
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
        if (frame.endsWith("/")) {
            frameScore = nextRollDouble * Integer.parseInt(frame.substring(0, 1)) + nextNextRollDouble * (10 - Integer.parseInt(frame.substring(0, 1)));
            nextRollDouble = 2;
            nextNextRollDouble = 1;
        } else if (frame.equals("x")){
            frameScore = nextRollDouble * 10;
            nextRollDouble = 2;
            nextNextRollDouble = 2;
        } else {
            frameScore = nextRollDouble * Integer.parseInt(frame.substring(0, 1)) + nextNextRollDouble * Integer.parseInt(frame.substring(1, 2));
            nextRollDouble = 1;
            nextNextRollDouble = 1;
        }
        return frameScore;
    }

    public int getScore() {
        return score;
    }
}
