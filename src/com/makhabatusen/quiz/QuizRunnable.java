package com.makhabatusen.quiz;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class QuizRunnable implements Runnable {

    private final ArrayList<String> quizQuestion;
    private final ArrayList<String> quizAnswers;

    public QuizRunnable(ArrayList<String> quizQuestion, ArrayList<String> quizAnswers) {
        this.quizQuestion = quizQuestion;
        this.quizAnswers = quizAnswers;
    }

    @Override
    public void run() {
        synchronized (quizQuestion) {
            System.out.println("Questions from Runnable: " +
                    "\nPlease name the capitals of countries below: ");
            for (int i = 5; i < 10; i++) {
                System.out.println( "Country: "+ quizQuestion.get(i));
                try {
                    sleep(3000);
                    System.out.println("Capital: "+quizAnswers.get(i));
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
