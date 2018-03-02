package org.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ThreadModle {
    public static void main(String[] args) throws InterruptedException {
        final Map<String, String> map = new HashMap<String, String>();
         
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Run threadID: " + Thread.currentThread().getId());
                for (int i = 0; i < 10000; i++){
                    new Thread(new Runnable(){
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
                            System.out.println("Run work threadID: " + Thread.currentThread().getId());
                        }
                    }, "test" + i).start();;
                     
                }
            }
             
        });
         
        System.out.println("Main threadID: " + Thread.currentThread().getId());
         
        t.start();
        t.join();
    }
}