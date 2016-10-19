package com.cn.example;

import java.math.BigDecimal;

public class BigDecimalExample {

	public static void main(String[] args) {
		BigDecimal sum = new BigDecimal(0.0);                   //和
		BigDecimal factorial = new BigDecimal(1.0);           //阶乘项的计算结果
		int i = 1;
		while (i<=20) {                            //循环增量
			sum = sum.add(factorial);     //累加各项阶乘的和
			++ i;
			factorial = factorial.multiply(new BigDecimal(1.0/i));
		}
		
		System.out.println("1 + 1/2! + 1/3! + ... + 1/20!的计算结果为: \n" + sum);
	}
}
