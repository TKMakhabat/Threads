package com.makhabatusen.printer;

public class MainPrinter {

    public static void main(String[] args) {

        // Task 2
        Printer printer = new Printer();

        MyThreading myThreading = new MyThreading(printer);
        myThreading.start();

        MyThreading2 myThreading2 = new MyThreading2(printer);
        myThreading2.start();

    }
}
