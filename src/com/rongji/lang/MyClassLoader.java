/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年8月8日 下午6:21:51  
 *  
 */  

package com.rongji.lang;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年8月8日 下午6:21:51  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年8月8日      吴有根                      1.0         1.0 Version  
 */

public class MyClassLoader extends ClassLoader{
	/**
	 * 对于自定义的类加载器如果想要使用双亲委托模式只需要重写findClass()方法即可，
	 * 对于自定义的类加载器如果要不使用双亲委托模式，则需要重写loadClass()方法
	 * 因为loadClass()方法首先会判断该类是否被加载,没有加载过则会加载
	 */
	String name;
	String basePath;
	final String FILETYPE=".class";
	
	public MyClassLoader() {
		
	}
	
	public MyClassLoader(ClassLoader parent) {
		super(parent);
	}
	
	public MyClassLoader(String name) {
		this.name=name;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		File file=getClassFile(name);
		try {
			byte[] bytes=getClassBytes(file);
			Class<?> c=this.defineClass(name, bytes, 0, bytes.length);
			return c;
		} catch (ClassFormatError e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.findClass(name);
	}

	/**
	* <p>描述:</p>
	* @param file
	* @return
	* @author 吴有根
	 * @throws IOException 
	*/
	
	
	private byte[] getClassBytes(File file) throws IOException {
		FileInputStream fis=new FileInputStream(file);
		FileChannel fc=fis.getChannel();
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		WritableByteChannel wbc=Channels.newChannel(baos);
		ByteBuffer by=ByteBuffer.allocate(1024);
		while(true) {
			int i=fc.read(by);
			if(i==0||i==-1) {
				break;
			}
			by.flip();
			wbc.write(by);
			by.clear();
		}
		fis.close();
		return baos.toByteArray();
	}

	/**
	* <p>描述:</p>
	* @param name2
	* @return
	* @author 吴有根
	*/
	private File getClassFile(String classFilePath) {
		//File file=new File("D:/Persion.class");
		File file2=new File("D:/eclipse/workspace/eciq_test/bin/com/rongji/lang/WorldTest.class");
		return file2;
	}
	
}
