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

package org.concurrency;

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
public class ThreadStatusTest {
	public static void main(String[] args) {
		NEW();
		RUNNABLE();
		//BLOCKED();
		//WAITING();
		//TIMED_WAITING();
		//TERMINATED();
	}
	
	
	/**
	 * 
	* <p>描述:线程处于NEW状态,表示该线程只是被创建还没有启动</p>
	* @author Eg
	 */
	private static void NEW() {
		Thread t=new Thread();
		t.setName("t");
		System.out.println(t.getName()+" "+t.getState());
	}

	/**
	 * 
	* <p>描述:线程处于“RUNNABLE”状态，表示改线程正在JVM中执行，
	* 		但是有可能在等待操作系统的其他的资源，如处理器等
	* </p>
	* @author Eg
	 */
	private static void RUNNABLE() {
		Thread t=new Thread();
		t.setName("t");
		t.start();
		System.out.println(t.getName()+" "+t.getState());
	}
	
	
	/**
	 * 
	* <p>描述:线程受阻塞并在等待监视器锁的回调</p>
	* @author Eg
	 */
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

	/**
	 * 
	* <p>描述:</p>
	* @author Eg
	 */
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
	
	
	/**
	 * 
	* <p>描述:</p>
	* @author Eg
	 */
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
	
	/**
	 * 
	* <p>描述:run方法执行完了线程处于这种状态</p>
	* @author Eg
	 */
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
