/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年7月4日 下午4:42:47  
 *  
 */  

package com.rongji.util.concurrent;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年7月4日 下午4:42:47  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月4日      吴有根                      1.0         1.0 Version  
 */

/**
 * 表示异步计算的结果
 */
public interface Future<V> {
	
	/**
	 * 
	* <p>描述:试图取消对此任务的执行。如果任务已完成、或已取消，或者由于某些其他原因而无法取消，则此尝试将失败。</p>
	* @param mayInterruptIfRunning
	* @return
	* @author 吴有根
	 */
	boolean cancel(boolean mayInterruptIfRunning);
	
	/**
	 * 
	* <p>描述:任务正常完成前将其取消，返回true</p>
	* @return
	* @author 吴有根
	 */
	boolean isCancelled();
	
	/**
	 * 
	* <p>描述:任务已完成则返回true</p>
	* 可能由于其正常终止、异常、取消等其他情况
	* @return
	* @author 吴有根
	 */
	boolean isDone();
	
	/**
	 * 
	* <p>描述:等待计算完成获取结果</p>
	* @return
	* @throws InterruptedException
	* @throws ExecutionException
	* @author 吴有根
	 */
	V get() throws InterruptedException,ExecutionException;
	

	/**
	 * 
	* <p>描述:最多为给定的时间之后获取计算结果</p>
	* @param timeout
	* @param unit
	* @return
	* @throws InterruptedException
	* @throws ExecutionException
	* @throws TimeoutException
	* @author 吴有根
	 */
	V get(long timeout,TimeUnit unit) throws InterruptedException,ExecutionException,TimeoutException;
	
	
}
