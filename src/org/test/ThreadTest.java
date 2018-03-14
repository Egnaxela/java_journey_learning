/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月14日 下午4:18:59  
 *  
 */  

package org.test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月14日 下午4:18:59  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月14日      Eg                      1.0         1.0 Version  
 */

@SuppressWarnings("unused")
public class ThreadTest {
	public static void main(String[] args) {
		NEW();
		RUNNABLE();
		//BLOCKED();
		//WAITING();
		//TIMED_WAITING();
		//TERMINATED();
	}
	
	private static void NEW() {
		Thread t=new Thread();
		t.setName("t");
		System.out.println(t.getName()+" "+t.getState());
	}

	private static void RUNNABLE() {
		Thread t=new Thread();
		t.setName("t");
		t.start();
		System.out.println(t.getName()+" "+t.getState());
	}
	
	private static void BLOCKED() {
		final Object lock = new Object();
		Runnable run = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					synchronized (lock) {
						System.out.println(i);
					}
				}
			}
		};

		Thread t1 = new Thread(run);
		t1.setName("t1");
		Thread t2 = new Thread(run);
		t2.setName("t2");

		t1.start();
		t2.start();
	}

	private static void WAITING() {
        final Object lock = new Object();
        Thread t1 = new Thread(){
             @Override
             public void run() {
                 int i = 0;
                 while(true){
                      synchronized (lock) {
                          try {
                              lock.wait();
                         } catch (InterruptedException e) {
                         }
                         System.out.println(i++);
                     }
                }
            }
        };
        
        Thread t2 = new Thread(){
             @Override
             public void run() {
                 while(true){
                      synchronized (lock) {
                          for(int i = 0; i< Integer.MAX_VALUE; i++){
                             System.out.println(i);
                         }
                         lock.notifyAll();
                     }
                }
            }
        };
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
   }
	
	private static void TIMED_WAITING() {

        final Object lock = new Object();
        Thread t1 = new Thread(){
             @Override
             public void run() {
                 int i = 0;
                 while(true){
                      synchronized (lock) {
                          try {
                              lock.wait(60*1000);
                         } catch (InterruptedException e) {
                         }
                         System.out.println(i++);
                     }
                }
            }
        };
        
        Thread t2 = new Thread(){
             @Override
             public void run() {
                 while(true){
                      synchronized (lock) {
                          for(int i = 0; i< Integer.MAX_VALUE; i++){
                             System.out.println(i);
                         }
                         lock.notifyAll();
                     }
                }
            }
        };
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
	}
	
	private static void TERMINATED() {
		Thread t1=new Thread();
		t1.setName("t1");
		t1.start();
		System.out.println(t1.getName()+" "+t1.getState());
		try {
			Thread.sleep(6*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t1.getName()+" "+t1.getState());
	}
}
