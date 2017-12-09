/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月5日 下午11:26:28  
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
 * Create at:   2017年12月5日 下午11:26:28  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月5日      Eg                      1.0         1.0 Version  
 */

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Egnaxela\\Desktop\\java_io\\mooc");
		File file2=new File("C:"+File.separator+"Users"+File.separator+"Egnaxela"+File.separator+"Desktop"+File.separator+"java_io");
		if(!file.exists()) {
			file.mkdir();
		}
		
		System.out.println(file2.exists()+" "+file2.isDirectory());
		System.out.println(file.exists()+" "+file.isFile());
		
		File file3=new File("C:\\Users\\Egnaxela\\Desktop\\java_io\\日志.txt");
		if(!file3.exists()) {
			file3.createNewFile();
		}
		System.out.println(file3.getName());
		System.out.println(file3.getParent());
		
		File file4=new File("C:\\Userss\\Egnaxelas\\Desktops\\java_ios\\moocs");
		if(!file4.exists()) {
			file4.mkdirs();
		}
		
		System.out.println(file4.getPath());
		
	}
}
