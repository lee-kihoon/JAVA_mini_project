package com.user;

import java.util.*;

public class Player extends SetPlayer {
	ArrayList<SetPlayer> player=new ArrayList<SetPlayer>();

	public void InsertPlayer(String name, int money) {
		player.add(new SetPlayer(name, money));
	}

	public void printPlayer(int p_number) {
		System.out.print((p_number+1)+"�� "+player.get(p_number).name+"���� ");
		System.out.println(player.get(p_number).getMoney()+"������ �����ֽ��ϴ�.");
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
