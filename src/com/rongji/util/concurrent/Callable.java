/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年7月4日 下午5:07:42  
 *  
 */  

package com.rongji.util.concurrent;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年7月4日 下午5:07:42  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月4日      Eg                      1.0         1.0 Version  
 */

/**
 * 返回结果并且抛出可能异常的任务
 * 与<code>Runnable</code>,但Runnable不会返回结果,无法抛出经过检查的异常
 */
public interface Callable<V> {
	
	/**
	 * 
	* <p>描述:计算结果若无法计算结果则抛出一个异常</p>
	* @return
	* @throws Exception
	* @author Eg
	 */
	V call() throws Exception;
}
