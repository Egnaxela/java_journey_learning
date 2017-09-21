/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年5月16日 下午2:43:48  
 *  
 */  

package com.rongji.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年5月16日 下午2:43:48  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年5月16日      吴有根                      1.0         1.0 Version  
 */

public class TestSerializable {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("temp.out");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		TestObject testObject=new TestObject();
		oos.writeObject(testObject);
		oos.flush();
		oos.close();
		
		FileInputStream fis=new FileInputStream("temp.out");
		ObjectInputStream ois=new ObjectInputStream(fis);
		TestObject testObject2=(TestObject)ois.readObject();
		
		System.out.println(testObject2.testValue);
		System.out.println(testObject2.parentValue);
		System.out.println(testObject2.innerObject.innerValue);
		
		
		ObjectStreamClass o=(ObjectStreamClass)Class.forName("java.io.ObjectStreamClass").newInstance();
	}

}

class Parent implements Serializable{
	private static final long serialVersionUID = -586266431848663108L;
	public int parentValue=100;
}

class InnerObject implements Serializable{
	private static final long serialVersionUID = -7818449626295845447L;
	public int innerValue=200;
}

class TestObject extends Parent implements Serializable{
	private static final long serialVersionUID = -6264676149000930187L;
	public int testValue=300;
	public InnerObject innerObject=new InnerObject();
}