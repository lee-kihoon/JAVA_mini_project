package com.product;

import java.util.*;

public class Third implements Product {
	Scanner input = new Scanner(System.in);
	String product = "��ȭ�� ȸ��";
	private int price = 200;

	public String getProduct() {
		return product;
	}

	public int buyProduct(int p_num) {
		int[] plusprice = { 10, 50, 100, 200 };
		int pluscount = 0;
		int m_num = 0;
		int nowprice = price;

		System.out.println(
				"1388��(��� 14��) �������� �䵿(ס��)�� �����ϱ� ���� �����ߴ� �̼���(������) ���� ��ȭ������ ȸ���� ����� ������Ű�� ������ ����� ���. ���� ���� â���� ����� �Ǿ���.");
		System.out.println("��Ŵ� " + nowprice + "���� ���� �����Դϴ�.\n");

		while (nowprice < 2000) {
			p_num = m_num;

			if (nowprice == 250) {
				pluscount++;
				System.out.println("\n�������� ȣ���� " + plusprice[pluscount] + "�����Դϴ�.");
			}
			if (nowprice == 500) {
				pluscount++;
				System.out.println("\n�������� ȣ���� " + plusprice[pluscount] + "�����Դϴ�.");
			}
			if (nowprice == 1000) {
				pluscount++;
				System.out.println("\n�������� ȣ���� " + plusprice[pluscount] + "�����Դϴ�.");
			}

			System.out.print("�� ���� ��ȣ�� �����ּ��� [ 0 �Է½� ���� ] : ");
			m_num = input.nextInt();

			if (m_num != 0) {
				nowprice += plusprice[pluscount];
				System.out.println(m_num + "�� " + nowprice + "���� ���Խ��ϴ�.");
			} else {
				break;
			}
		}

		if (nowprice == 2000) {
			System.out.println(m_num + "�� " + nowprice + "������ �����Դϴ�!");
			System.out.println("��ȭ�� ȸ�� ����� ��Ÿ� �����ڽ��ϴ�.");
			System.out.println("==================================================================\n");
			price = nowprice;
			return m_num;
		} else if (nowprice > 200) {
			System.out.println(p_num + "�� " + nowprice + "������ �����Դϴ�!");
			price = nowprice;
		} else
			System.out.println("�ƽ��Ե� �������� �ʾҽ��ϴ�.");
		System.out.println("��ȭ�� ȸ�� ����� ��Ÿ� �����ڽ��ϴ�.");
		System.out.println("==================================================================\n");

		return p_num;
	}

	public int getPrice() {
		return price;
	}
}