package com.ade.thread.practice3;

/**
 * Created by ismeade on 2015/5/20.
 */
public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        thread.start();
    }

}
