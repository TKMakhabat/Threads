package com.makhabatusen.printer;

public class MyThreading extends Thread{
    private final Printer printer;

    public MyThreading(Printer print) {
        this.printer = print;
    }

    @Override
    public void run() {
        synchronized (printer) {
            try {
                printer.printing(2, "Schedule");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
