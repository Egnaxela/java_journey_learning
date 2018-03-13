/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月12日 下午6:01:45  
 *  
 */  

package com.google.gson;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月12日 下午6:01:45  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月12日      Eg                      1.0         1.0 Version  
 */

public class GsonTest {
	public static void main(String[] args) throws Exception, JsonIOException, FileNotFoundException {
		String path="E:\\Apache Commons\\chinese-poetry-json\\authors.song.json";
		String path1="E:\\Apache Commons\\chinese-poetry-json\\poet.song.0.json"; 
		JsonArray jsonArray=new JsonParser().parse(ReadyObjectFromFile(path)).getAsJsonArray();
		JsonArray jsonArray1=new JsonParser().parse(ReadyObjectFromFile(path1)).getAsJsonArray();
		Gson gson=new Gson();
		List<Authors> list=new ArrayList<>();
		List<Poet> songlist=new ArrayList<>();
		for(JsonElement jsonElement:jsonArray) {
			Authors authors=gson.fromJson(jsonElement, Authors.class);
			list.add(authors);
		}
		
		for(JsonElement jsonElement:jsonArray1) {
			Poet poet=gson.fromJson(jsonElement, Poet.class);
			songlist.add(poet);
		}
		
		for(Authors author:list) {
			System.out.println(author);
		}
		for(Poet poet:songlist) {
			System.out.println(poet);
		}
		System.out.println("Authors Song Total is "+list.size());
		System.out.println("Poet Song Total is "+songlist.size());
	}
	
	public static String ReadyObjectFromFile(String path) {
    	String lastStr="";
    	try {
			FileInputStream io=new FileInputStream(path);
			InputStreamReader inputStreamReader=new InputStreamReader(io,"UTF-8");
			BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
			String tempString=null;
			while((tempString=bufferedReader.readLine())!=null) {
				lastStr+=tempString;
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return lastStr;
    }
}
