package com.auction;

import java.util.Scanner;

import com.date.*;

public class Date {
	Week week;
	Scanner sc = new Scanner(System.in);

	public void setWeek(Week wk) {
		week = wk;
	}

	public void settingDate() {
		System.out.print("������ ������ �Է����ּ��� ");
		System.out.print("[��,ȭ,��,��,��] > ");
		String inputWeek = sc.next();
		if (inputWeek.equals("��")) {
			setWeek(new Monday());
		} else if (inputWeek.equals("ȭ")) {
			setWeek(new Tuesday());
		} else if (inputWeek.equals("��")) {
			setWeek(new Wednesday());
		} else if (inputWeek.equals("��")) {
			setWeek(new Thursday());
		} else if (inputWeek.equals("��")) {
			setWeek(new Friday());
		}
	}

	public void performWeek() {

		week.weekPrint();
	}
}
