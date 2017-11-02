/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年8月2日 上午9:36:49  
 *  
 */  

package com.rongji.net;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年8月2日 上午9:36:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年8月2日      Eg                      1.0         1.0 Version  
 */
@SuppressWarnings("unused")
public class SocketTest {
	
	private String netURL;
	private int port;
	
	
	public SocketTest() {
		super();
	}

	private SocketTest(String netURL, int port) {
		super();
		this.netURL = netURL;
		this.port = port;
	}
	
	private String pocket(String netURL) {
		return "netURL:"+netURL+",port:"+port;
	}
	
	private String pocket2(String netURL,int port) {
		return "netURL:"+netURL+",port:"+port;
	}

}
