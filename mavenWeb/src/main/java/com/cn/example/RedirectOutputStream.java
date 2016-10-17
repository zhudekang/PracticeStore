package com.cn.example;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {

	public static void main(String[] args) {
		PrintStream  out = System.out;   //保存原输出流
		try {
			PrintStream ps = new PrintStream("./log.txt");  //创建文件输出流  
			System.setOut(ps);                                                 //设置新的输出流
			int age = 18;   //定义整型变量
			System.out.println("年龄变量定义成功,初始值为18");
			String sex = "女";
			System.out.println("性别变量成功定义,初始值为女");
			//整合两个变量
			String info = "这是个" + sex + "孩子,现在" +age + "岁了";
			System.out.println("整合两个变量为info字符串变量" + info);
			System.setOut(out);
			System.out.println("程序运行完毕,请查看日志文件.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
