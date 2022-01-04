package com.makhabatusen.printer;

public class Printer {

    public void printing(int copies, String fileName) throws InterruptedException {
        for (int i = 1; i <= copies ; i++) {
            System.out.printf("Copy %d of %s\n", i,fileName);
            Thread.sleep(1000);
        }
        System.out.println("__________");
    }
}
