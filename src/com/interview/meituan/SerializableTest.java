/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月30日 下午3:48:38  
 *  
 */  

package com.interview.meituan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月30日 下午3:48:38  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月30日      Eg                      1.0         1.0 Version  
 */

public class SerializableTest {

	@Test
	public void writeObjectTest() throws IOException{
		FileOutputStream out=new FileOutputStream("bin.bin");
		ObjectOutputStream objectOutput=new ObjectOutputStream(out);
		User user=new User();
		user.setName("阿尔法");
		objectOutput.writeObject(user);
		objectOutput.flush();
		objectOutput.close();
	} 
	
	
	@Test
	public void readObjectTest() throws IOException, ClassNotFoundException{
		FileInputStream in=new FileInputStream("bin.bin");
		ObjectInputStream objectInputStream=new ObjectInputStream(in);
		User user=(User)objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(user.getName());
		
	}
}

class User implements java.io.Serializable{

	private static final long serialVersionUID = 6021962974777089167L;
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
}
