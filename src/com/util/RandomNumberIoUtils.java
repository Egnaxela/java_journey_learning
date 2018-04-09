/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月3日 下午12:14:58  
 *  
 */  

package com.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月3日 下午12:14:58  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月3日      Eg                      1.0         1.0 Version  
 */

public class RandomNumberIoUtils {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		System.out.println(RandomNumberIoUtils.class.getClassLoader().getResourceAsStream("numberSort.txt"));
		System.out.println("aaa"+System.getProperty("line.separator"));  
		writeNumber(System.getProperty("user.dir")+"/numberSort.txt");
		System.out.println("finish");
	}
	
	public static void writeNumber(String pathname) throws IOException {
		File file=new File(pathname);
		file.createNewFile();
		FileWriter writer=new FileWriter(file);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<1000000;i++) { //10000000 超过1000万内存溢出 Java heap space
			sb.append((int)(Math.random()*Integer.MAX_VALUE+1)+System.getProperty("line.separator"));
		}
		writer.write(sb.toString());
		writer.flush();
		writer.close();
	}
	
	
	public static void writeNumber(String pathName,String fileName,int[] arr) throws IOException {
		pathName=StringUtils.isEmpty(pathName)?System.getProperty("user.dir"):pathName;
		fileName=StringUtils.isEmpty(fileName)?"numberSort.txt":fileName;
		File file=new File(pathName+"/"+fileName);
		file.createNewFile();
		FileWriter writer=new FileWriter(file);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) { //10000000 超过1000万内存溢出 Java heap space
			sb.append(arr[i]+System.getProperty("line.separator"));
		}
		writer.write(sb.toString());
		writer.flush();
		writer.close();
	}
	
	
	
}
