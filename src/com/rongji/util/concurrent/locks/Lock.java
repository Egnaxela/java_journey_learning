/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年7月4日 下午6:16:48  
 *  
 */  

package com.rongji.util.concurrent.locks;

import com.rongji.util.concurrent.TimeUnit;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年7月4日 下午6:16:48  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月4日      Eg                      1.0         1.0 Version  
 */

public interface Lock {

	void lock();

	void unlock();
	
	void lockInterruptibly() throws InterruptedException;
	
	boolean tryLock();
	
	boolean tryLock(long time,TimeUnit unit) throws InterruptedException;
	
	Condition newCondition();
}
