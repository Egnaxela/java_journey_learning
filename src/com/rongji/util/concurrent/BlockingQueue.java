/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年7月4日 下午6:03:28  
 *  
 */  

package com.rongji.util.concurrent;

import java.util.Queue;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年7月4日 下午6:03:28  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月4日      Eg                      1.0         1.0 Version  
 */

public interface BlockingQueue<E> extends Queue<E> {
	
	boolean add(E e);

	boolean offer(E e);
	
	void put(E e) throws InterruptedException;
	
	boolean offer(E e,long timeout,TimeUnit unit) throws InterruptedException;
}
