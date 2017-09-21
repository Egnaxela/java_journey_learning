/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年7月5日 上午11:01:08  
 *  
 */  

package com.rongji.util.concurrent;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年7月5日 上午11:01:08  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月5日      吴有根                      1.0         1.0 Version  
 */

public class ExecutionException extends Exception{

	private static final long serialVersionUID = -1358490619660777473L;
	
	protected ExecutionException() {
		
	}
	
	protected ExecutionException(String mString) {
		super(mString);
	}

	public ExecutionException(String message,Throwable cause){
		super(message,cause);
	}
	
	public ExecutionException(Throwable cause){
		super(cause);
	}
}
