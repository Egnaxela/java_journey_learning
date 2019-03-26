/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月26日 下午6:54:33  
 *  
 */  

package com.designPattern.creational.singleton;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月26日 下午6:54:33  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月26日      Pluto       1.0         1.0 Version  
 */

public class Test {

	public static void main(String[] args) {
		//LazySingleton lazySingleton=LazySingleton.getInstance();
        
		Thread t1=new Thread(new T());
		Thread t2=new Thread(new T());
		
		t1.start();
		t2.start();
		
		System.out.println("end");
		
	}


}

class T implements Runnable{

	@Override
	public void run() {
//		LazySingleton lazySingleton=LazySingleton.getInstance();
//		System.out.println(Thread.currentThread().getName()+" "+lazySingleton);		
		
//		LazySingletonDoubleChecked instance=LazySingletonDoubleChecked.getInstance();
//		System.out.println(Thread.currentThread().getName()+" "+instance);		
		
		StaticInnerClassSingleton instance2=StaticInnerClassSingleton.getInstance();
		System.out.println(Thread.currentThread().getName()+" "+instance2);
	}
}


