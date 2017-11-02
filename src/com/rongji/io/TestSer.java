/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      ���и�  
 * @version:     1.0
 * Createdate:   2017��5��16�� ����5:49:36  
 *  
 */  

package com.rongji.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.rongji.entity.Person;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     ���и�  
 * @version:    1.0  
 * Create at:   2017��5��16�� ����5:49:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017��5��16��      ���и�                      1.0         1.0 Version  
 */

public class TestSer {

	@Test
	public void test(){
		Person p1=null;
		try {
			p1 = Person.class.newInstance();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		p1.setAddress("����");
		p1.setAge(12);
		p1.setFirstName("Michael");
		p1.setLastName("Anderson");

		Person p2=new Person("Kobe", "Bryant", 11, "2", p1);
		
		try {
			FileOutputStream fos=new FileOutputStream("Serout.abc");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p2);
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
			
		}
		
		Person person=null;
		try {
			FileInputStream fis=new FileInputStream("Serout.abc");
			ObjectInputStream ois=new ObjectInputStream(fis);
			person=(Person)ois.readObject();
			ois.close();
			
		} catch (Exception e) {
			
		}
		
		System.out.println("person: "+person);
		int[] a={1,2,3};
		int[][] a1=new int[2][5];
	}
	
	
	@Test
	public void getSystem() throws Exception{
		System.out.println("java.version: "+System.getProperty("java.version"));
		System.out.println("java.vendor: "+System.getProperty("java.vendor"));
		System.out.println("java.vendor.url: "+System.getProperty("java.vendor.url"));
		System.out.println("java.home: "+System.getProperty("java.home"));
		System.out.println("java.vm.specification.version: "+System.getProperty("java.vm.specification.version"));
		System.out.println("java.vm.specification.vendor: "+System.getProperty("java.vm.specification.vendor"));
		System.out.println("java.vm.specification.name: "+System.getProperty("java.vm.specification.name"));
		System.out.println("java.vm.version: "+System.getProperty("java.vm.version"));
		System.out.println("java.vm.vendor: "+System.getProperty("java.vm.vendor"));
		System.out.println("java.vm.name: "+System.getProperty("java.vm.name"));
		System.out.println("java.specification.version: "+System.getProperty("java.specification.version"));
		System.out.println("java.specification.vendor: "+System.getProperty("java.specification.vendor"));
		System.out.println("java.specification.name: "+System.getProperty("java.specification.name"));
		System.out.println("java.class.version: "+System.getProperty("java.class.version"));
		System.out.println("java.class.path: "+System.getProperty("java.class.path"));
		System.out.println("java.library.path: "+System.getProperty("java.library.path"));
		System.out.println("java.io.tmpdir: "+System.getProperty("java.io.tmpdir"));
		System.out.println("java.compiler: "+System.getProperty("java.compiler"));
		System.out.println("java.ext.dirs: "+System.getProperty("java.ext.dirs"));
		System.out.println("os.name: "+System.getProperty("os.name"));
		System.out.println("os.arch: "+System.getProperty("os.arch"));
		System.out.println("os.version: "+System.getProperty("os.version"));
		System.out.println("file.separator: "+System.getProperty("file.separator"));
		System.out.println("path.separator: "+System.getProperty("path.separator"));
		System.out.println("line.separator: "+System.getProperty("line.separator"));
		System.out.println("user.name: "+System.getProperty("user.name"));
		System.out.println("user.home: "+System.getProperty("user.home"));
		System.out.println("user.dir: "+System.getProperty("user.dir"));
		System.out.println("getProperties(): "+System.getProperties());
		System.out.println("**********************************\n");
		System.out.println(System.currentTimeMillis());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
		System.out.println(System.nanoTime());
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(System.nanoTime()));
		System.out.println(SimpleDateFormat.class.newInstance().format(new Date()));
		
		
	}
	
	@Before
	public void getBefore(){
		System.out.println("Test ��ʼ............");
	}
	
	@After
	public void getAfter(){
		System.out.println("Test ����............");
	}
	
	@Test
	public void getProperies() throws Exception{
		System.out.println(Properties.class.newInstance().getProperty("user.dir"));
		
		
	}
	
	



}
