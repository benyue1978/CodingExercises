package com.benyue.exercises;

import java.util.HashMap;

class TennisScore {
    String getResult(int benScore, int ritaScore, int advanced) {
        HashMap<Integer, String> score = new HashMap<>();
        score.put(0, "love");
        score.put(15, "fifteen");
        score.put(30, "thirty");
        score.put(40, "forty");
        if (benScore == ritaScore) {
            if (benScore == 40) {
                if (advanced == 1) {
                    return "Ben advanced";
                }
                if (advanced == -1) {
                    return "Rita advanced";
                }
                if (advanced == -2) {
                    return "Rita win";
                }
                if (advanced == 2) {
                    return "Ben win";
                }
                return "deuce";
            }
            return score.get(benScore) + " all";
        }
        return score.get(benScore) + " " + score.get(ritaScore);
    }
}
