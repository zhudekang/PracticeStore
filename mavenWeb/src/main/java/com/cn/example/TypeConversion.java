package com.cn.example;

public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		char c = 'W';
		short s = 23561;
		int i = 3333;
		long l = 400000L;
		float f = 3.14159F;
		double d = 54.523;
		//低类型向高类型自动转换
		System.out.println("累加byte等于:" + b);
		System.out.println("累加char等于:" + (b+c));
		System.out.println("累加short等于:" + (b+c+s));
		System.out.println("累加int等于:" + (b+c+s+i) );
		System.out.println("累加long等于:" + (b+c+s+i+l));
		System.out.println("累加float等于" + (b+c+s+i+l+f));
		System.out.println("累加double等于:" + (b+c+s+i+l+f+d));
		//高类型向低类型的强制转换
		System.out.println("把long强制类型转换为int-----" + (int)l);
		//高类型低类型转换会丢失数据
		System.out.println("	把int强制类型转换short------" + (short)l);
		//实数向整数转换将舍弃小数部分
		System.out.println("把double强制转换为int-----" + (int)d);
		//整数到字符类型的转换将获取对应编码的字符
		System.out.println("把short类型强制转换为char类型----" + (char)s);
	}
}
