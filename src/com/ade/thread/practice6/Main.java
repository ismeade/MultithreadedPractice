package com.ade.thread.practice6;

/**
 * Created by ismeade on 2015/5/20.
 */
public class Main {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");

        Task task = new Task();
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(threadGroup, task);
            thread.start();
        }
    }
}
