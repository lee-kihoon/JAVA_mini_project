package com.product;

import java.util.Scanner;

public class Tenth implements Product {
	Scanner input = new Scanner(System.in);
	String product = "을사조약";
	private int price = 200;

	public String getProduct() {
		return product;
	}

	public int buyProduct(int p_num) {
		int[] plusprice = { 10, 50, 100, 200 };
		int pluscount = 0;
		int m_num = 0;
		int nowprice = price;

		System.out.println("1905년 일본이 한국의 외교권을 박탈하기 위해 강제로 체결한 조약.");
		System.out.println("경매는 " + nowprice + "만원 부터 시작입니다.\n");

		while (nowprice < 2000) {
			p_num = m_num;

			if (nowprice == 250) {
				pluscount++;
				System.out.println("\n이제부터 호가는 " + plusprice[pluscount] + "만원입니다.");
			}
			if (nowprice == 500) {
				pluscount++;
				System.out.println("\n이제부터 호가는 " + plusprice[pluscount] + "만원입니다.");
			}
			if (nowprice == 1000) {
				pluscount++;
				System.out.println("\n이제부터 호가는 " + plusprice[pluscount] + "만원입니다.");
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
			System.out.println("을사조약 사건의 경매를 끝내겠습니다.");
			System.out.println("==================================================================\n");
			price = nowprice;
			return m_num;
		} else if (nowprice > 200) {
			System.out.println(p_num + "번 " + nowprice + "만원에 낙찰입니다!");
			price = nowprice;
		} else
			System.out.println("아쉽게도 낙찰되지 않았습니다.");
		System.out.println("을사조약 사건의 경매를 끝내겠습니다.");
		System.out.println("==================================================================\n");

		return p_num;
	}

	public int getPrice() {
		return price;
	}
}
