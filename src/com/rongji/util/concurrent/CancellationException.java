/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年7月5日 上午11:09:41  
 *  
 */  

package com.rongji.util.concurrent;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年7月5日 上午11:09:41  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月5日      Eg                      1.0         1.0 Version  
 */

public class CancellationException extends IllegalStateException {
	
	private static final long serialVersionUID = 1629980708474899929L;

	public CancellationException(){
		
	}
	
	public CancellationException(String mString){
		super(mString);
	}
}
