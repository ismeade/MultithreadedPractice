package com.ade.thread.practice7;

import java.util.concurrent.TimeUnit;

/**
 * Created by ismeade on 2015/5/20.
 */
public class Task implements Runnable {

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
