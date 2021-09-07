package com.product;

import java.util.Scanner;

public class Eighth implements Product {
	Scanner input = new Scanner(System.in);
	String product = "8.15광복";
	private int price = 200;

	public String getProduct() {
		return product;
	}

	public int buyProduct(int p_num) {
		int[] plusprice = { 10, 50, 100, 200 };
		int pluscount = 0;
		int m_num = 0;
		int nowprice = price;

		System.out.println("1945년 8월 15일 우리나라가 일제의 식민통치로부터 벗어나 독립을 되찾은 사건.");
		System.out.println("경매는 " + nowprice + "만원 부터 시작입니다.\n");

		while (nowprice < 2000) {
			p_num = m_num;

			if (nowprice == 250) {
				pluscount++;
				System.out.println("이제부터 호가는 " + plusprice[pluscount] + "만원입니다.");
			}
			if (nowprice == 500) {
				pluscount++;
				System.out.println("이제부터 호가는 " + plusprice[pluscount] + "만원입니다.");
			}
			if (nowprice == 1000) {
				pluscount++;
				System.out.println("이제부터 호가는 " + plusprice[pluscount] + "만원입니다.");
			}

			System.out.print("살 분은 번호를 말해주세요 [ 0 입력시 종료 ] : ");
			m_num = input.nextInt();

			if (m_num != 0) {
				nowprice += plusprice[pluscount];
				System.out.println(m_num + "번 " + nowprice + "만원 나왔습니다.");
			} else {
				break;
			}
		}

		if (nowprice == 2000) {
			System.out.println(m_num + "번 " + nowprice + "만원에 낙찰입니다!");
			System.out.println("8.15광복 사건의 경매를 끝내겠습니다.");
			System.out.println("==================================================================\n");
			price = nowprice;
			return m_num;
		} else if (nowprice > 200) {
			System.out.println(p_num + "번 " + nowprice + "만원에 낙찰입니다!");
			price = nowprice;
		} else
			System.out.println("아쉽게도 낙찰되지 않았습니다.");
		System.out.println("8.15광복 사건의 경매를 끝내겠습니다.");
		System.out.println("==================================================================\n");

		return p_num;
	}

	public int getPrice() {
		return price;
	}
}
