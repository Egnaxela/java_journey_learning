/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      ���и�  
 * @version:     1.0
 * Createdate:   2017��5��16�� ����4:07:38  
 *  
 */  

package com.rongji.gson;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rongji.entity.UserInfo;

/**
 * 
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年5月26日 上午10:09:18  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年5月26日      Eg                      1.0         1.0 Version
 */
public class TestGson {

	private UserInfo user=null;
	private Gson gson=new GsonBuilder().create();
	private static final Logger log=Logger.getLogger(TestGson.class);
	
	@Before
	public void initData() throws Exception{
		user=(UserInfo)Class.forName("com.rongji.entity.UserInfo").newInstance();
		user.setAge(12);
		user.setUserName("Michael");
		user.setUserCode("1100000036");
		user.setCompanyCode("110000");
		user.setBusinessOrgCode("110000");
		user.setMoney(34.6);
	}

	/**
	 * 
	* <p>描述:Pojo生成Json</p>
	* @author Eg
	 */
	@Test
	public void test1(){
		Gson gson=new Gson();
		UserInfo info=new UserInfo("001", "Egnaxela", "110000", "3213131", 12, 78.2);
		String json=gson.toJson(info);
		log.info("toJson: "+json);
		
	}
	
	
	/**
	 * 
	* <p>描述:解析json</p>
	* @author Eg
	 */
	@Test
	public void test2(){
		
		UserInfo userInfo=gson.fromJson("{\"userCode\":\"001\",\"User_Name\":\"Egnaxela\",\"companyCode\":\"110000\",\"businessOrgCode\":\"3213131\",\"age\":12,\"money\":78.2}", UserInfo.class);
		log.info("fromJson: "+userInfo.toString());
	}
	
	
	@Test
	public void test3(){
		String array="[\"name\":\"Mike\",\"age\":12]";
		String[] str=gson.fromJson(array, String[].class);
		System.out.println(str);
	}
	
	/**
	 * 
	* <p>描述:基本数据类型的生成</p>
	* @author Eg
	 */
	@Test
	public void test0(){
		Gson gson=new GsonBuilder().create();
		int i=gson.fromJson("100", int.class);
		double d=gson.fromJson("99.99", double.class);
		boolean b=gson.fromJson("true", boolean.class);	
		String str=gson.fromJson("Michael", String.class);
		System.out.println("基础数据类型的生成: ");
		System.out.println(i+" "+d+" "+b+" "+str);
	}
	
	@Test
	public void test20(){
		Gson gson=new GsonBuilder().create();

		String[] s="".split(",");
		System.out.println(s);
	}
	
	
}
