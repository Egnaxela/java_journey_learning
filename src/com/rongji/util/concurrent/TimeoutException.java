/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年7月5日 上午11:06:23  
 *  
 */  

package com.rongji.util.concurrent;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年7月5日 上午11:06:23  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月5日      Eg                      1.0         1.0 Version  
 */

public class TimeoutException extends Exception{

	private static final long serialVersionUID = -8364674800745669931L;
	
	public TimeoutException(){
		
	}

	public TimeoutException(String mString){
		super(mString);
	}
}
