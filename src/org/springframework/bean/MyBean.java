/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月11日 下午7:20:17  
 *  
 */  

package org.springframework.bean;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月11日 下午7:20:17  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月11日      Eg                      1.0         1.0 Version  
 */

public class MyBean {
	private String testStr="str";
	
	public void setTestStr(String testStr) {
		this.testStr=testStr;
	}
	
	public String getTestStr() {
		return testStr;
	}

}
