package com.rongji.lang;

import org.junit.Test;

public class AliyunEdu {
	public static void main(String args[]) {
	
	}
	
	@Test
	public void test1(){
		int num=2147483647;
		num+=2L;
		System.out.println(int.class.getClassLoader());
		System.out.println(num);
	}
	
	@Test
	public void test2(){
		int num=2147483647;
		num+=2;
		System.out.println(num);
	}
	
	@Test
	public void test4(){
		boolean flag=10%2==1&&10/3==0&&1/0==0;
		System.out.println(flag?"mldn":"yootk");
	}

	@Test
	public void test5() {
		int sum = 0;
		for (int x = 0; x < 10; x++) {
			sum += x;
			if (x % 3 == 0) {
				break;
			}
		}
		System.out.println(sum);
	}
	
	@Test
	public void test9(){
		int num=50;
		num=num++*2;
		System.out.println(num);
	}
	
	@Test
	public void test10(){
//		long num=100;
//		int x=num+2;
//		System.out.println(x);
	}
	
	@Test
	public void test16(){
		int x=10;
		double y=20.2;
		long z=10L;
		String str=""+x+y*z;
		System.out.println(str);
	}
	
	@Test
	public void test20(){
		int num=68;
		char c=(char)num;
		System.out.println(c);
	}
	
	@Test
	public void testassert(String str){
		assert str!=null:"not null";
	}
	
	@Test
	public void  dotest(){
		testassert("s");
	}
}