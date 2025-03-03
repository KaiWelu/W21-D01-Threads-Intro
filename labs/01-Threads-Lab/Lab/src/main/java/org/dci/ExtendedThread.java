package org.dci;

public class ExtendedThread extends Thread{
    @Override
    public void run() {
        String[] letters = {"A","B","C","D","E"};

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (String letter : letters) {
            System.out.println("Letter: " + letter);
        }
    }
}
