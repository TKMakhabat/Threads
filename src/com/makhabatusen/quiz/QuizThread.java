package com.makhabatusen.quiz;

import java.util.ArrayList;

public class QuizThread extends Thread {
    private final ArrayList<String> quizQuestion;
    private final ArrayList<String> quizAnswers;


    public QuizThread(ArrayList<String> arrayList, ArrayList<String> quizAnswers) {
        this.quizQuestion = arrayList;
        this.quizAnswers = quizAnswers;
    }

    @Override
    public void run() {

        synchronized (quizQuestion) {
            System.out.println("Questions from Thread: " +
                    "\nPlease name the capitals of countries below: ");
            for (int i = 0; i < 5; i++) {
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
