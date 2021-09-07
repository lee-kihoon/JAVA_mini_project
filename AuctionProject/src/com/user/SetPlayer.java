package com.user;

import lombok.Data;

@Data
public class SetPlayer{
	String name="≥≤øµ¡ÿ";
	String[] product= {};
	private int money=0;
	
	public SetPlayer() {
	}
	
	public SetPlayer(String name) {
		this(name, 0, null);
	}
	
	public SetPlayer(int money) {
		this(null, money, null);
	}
	
	public SetPlayer(String name, int money) {
		this(name, money, null);
	}
	
	public SetPlayer(String name, int money, String[] product) {
		this.name=name;
		this.product=product;
		this.money=money;
	}
}
