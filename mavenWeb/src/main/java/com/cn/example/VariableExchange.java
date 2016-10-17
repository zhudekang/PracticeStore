package com.cn.example;

import java.util.Scanner;

public class VariableExchange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入变量A");
		long A = scan.nextLong();
		System.out.println("请输入变量B");
		long B = scan.nextLong();
		System.out.println("A=" + A + "\tB=" +B);
		System.out.println("执行变量互换......");
		A = A^B;
		B = B^A;
		A = A^B;
		System.out.println("A=" + A + "\tB=" +B);
	}
}
