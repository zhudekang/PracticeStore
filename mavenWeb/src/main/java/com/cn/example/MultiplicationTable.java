package com.cn.example;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=i; j++) {
				//输出计算结果但不换行
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
