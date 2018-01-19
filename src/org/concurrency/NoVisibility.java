/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年1月17日 下午5:46:34  
 *  
 */  

package org.concurrency;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年1月17日 下午5:46:34  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年1月17日      Eg                      1.0         1.0 Version  
 */

public class NoVisibility {
	private static boolean ready;
	private static int number;
	
	private static class ReadThread extends Thread{
		@Override
		public void run() {
			while(!ready) {
				Thread.yield();
			}
			System.out.println("number:"+number);
		}
	}
	
	public static void main(String[] args) {
		new ReadThread().start();
		number=42;
		ready=true;
	}
}
