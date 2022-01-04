package com.makhabatusen.printer;

public class MyThreading2 extends Thread {
    private final Printer printer;

    public MyThreading2(Printer print) {
        this.printer = print;
    }

    @Override
    public void run() {
        synchronized (printer) {
            try {
                printer.printing(3, "Meetings");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
