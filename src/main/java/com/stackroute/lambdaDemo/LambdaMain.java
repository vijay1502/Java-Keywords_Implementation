package com.stackroute.lambdaDemo;

public class LambdaMain {
    public static void main(String[] args) {
        //Traditional Way
        new Thread(new RunnableDemo()).start();
        //By anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        });
        //By Lambda Expression
        new Thread(() -> {
            System.out.println("Lambda");
            System.out.println("Another Lambda");
            System.out.println("Lambda2");
        }
        ).start();
    }


}
