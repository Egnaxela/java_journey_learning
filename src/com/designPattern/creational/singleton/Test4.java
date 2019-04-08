/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月28日 下午5:25:15  
 *  
 */  

package com.designPattern.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月28日 下午5:25:15  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月28日      Pluto       1.0         1.0 Version  
 */

public class Test4 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, Exception{
		EnumSingleton instance=EnumSingleton.getInstance();
		instance.setData(new Object());
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("enumSingle.file"));
		oos.writeObject(instance);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("enumSingle.file"));
		EnumSingleton instance2=(EnumSingleton) ois.readObject();
		ois.close();
		
//		System.out.println(instance.getData());
//		System.out.println(instance2.getData());
//		System.out.println(instance.getData()==instance2.getData());
		
		
		Constructor constructor=EnumSingleton.class.getDeclaredConstructor(String.class,int.class);
		constructor.setAccessible(true);
		EnumSingleton instance3=(EnumSingleton) constructor.newInstance("Mike",23);
		System.out.println(instance3);
		
	}
}
