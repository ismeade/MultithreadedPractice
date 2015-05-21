package com.ade.thread.practice9;

/**
 * Created by ismeade on 2015/5/21.
 */
public class Main {

    public static void main(String[] args) {
        PricesInfo pricesInfo = new PricesInfo();

        Reader readers[] = new Reader[5];
        Thread threadReader[] = new Thread[5];
        for (int i = 0; i < 5; i++) {
            readers[i] = new Reader(pricesInfo);
            threadReader[i] = new Thread(readers[i]);
        }

        Writer writers = new Writer(pricesInfo);
        Thread threadWriter = new Thread(writers);

        for (int i = 0; i < 5; i++) {
            threadReader[i].start();
        }
        threadWriter.start();

    }

}
