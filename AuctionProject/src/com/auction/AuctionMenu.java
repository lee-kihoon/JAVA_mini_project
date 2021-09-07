package com.auction;

import com.user.*;

import lombok.Data;
import java.util.*;

@Data
public class AuctionMenu {
	private int menu = 0;
	int count = 0;
	int[] p_num = new int[5];
	int[] price = new int[5];
	String[] p_name = new String[5];

	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	String s_name;
	Player player = new Player();
	Host host = new Host();
	Date dt = new Date();

	public void setDate() {
		dt.settingDate();
		dt.performWeek();
	}

	public void menu() {
		System.out.print("[1] 플레이어 정하기 [2] 플레이어 조회 [3] 경매 시작 [4] 경매 결과 확인 [5] 끝내기 : ");
		menu = input.nextInt();

		switch (menu) {
		case 1:
			count = createUser(count);
			break;
		case 2:
			infoUser(count);
			break;
		case 3:
			AuctionStart();
			break;
		case 4:
			AuctionUserInfo();
			break;
		}
	}

	public int createUser(int count) {
		System.out.print("이름을 입력하세요 : ");
		player.InsertPlayer(s_name = input2.nextLine(), 8000 );
		System.out.println();

		return ++count;
	}

	public void infoUser(int count) {
		if (count == 0) {
			System.out.println("정보가 없습니다.");
			System.out.println();
		} else {
			for (int i = 0; i < count; i++) {
				player.printPlayer(i);
			}
			System.out.println();
		}
	}

	public void AuctionStart() {
		host.rule();
		host.AuctionInfo();
		host.startAuction();

		p_num = host.getP_num();
		p_name = host.getP_name();
		price = host.getP_price();

		int i = host.getMenu();
		if (i != 0)
			player.SetDifferenceMoney(p_num[i - 1], price[i - 1]);
		else
			System.out.println();
	}

	public void AuctionUserInfo() {
		int sum = 0;

		System.out.println("낙찰된 목록을 조회합니다.");
		for (int i = 0; i < price.length; i++) {
			if (price[i] != 0) {
				if (price[i] == 200) {
					System.out.println(p_name[i] + "은(는) 아쉽게도 낙찰 되지 않았습니다.");
				} else {
					System.out
							.println(p_name[i] + " 사건 : " + player.getPlayer(p_num[i] - 1) + ", " + price[i] + "만원 낙찰");
				}
			}
		}
		System.out.println();

		for (int i = 0; i < price.length; i++) {
			sum += price[i];
		}
		if (sum == 0)
			System.out.println("경매된 목록이 없습니다.\n");
	}
}
