/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月27日 下午6:19:01  
 *  
 */  

package com.designPattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月27日 下午6:19:01  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月27日      Pluto       1.0         1.0 Version  
 */

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		HungrySingleton instance=HungrySingleton.getInstance();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("singleton_file.file"));
		oos.writeObject(instance);
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("singleton_file.file"));
		HungrySingleton newInstance=(HungrySingleton) ois.readObject();
		System.out.println(instance);
		System.out.println(newInstance);
		System.out.println(instance==newInstance);
		
	}
}
