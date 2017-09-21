/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年7月5日 上午10:56:39  
 *  
 */  

package com.rongji.util.concurrent;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年7月5日 上午10:56:39  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月5日      Eg                      1.0         1.0 Version  
 */

public interface RunnableFuture<V> extends Runnable,Future<V> {

	void run();
}
