/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年1月10日 上午10:59:23  
 *  
 */  

package com.util.concurrent;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

import sun.misc.Unsafe;


/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年1月10日 上午10:59:23  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年1月10日      Eg                      1.0         1.0 Version  
 */

public class AtomicIntegerTest {
	public AtomicInteger total;
	public static void main(String[] args) throws InterruptedException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		AtomicIntegerTest test=new AtomicIntegerTest();
		test.total=new AtomicInteger(0);
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<5_000;i++) {
					test.total.incrementAndGet();
				}
			}
		};
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<5_000;i++) {
					test.total.getAndIncrement();
				}
			}
		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("total: "+test.total);
		System.out.println("total: "+test.total.get());
		
		Field field=Unsafe.class.getDeclaredField("theUnsafe");
		field.setAccessible(true);
		Unsafe unsafe=(Unsafe)field.get(null);
		System.out.println("addressSize:"+unsafe.addressSize());
		System.out.println("pageSize:"+unsafe.pageSize());
		System.out.println(unsafe);
		System.out.println(unsafe.getClass().getClassLoader());
	}
	
	@Test
    public void testAll() throws InterruptedException{
        final AtomicInteger value = new AtomicInteger(10);
        assertEquals(value.compareAndSet(1, 2), false);
        assertEquals(value.get(), 10);
        assertTrue(value.compareAndSet(10, 3));
        assertEquals(value.get(), 3);
        value.set(0);
        //
        assertEquals(value.incrementAndGet(), 1);
        assertEquals(value.getAndAdd(2),1);
        assertEquals(value.getAndSet(5),3);
        assertEquals(value.get(),5);
        //
        final int threadSize = 10;
        Thread[] ts = new Thread[threadSize];
        for (int i = 0; i < threadSize; i++) {
            ts[i] = new Thread() {
                public void run() {
                    value.incrementAndGet();
                }
            };
        }
        //
        for(Thread t:ts) {
            t.start();
        }
        for(Thread t:ts) {
            t.join();
        }
        //
        assertEquals(value.get(), 5+threadSize);
    }

}
