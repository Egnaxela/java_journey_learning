package com.rongji.algorithm;

import java.util.Arrays;

public class LeetCode {

	public static void main(String[] args) {

		System.out.println(judgeCircle("UUDDLLRR"));
		System.out.println(judgeCircle("UUUURRRRDDDDLLLL"));
		System.out.println(reverse("asdfghjkl"));
		System.out.println(reverse2("asdfghjkl"));
	}

	public static String reverse2(String s) {
		  char[] ch = s.toCharArray();
	        int halfLength = s.length() / 2;
	        char temp;
	        for (int i = 0; i < halfLength; i++) {
	            temp = ch[s.length() - 1 - i];
	            ch[s.length() - 1 - i] = ch[i];
	            ch[i] = temp;
	        }
	        return new String(ch);
	}
	public static String reverse(String s) {
		int length=s.length();
		char[] arr=new char[length];
		for(int i=0;i<length;i++) {
			arr[length-1-i]=s.charAt(i);
		}
		return new String(arr);
	}
	public static Boolean judgeCircle(String moves) {
		
		int x=0,y=0,length=moves.length();
		for (int i = 0; i <length; i++) {
			char index=moves.charAt(i);
			if(index=='L') {
				x-=1;
			}else if(index=='R'){
				x+=1;
			}else if(index=='U'){
				y+=1;
			}else  {
				y-=1;
			}
		}
		if (x == 0 && y == 0) {
			return true;
		}
		return false;
	}
}
