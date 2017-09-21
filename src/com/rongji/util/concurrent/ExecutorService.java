/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年6月30日 下午5:26:03  
 *  
 */  

package com.rongji.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年6月30日 下午5:26:03  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月30日      吴有根                      1.0         1.0 Version  
 */

public interface ExecutorService extends Executor{

	/**
	 * 
	* <p>描述:终止前允许执行以前提交的任务</p>
	* @author 吴有根
	 */
	void shutdown();
	
	/**
	 * 
	* <p>描述:将阻止等待任务的启动并试图停止正在执行的任务</p>
	* @return
	* @author 吴有根
	 */
	List<Runnable> shutdownNow();
	
	/**
	 * 
	* <p>描述:此执行程序若关闭返回true</p>
	* @return
	* @author 吴有根
	 */
	boolean isShutdown();
	
	/**
	 * 
	* <p>描述:完成关闭所有任务后返回true</p>
	* 除非先调用shutdown()或shutdownNow()方法，否则则返回值永远不可能为true
	* @return
	* @author 吴有根
	 */
	boolean isTerminated();
	
	
	/**
	 * 
	* <p>描述:请求关闭、发生超时或者线程中断，无论哪个先发生都将导致阻塞，直到所有任务完成</p>
	* @param timeout
	* @param unit
	* @return
	* @throws InterruptedException
	* @author 吴有根
	 */
	boolean awaitTermination(long timeout,TimeUnit unit) throws InterruptedException;
	
	/**
	 * 
	* <p>描述:提交一个返回值的任务用于执行任务，返回一个表示任务未决结果的Future</p>
	* @param task
	* @return
	* @author 吴有根
	 */
	<T> Future<T> submit(Callable<T> task);
	
	/**
	 * 
	* <p>描述:提交一个Runnable任务用于执行,并返回一个表示该任务的Future</p>
	* 该Future的get方法在成功完成时将返回给定的结果
	* @param task
	* @param result
	* @return
	* @author 吴有根
	 */
	<T> Future<T> submit(Runnable task,T result);
	
	/**
	 * 
	* <p>描述:提交一个Runnable任务用于执行,并返回一个表示该任务的Future</p>
	* 该Future的get方法在成功时将返回null
	* @param task
	* @return
	* @author 吴有根
	 */
	Future<?> submit(Runnable task);
	
	/**
	 * 
	* <p>描述:执行给定的任务,当所有任务执行完成时,返回保持任务状态和结果的Future列表</p>
	* @param tasks
	* @return
	* @throws InterruptedException
	* @author 吴有根
	 */
	<T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException;
	
	/**
	 * 
	* <p>描述:执行给定的任务，当所有任务完成或超时期满时（无论哪个首先发生），返回保持任务状态和结果的 Future 列表。
	* 返回列表的所有元素的 Future.isDone() 为 true。
	* 一旦返回后，即取消尚未完成的任务。
	* 注意，可以正常地或通过抛出异常来终止已完成 任务。
	* 如果此操作正在进行时修改了给定的 collection，则此方法的结果是不确定的。 </p>
	* @param tasks
	* @param timeout
	* @param unit
	* @return
	* @throws InterruptedException
	* @author 吴有根
	 */
	<T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks,
			long timeout,TimeUnit unit) throws InterruptedException;
	
	/**
	 * 
	* <p>描述:执行给定的任务，如果某个任务已成功完成（也就是未抛出异常），则返回其结果。
	* 一旦正常或异常返回后，则取消尚未完成的任务。
	* 如果此操作正在进行时修改了给定的 collection，则此方法的结果是不确定的。</p>
	* @param tasks
	* @param timeout
	* @param unit
	* @return
	* @throws InterruptedException
	* @throws ExecutionException
	* @throws TimeoutException
	* @author 吴有根
	 */
	<T> TimeUnit invokeAny(Collection<? extends Callable<T>> tasks,
			long timeout,TimeUnit unit) throws InterruptedException,ExecutionException,TimeoutException;
}
