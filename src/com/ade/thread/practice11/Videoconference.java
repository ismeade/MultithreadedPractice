package com.ade.thread.practice11;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 *
 * Created by ismeade on 2015/5/21.
 */
public class Videoconference implements Runnable {

    private final CountDownLatch controller;

    public Videoconference(int number) {
        this.controller = new CountDownLatch(number);
    }

    public void arrive(String name) {
        System.out.printf("%s has arrived.\n",name);
        controller.countDown();
        System.out.printf("VideoConference: Waiting for %d participants.\n", controller.getCount());
    }

    @Override
    public void run () {
        try {
            controller.await();
//            controller.await(100, TimeUnit.SECONDS);
            System.out.printf("VideoConference: All the participants have come\n");
            System.out.printf("VideoConference: Let's start...\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
