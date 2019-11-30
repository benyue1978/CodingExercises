package com.benyue.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BowlingGame {
    public static final int SCORE_TEN = 10;
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
        int firstRoll = stringToScore(frame.substring(0, 1));
        int secondRoll = 0;
        int thirdRoll = 0;
        if (frame.length() == 3) {
            thirdRoll = stringToScore(frame.substring(2, 3));
        }
        if (frame.length() >= 2) {
            if (frame.substring(1, 2).equals("/")) {
                secondRoll = SCORE_TEN - firstRoll;
            } else {
                secondRoll = stringToScore(frame.substring(1, 2));
            }
        }

        frameScore = getFrameScore(firstRoll, secondRoll);
        frameScore += thirdRoll;

        if (frame.equals("x")) {
            nextRollDouble = 1 + nextNextRollDouble;
            nextNextRollDouble = 2;
        } else if (frame.substring(1, 2).equals("/")) {
            nextRollDouble = 2;
            nextNextRollDouble = 1;
        } else {
            nextRollDouble = 1;
            nextNextRollDouble = 1;
        }
        return frameScore;
    }

    private int getFrameScore(int firstRoll, int secondRoll) {
        return nextRollDouble * firstRoll + nextNextRollDouble * secondRoll;
    }

    private int stringToScore(String roll) {
        if (roll.equals("x")) {
            return SCORE_TEN;
        }
        return Integer.parseInt(roll);
    }

    public int getScore() {
        return score;
    }
}
