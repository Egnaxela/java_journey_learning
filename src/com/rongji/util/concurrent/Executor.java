/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年6月30日 下午5:18:56  
 *  
 */  

package com.rongji.util.concurrent;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年6月30日 下午5:18:56  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月30日      吴有根                      1.0         1.0 Version  
 */

public interface Executor {
	
	/**
	 * 
	* <p>描述:执行已提交的Runnable任务对象</p>
	* 此接口提供一种将任务提交与每个任务将如何运行的机制(包括线程使用的细节、调度等)分离开的方法
	* @param command
	* @author 吴有根
	 */
	void execute(Runnable command);
}
