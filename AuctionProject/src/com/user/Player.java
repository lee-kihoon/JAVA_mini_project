package com.user;

import java.util.*;

public class Player extends SetPlayer {
	ArrayList<SetPlayer> player=new ArrayList<SetPlayer>();

	public void InsertPlayer(String name, int money) {
		player.add(new SetPlayer(name, money));
	}

	public void printPlayer(int p_number) {
		System.out.print((p_number+1)+"번 "+player.get(p_number).name+"씨는 ");
		System.out.println(player.get(p_number).getMoney()+"만원을 갖고있습니다.");
	}

	public String getPlayer(int num) {
		return player.get(num).name;
	}

	public void SetDifferenceMoney(int i, int money) {
		if(i!=0) {
			int p_money=player.get(i-1).getMoney()-money;
			player.get(i-1).setMoney(p_money);
		}
	}
}
