/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2020年5月19日 上午11:10:34  
 *  
 */  

package com.interview.tools;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2020年5月19日 上午11:10:34  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2020年5月19日      Pluto       1.0         1.0 Version  
 */

public class CheckCode {
	
	
	public static void main(String[] args) {
		getSha256("F:\\ISO\\kali-linux-2020.2-installer-amd64.iso","SHA-256");
		//getSha256("SHA-1"); 不正确
		getSha256("F:\\ISO\\kali-linux-2020.2-installer-amd64.iso","MD5");
	}
	
	public static void getSha256(String filepath,String algorithm) {
		int buff=10240;
		try {
			RandomAccessFile file=new RandomAccessFile(filepath, "r");
			long starTime =System.currentTimeMillis();
			MessageDigest hashSum=MessageDigest.getInstance(algorithm); //获得对应的算法转换器
			byte[] buffer=new byte[buff];
			byte[] partialHash=null;
			long read=0;
			long offset=file.length();
			int unitsize;
			while(read<offset) {
				unitsize=(int)(((offset-read)>=buff)?buff:(offset-read));
				file.read(buffer,0,unitsize);
				hashSum.update(buffer,0,unitsize);
				read+=unitsize;
			}
			
			file.close();
			partialHash=new byte[hashSum.getDigestLength()];
			partialHash=hashSum.digest();
			long endTime=System.currentTimeMillis();
			System.out.println((new BigInteger(1,partialHash)).toString(16));//转换为16进制
			System.out.println(endTime-starTime+"\n");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 将字节码转换为16进制
	* <p>描述:</p>
	* @param b
	* @return
	* @author Pluto
	 */
	public static String toHexString(byte b[]) {
		StringBuilder sb=new StringBuilder();
		for(byte ab:b) {
			sb.append(Integer.toHexString(ab&0xFF));
		}
		return sb.toString();
	}

}
