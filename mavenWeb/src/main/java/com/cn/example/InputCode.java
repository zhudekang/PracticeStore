package com.cn.example;

import java.util.Scanner;

public class InputCode {

	public static void main(String[] args) {
		Scanner scanner	= new Scanner(System.in);
		System.out.println("请输入你的身份证号?");
		String line = scanner.nextLine();
		System.out.println("你输入的身份证号为:"+line);
	}
}
