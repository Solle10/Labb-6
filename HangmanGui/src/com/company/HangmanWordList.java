package com.company;

public class HangmanWordList {

    public int getWordCount() {
        return 10;
    }

    public String getWord(int index) {
        return switch (index) {
            case 0 -> "KYH";
            case 1 -> "COMPUTER";
            case 2 -> "IOTDEVELOPER";
            case 3 -> "ABSTRACT";
            case 4 -> "INTERFACE";
            case 5 -> "SCRUM";
            case 6 -> "AGILE";
            case 7 -> "FOOTBALL";
            case 8 -> "MOVIE";
            case 9 -> "FUNNY";
            default -> new String("Illegal index");
        };
    }
}
