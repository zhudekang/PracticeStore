package com.cn.example;

public class Welcome {

	public static void main(String[] args) {
		String [] greeting = new String [3];
		greeting [0] = "welcome to core java";
		greeting [1] = "by cay horstman";
		greeting [2] = "and gary cornell";
		
		for (String s:greeting) {
			System.out.println(s);
		}
	}
}
