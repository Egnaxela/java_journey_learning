package com.rongji.thread;

import java.lang.reflect.Field;

public class TestReflection implements Runnable {

	private Integer number;
	public TestReflection(int number){
		this.number=number;
	}
	
	//实现run()方法，这是我们创建的线程执行指令
	@Override
	public void run(){
		for(int i=1;i<10;i++){
			System.out.printf("%s:%d*%d=%d\n",Thread.currentThread().getName(),number,i,i*number);
			System.out.println("priority: "+Thread.currentThread().getPriority());
			System.out.println("state: "+Thread.currentThread().getState());
		}
	}
	
	public static void main(String[] args) throws Exception, Throwable {
//		for(int i=1;i<10;i++){
//			TestReflection reflection=new TestReflection(i);
//			Thread thread=new Thread(reflection);
//			thread.start();
//			
//		}
		
		System.out.println("main:"+Thread.currentThread().getName());
		
        Class cache = Integer.class.getDeclaredClasses()[0];

        Field c = cache.getDeclaredField("cache");

        c.setAccessible(true);

        Integer[] array = (Integer[]) c.get(cache);

        array[132] = array[133];

        System.out.printf("%s=%d","(2+2)",2 + 2);
        
        String s="中国1929";
       // s.value
        		
	}

}
