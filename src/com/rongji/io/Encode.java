/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 *  
 */  

package com.rongji.io;

import java.io.UnsupportedEncodingException;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017-12-05    Eg                      1.0         1.0 Version  
 */

public class Encode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="北京ABC";//UTF-8 e6 85 95 e8 af be 41 42 43 
		byte[] bytes=str.getBytes();
		for(byte b:bytes) {
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		System.out.println("\n**************************");
		byte[] bytes2=str.getBytes("UTF-8");
		//UTF-8 编码中文占3个字节,英文占1个字节
		for (byte b : bytes2) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		
		System.out.println("\n**************************");
		byte[] bytes3=str.getBytes("GBK");
		//GBK编码中文占2个字节,英文占一个字节
		for (byte b : bytes3) {
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		
		System.out.println("\n**************************");
		byte[] bytes4=str.getBytes("UTF-16be");
		//utf-16be编码中文占2个字节,英文占2个字节
		for (byte b : bytes4) {
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		
		/**
		 * 当字节序列以某种形式编码时,要想把字节序列变成字符串也需要使用对应的编码否则会出现乱码
		 */
		String str2=new String(bytes4);
		System.out.println("\n"+str2);
		
		String str3=new String(bytes4,"utf-16be");
		System.out.println(str3);
	}
}
