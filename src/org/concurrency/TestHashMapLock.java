/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月1日 下午6:13:54  
 *  
 */  

package org.concurrency;

import java.util.HashMap;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月1日 下午6:13:54  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月1日      Eg                      1.0         1.0 Version  
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class TestHashMapLock {
	
	private HashMap map=new HashMap();
	
	public TestHashMapLock() {
		Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.put(new Integer(i), i);
				}
				System.out.println("t1 is over");
			}
		};
		
		Thread t2=new Thread() {
			
			public void run() {
				for(int i=0;i<50000;i++) {
					map.put(new Integer(i), i);
				}
				System.out.println("t2 is over");
			}
		};
		
		Thread t3=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.put(new Integer(i), i);
				}
				System.out.println("t3 is over");
			}
		};
		Thread t4=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.put(new Integer(i), i);
				}
				System.out.println("t4 is over");
			}
		};
		Thread t5=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.put(new Integer(i), i);
				}
				System.out.println("t5 is over");
			}
		};
		Thread t6=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.get(new Integer(i));
				}
				System.out.println("t6 is over");
			}
		};
		Thread t7=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.get(new Integer(i));
				}
				System.out.println("t7 is over");
			}
		};
		Thread t8=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.get(new Integer(i));
				}
				System.out.println("t8 is over");
			}
		};
		Thread t9=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.get(new Integer(i));
				}
				System.out.println("t9 is over");
			}
		};
		Thread t10=new Thread() {
			public void run() {
				for(int i=0;i<50000;i++) {
					map.get(new Integer(i));
				}
				System.out.println("t10 is over");
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
	
	public static void main(String[] args) {
		
		new TestHashMapLock();
	}
}
