package com.cn.example;

public class ProductPrice {

	public static void main(String[] args) {
		float money = 1206;
		float rebate = 0f;
		if (money > 200) {
			int grade = (int) money/200;
			switch (grade) {
			       case 1:
			    	   rebate = 0.95f;
			    	   break;
			       case 2:
			    	   rebate = 0.90f;
			    	   break;
			       case 3:
			    	   rebate = 0.85f;
			    	   break;
			       case 4:
			    	   rebate = 0.80f;
			    	   break;
			       case 5:
			    	   rebate = 0.75f;
			    	   break;
			       case 6:
			    	   rebate = 0.70f;
			    	   break;
			       case 7:
			    	   rebate = 0.65f;
			    	   break;
			       case 8:
			    	   rebate = 0.60f;
			    	   break;
			       case 9:
			    	   rebate = 0.55f;
			    	   break;
			       case 10:
			    	   rebate = 0.50f;
			    	   break;
			    	default:
			    	   rebate = 0.50f;
			}
		}
		
		System.out.println("您累计的消费金额是" + money);
		System.out.println("您将享受" + rebate + "折优惠!");
	}
}
