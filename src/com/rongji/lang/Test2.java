package com.rongji.lang;

public class Test2 {
	public static Test2 t1 = new Test2();
	{
		System.out.println("blockA");
	}

	static {
		System.out.println("blockB");
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		String x="fmn";
		x.toUpperCase();
		String y=x.replace('f','F');
		y=y+"wxy";
		System.out.println(y);
	}
}