package com.tutor.drawertestojlvb;

public class AnswerList {
    private String number;
    private String theme;
    private String task;
    private String letter;
    private String answer;
    private int rating;

    AnswerList(String number, String theme, String task, String letter, String answer, int rating) {
        this.number = number;
        this.theme = theme;
        this.task = task;
        this.letter = letter;
        this.answer = answer;
        this.rating = rating;
    }

    String getNumber() {
        return number;
    }

    String getTheme() {
        return theme;
    }

    String getTask() {
        return task;
    }

    String getLetter() {
        return letter;
    }

    String getAnswer() {
        return answer;
    }

    int getRating() {
        return rating;
    }
}
