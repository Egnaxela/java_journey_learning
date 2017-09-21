/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年7月4日 下午6:19:32  
 *  
 */  

package com.rongji.util.concurrent.locks;

import java.util.Date;

import com.rongji.util.concurrent.TimeUnit;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年7月4日 下午6:19:32  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月4日      吴有根                      1.0         1.0 Version  
 */

public interface Condition {
	void await() throws InterruptedException;
	
	void awaitUninterruptibly();
	
	long awaitNanos(long nanosTimeout) throws InterruptedException;
	
	boolean await(long time,TimeUnit unit) throws InterruptedException;
	
	boolean awaitUntil(Date deadline) throws InterruptedException;
	
	void signal();
	
	void signalAll();
}
