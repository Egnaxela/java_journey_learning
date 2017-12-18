/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月18日 下午6:07:42  
 *  
 */  

package com.interview;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

import com.rongji.entity.Person;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月18日 下午6:07:42  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月18日      Eg                      1.0         1.0 Version  
 */

public class ReferenceTest {
	private static ReferenceQueue<Person> rq=new ReferenceQueue<>();
	
	public static void checkQueue() {
		Reference<? extends Person> ref=null;
		while((ref=rq.poll())!=null) {
			if(ref!=null) {
				
			}
		}
	}
	
	
	
	
	
	
	
}
