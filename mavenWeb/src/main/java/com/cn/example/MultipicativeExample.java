package com.cn.example;

import java.util.Scanner;

public class MultipicativeExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数");
		Long number = scan.nextLong();
		System.out.println("该数字乘以2的结果:" + (number<<1));
		System.out.println("该数字乘以4的结果:" + (number<<2));
		System.out.println("该数字乘以8的结果:" + (number<<3));
		System.out.println("该数字乘以16的结果:" + (number<<4));
	}
}
