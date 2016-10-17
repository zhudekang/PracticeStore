package com.cn.example;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("新员工姓名:");
		String name = scan.nextLine();
		System.out.println("编程语言:");
		String language = scan.nextLine();
		//根据编程语言确定员工分配的部门
				switch (language) {
					case "java":     
						System.out.println("员工" + name + "被分配到java程序开发部门");
					    break;
					case "C#":
						 System.out.println("员工" + name + "被分配到C#项目维护组");
						 break;
					case "Asp.net":
						System.out.println("员工" + name + "被分配到Asp.net程序测试部门");
						break;
					default:
						System.out.println("本公司不需要" + language + "语言的程序开发人员" );
				}
				System.out.println(language + "的哈希值" + language.hashCode());;
	}
}
