/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月15日 下午4:22:40  
 *  
 */  

package org.test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月15日 下午4:22:40  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月15日      Eg          1.0         1.0 Version  
 */

public class ThreadOutPutTest {
	public static void main(String[] args){
		Output output=new Output();
		new Thread() {
			@Override
			public void run() {
				try {
					output.print("ABCDE");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				try {
					output.print("12345");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

}

class Output{
	public void print(String str) throws Exception {
		synchronized (this) {
			for(int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i));
				Thread.sleep(6);
			}
		}
	}
}
