/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月30日 下午8:42:23  
 *  
 */  

package com.rongji;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.CollectionUtils;

/**  
 * Description: 代码行数统计  
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月30日 下午8:42:23  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月30日      Eg                      1.0         1.0 Version  
 */

public class CodeCounterUtils {
	private static ArrayList<File> filesArray=new ArrayList<File>();
	public static void main(String[] args) {
		//Map<String,List<Integer>> map=parsePath("D://1-NetbeansWork//eciq_apps//src","D://1-NetbeansWork//eciq_commons//src");
		Map<String,List<Integer>> map=parsePath("D://1-NetbeansWork//eciq_apps//src//com","D://1-NetbeansWork//eciq_common//src//com");
		for(Map.Entry<String, List<Integer>> entry:map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println("总文件个数: " + entry.getValue().get(0)); 
	        System.out.println("总空白行数: " + entry.getValue().get(1));  
	        System.out.println("总注释行数: " + entry.getValue().get(2));  
	        System.out.println("总有效代码行数: " + entry.getValue().get(3));  
	        System.out.println("总行数:" + (entry.getValue().get(1) + entry.getValue().get(2) + entry.getValue().get(3)));  
	        System.out.println("统计时间: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		}
	
	}
	
	
	/**
	 * 
	* <p>描述:项目源文件路径</p>
	* @param paths
	* @return
	* @author Eg
	 */
	public static Map<String,List<Integer>> parsePath(String... paths){
		Map<String,List<Integer>> map=new HashMap<String,List<Integer>>();
		if(paths!=null&&paths.length>=1) {
			for(int i=0;i<paths.length;i++) {
				ArrayList<File> fArrayList=getFiles(new File(paths[i]));
				if(!CollectionUtils.isEmpty(fArrayList)) {
					List<Integer> numberList=new ArrayList<Integer>();
					for(File f:fArrayList) {
						if(f.getName().matches(".*\\.java$"));//匹配.java格式的文件
						numberList=count(f);
						System.out.println(f);//打印文件路径
					}
					map.put(paths[i], numberList);
				}
				filesArray.clear();
			}
		}
		return map;
	}
	
	/**
	 * 
	* <p>描述:获取路径及以下所有文件</p>
	* @param file
	* @return
	* @author Eg
	 */
	public static ArrayList<File> getFiles(File file ){//D:\1-NetbeansWork\eciq_apps\src\com
		File[] files=file.listFiles();//获取路径的文件
		for(File child: files) {
			if(child.isDirectory()) {
				getFiles(child);
			}else {
				filesArray.add(child);
			}
		}
		return filesArray;
	}
	
	/**
	 * 
	* <p>描述:统计文件的行数</p>
	* @param f
	* @return
	* @author Eg
	 */
	public static List<Integer> count(File f){
		int files = 0,blankLines=0,commentLines=0,codeLines=0;
		List<Integer> list=new ArrayList<Integer>();
		BufferedReader br=null;
		boolean flag=false;
		
		try {
			br=new BufferedReader(new FileReader(f));
			String line="";
			while((line=br.readLine())!=null) {
				line=line.trim();//除去注释前的空格
				if(line.matches("^[ ]*$")) {//匹配空行
					blankLines++;
				}else if(line.startsWith("//")){//匹配单行注释
					commentLines++;
				}else if(line.startsWith("/*")&&!line.endsWith("*/")) {
					commentLines++;
					flag=true;
				}else if(line.startsWith("/*")&&line.endsWith("*/")) {
					commentLines++;
				}else if(flag==true) {
					commentLines++;
					if(line.endsWith("*/")) {
						flag=false;
					}
				}else {
					codeLines++;
				}
				
				files++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
					br=null;
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		list.add(files);//总文件数
		list.add(blankLines);//空白行数
		list.add(commentLines);//注释行数
		list.add(codeLines);//有效代码行数
		return list;
	}

}
