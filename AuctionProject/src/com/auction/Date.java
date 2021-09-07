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
		System.out.print("오늘의 요일을 입력해주세요 ");
		System.out.print("[월,화,수,목,금] > ");
		String inputWeek = sc.next();
		if (inputWeek.equals("월")) {
			setWeek(new Monday());
		} else if (inputWeek.equals("화")) {
			setWeek(new Tuesday());
		} else if (inputWeek.equals("수")) {
			setWeek(new Wednesday());
		} else if (inputWeek.equals("목")) {
			setWeek(new Thursday());
		} else if (inputWeek.equals("금")) {
			setWeek(new Friday());
		}
	}

	public void performWeek() {

		week.weekPrint();
	}
}
