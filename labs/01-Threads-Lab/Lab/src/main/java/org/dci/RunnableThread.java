package org.dci;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int i = 1; i < 6; i++) {
            System.out.println("Number: " + i);
        }
    }
}
