package com.makhabatusen.quiz;

import com.sun.tools.javac.util.List;
import java.util.ArrayList;
public class MainQuiz {

    public static void main(String[] args) {

        // Task 1

        ArrayList<String> questions = new ArrayList<>(List.of(
                "Australia",
                "Canada",
                "Colombia",
                "Croatia",
                "Estonia",
                "Finland",
                "Maldives",
                "Mongolia",
                "New Zealand",
                "Norway"
        ));
        ArrayList<String> answers = new ArrayList<>(List.of(
                "Canberra",
                "Ottawa",
                "Bogota",
                "Zagreb",
                "Tallinn",
                "Helsinki",
                "Male",
                "Ulaanbaatar",
                "Wellington",
                "Oslo"
        ));

        QuizThread quizThread = new QuizThread(questions, answers);
        quizThread.start();

        System.out.println("__________");

        QuizRunnable quizRunnable = new QuizRunnable(questions, answers);
        Thread thread = new Thread(quizRunnable);
        thread.start();

    }
}


