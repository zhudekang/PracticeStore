package com.cn.example;

import org.junit.Test;

public class TestJavaExample {

	/*
	 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，
	 *      假如兔子都不死，问每个月的兔子总数为多少？  
	 */
	
	//   程序分析:兔子规律为序列:1,1,2,3,5,8,13,21,34......
	public static int f(int x){
		if (x == 1 || x == 2) {
			return 1;
		} else {
			return f(x-1) + f(x-2);
		}
	}
	@Test
	public void ex1(){
		int i=0;
		for (i=1; i<=20; i++) {
			System.out.println("第" + i + "月,兔子对数为" +f(i));
		}
	}
	
	/*
	 * 题目：判断101-200之间有多少个素数，并输出所有素数。     
	 */
	
	//程序分析:质数（prime number）又称素数，有无限个。质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数。
	public static boolean f1(int x){
		for (int i=2; i<=x/2; i++) 
			if (x % 2 == 0) 
				return false;
				return true;
	}
	@Test
	public void ex2(){
		int i = 0;
		for (i=2;i<=200;i++) {
			if (f1(i) == true)
				System.out.println(i);
		}
	}
	
	
	
}
