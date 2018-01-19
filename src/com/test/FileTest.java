/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月26日 下午5:01:11  
 *  
 */  

package com.test;

import java.io.File;
import java.io.IOException;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月26日 下午5:01:11  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月26日      Eg                      1.0         1.0 Version  
 */

public class FileTest {
	public static void main(String[] args) throws IOException {
		
		File file=new File(System.getProperty("user.dir"), "bootstrap.jar");
		if(file.exists()) {
			System.out.println("***exist: "+file.getPath());
		}else {
			file.createNewFile();
		}
		System.out.println("exist: "+file.getPath());
		
	}
	
}
