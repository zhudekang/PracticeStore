package com.cn.example;

import java.util.Scanner;

public class CheckLogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入登陆用户名:");
		String username = scan.nextLine();
		System.out.println("请输入登陆密码:");
		String passward = scan.nextLine();
		if (!username.equals("root")) {
			System.out.println("用户名非法");
		} else if (!passward.equals("root")) {
			System.out.println("密码不对");
		} else {
			System.out.println("登陆成功");
		}
	}
}
