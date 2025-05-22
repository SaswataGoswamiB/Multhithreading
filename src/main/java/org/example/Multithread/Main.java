package org.example.Multithread;

import org.example.Multithread.Baics.War;
import org.example.Multithread.Baics.world;

public class Main {
    public static void main(String[] args) {
      // Getting the name of the current thread.Hey H
        //System.out.println(Thread.currentThread().getName());
        // Using Thread Class.
        world w = new world();
        w.start();

        //Using Runnable as War class is extending Runnable interface.
        Thread t1 = new Thread(new War());
        System.out.println("War Thread State 1"+t1.getState()); // STATE - NEW
        t1.start();
        System.out.println("War Thread State 2"+t1.getState());//STATE - RUNNABLE
        // Runnable using Lambda.

        Runnable r2 = ()->{
            for(;;){
                System.out.println("Lambda Runnable Thread");
            }
        };

        new Thread(r2);



        //Main Thread
//        for(;;){
//            System.out.println("Main-Thread");
//        }


    }
}