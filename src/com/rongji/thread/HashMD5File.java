package com.rongji.thread;

import java.io.*;   
import java.security.*;
import java.util.Base64;   
/**
 * 
* <p>Title: HashMD5File</p>
* <p>Description: 对文件进行md5加密认证、sha1、sha256等认证�??</p>
* <p>Company: 榕基软件股份有限公司</p> 
* @author：YAOSY
* @date�?2009-9-22
 */
public class HashMD5File {   
    public static char[] hexChar = {'0', '1', '2', '3',   
                                   '4', '5', '6', '7',   
                                   '8', '9', 'a', 'b',   
                                   'c', 'd', 'e', 'f'};  
    
    public static void main(String[] args) {
    	String salt="sadkfjalsdjfalksj23423^&*^&%&!EBJKH#e™£4";
    	String userCode="1100000036";
    	String base=userCode+"/"+salt;
		System.out.println(getStringMD5(base));
	}

    public static String getHash(String fileName, String hashType) throws  
            Exception {   
        InputStream fis;   
        fis = new FileInputStream(fileName);   
        byte[] buffer = new byte[1024];   
        MessageDigest md5 = MessageDigest.getInstance(hashType);   
        int numRead = 0;   
        while ((numRead = fis.read(buffer)) > 0) {   
            md5.update(buffer, 0, numRead);   
        }   
        fis.close();   
        return toHexString(md5.digest());   
    }   
    
    /**
     * 
    * <p>Title: MD5</p>
    * <p>Description:对字符串进行md5码验�? </p>
    * @param s
    * @return
    * @author 榕基软件股份有限公司 深圳分公�? 研发�?:YAOSY
    * @version date：Oct 29, 2009 2:21:20 PM
     */
    public static String getStringMD5(String s) {
		try {
			byte[] strTemp = s.getBytes("UTF-8");
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			return stringTobase64(md);
		} catch (Exception e) {
			return null;
		}
	}
    
    /**
	 * 进行base64编码
	 * 
	 * @param s
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String stringTobase64(byte[] s) throws UnsupportedEncodingException {
//		sun.misc.BASE64Encoder en = new sun.misc.BASE64Encoder();
//		String encodeStr = en.encode(s);
//		return encodeStr;
		return null;
	}
  
    public static String toHexString(byte[] b) {   
        StringBuilder sb = new StringBuilder(b.length * 2);   
        for (int i = 0; i < b.length; i++) {   
            sb.append(hexChar[(b[i] & 0xf0) >>> 4]);   
            sb.append(hexChar[b[i] & 0x0f]);   
        }   
        return sb.toString();   
    }   
    

}  
