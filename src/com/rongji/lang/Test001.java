package com.rongji.lang;

public class Test001 {
	static int cnt = 6;
	static {
		cnt += 9;
	}

	public static void main(String[] args) {
		System.out.println("cnt =" + cnt);
	}

	static {
		cnt /= 3;
	};
}