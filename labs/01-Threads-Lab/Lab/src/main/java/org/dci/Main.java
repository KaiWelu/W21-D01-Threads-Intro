package org.dci;

public class Main {
    public static void main(String[] args) {

        Thread runnable = new Thread(new RunnableThread());
        runnable.start();

        Thread extended = new Thread(new ExtendedThread());
        extended.start();

        Thread lambdaThread = new Thread(() -> {
            String[] fruits = {"Apple", "Cherry", "Kiwi", "Banana", "Strawberry"};

            for(String fruit: fruits) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Fruit: " + fruit);
            }
        });
        lambdaThread.start();
    }
}