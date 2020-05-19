/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2020年5月11日 下午4:07:27  
 *  
 */  

package com.interview.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2020年5月11日 下午4:07:27  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2020年5月11日      Pluto       1.0         1.0 Version  
 */

public class MorseCode {
	
	Map<Character, String> morseCode=new HashMap<Character,String>();
	
	public MorseCode() {
		//常规方法 直接对应注册摩斯码 
        morseCode.put('A', ".-");
        morseCode.put('B', "-...");
        morseCode.put('C', "-.-.");
        morseCode.put('D', "-..");
        morseCode.put('E', ".");
        morseCode.put('F', "..-.");
        morseCode.put('G', "--.");
        morseCode.put('H', "....");
        morseCode.put('I', "..");
        morseCode.put('J', ".---");
        morseCode.put('K', "-.-");
        morseCode.put('L', ".-..");
        morseCode.put('M', "--");
        morseCode.put('N', "-.");
        morseCode.put('O', "---");
        morseCode.put('P', ".--.");
        morseCode.put('Q', "--.-");
        morseCode.put('R', ".-.");
        morseCode.put('S', "...");
        morseCode.put('T', "-");
        morseCode.put('U', "..-");
        morseCode.put('V', "...-");
        morseCode.put('W', ".--");
        morseCode.put('X', "-..-");
        morseCode.put('Y', "-.--");
        morseCode.put('Z', "--..");
        morseCode.put('1', ".----");
        morseCode.put('2', "..---");
        morseCode.put('3', "...--");
        morseCode.put('4', "....-");
        morseCode.put('5', ".....");
        morseCode.put('6', "-....");
        morseCode.put('7', "--...");
        morseCode.put('8', "---..");
        morseCode.put('9', "----.");
        morseCode.put('0', "-----");
        
        morseCode.put(',', "--..--"); 
		morseCode.put('.', ".-.-.-"); 
		morseCode.put('?', "..--.."); 
		morseCode.put('!', "-.-.--"); 
		morseCode.put('\'', ".----.");
		morseCode.put('\"', ".-..-.");
		morseCode.put('=', "-...-"); 	
		morseCode.put(':', "---..."); 
		morseCode.put(';', "-.-.-."); 
		morseCode.put('(', "-.--."); 	
		morseCode.put(')', "-.--.-"); 
		
	}
	
	
	public static void main(String[] args) {
		MorseCode morseCode=new MorseCode();
		MorseCodeConverter morseCodeConverter=new MorseCodeConverter();
		char[] charText=morseCode.init();
		System.out.println(charText);
		System.out.println(morseCode.encryption(charText));
		System.out.println(morseCodeConverter.encode((new String(charText))));
	}
	
	
	/*
	 * 加密方法
	 */
	public String encryption(char[] charText) {
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<charText.length;i++) {
			char temp=charText[i];
			if(morseCode.containsKey(temp)) {
				stringBuffer.append(morseCode.get(temp)).append("/");
			}
		}
		return stringBuffer.toString();
	}
	/**
	 * 
	* <p>描述:初始化转化输入的字符</p>
	* @return
	* @author Pluto
	 */
	public char[] init() {
		System.out.println("请输入:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toUpperCase();
		sc.close();
		return str.toCharArray();
	} 
}
