/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月1日 下午2:31:35  
 *  
 */  

package com.rongji.io;

import java.io.File;
import java.io.IOException;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月1日 下午2:31:35  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月1日      Eg                      1.0         1.0 Version  
 */

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file=new File("D://1-NetbeansWork//eciq_apps");
		String[] strList=file.list();
		File[] filesList=file.listFiles();
		File[] filesList2=file.listRoots();
		System.out.println("****");
	}
	
	private static boolean getBooleanProperty(String prop,boolean defaultVal) {
		String val=System.getProperty(prop);
		if(val==null)
			return defaultVal;
		if(val.equalsIgnoreCase("true")) {
			return true;
		}else {
			return false;
		}
		
	}
}
