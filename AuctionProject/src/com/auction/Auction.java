package com.auction;


public class Auction {
	public static void main(String[] args) {
		AuctionMenu auction=new AuctionMenu();
		
		System.out.println("��� ���α׷��� ���Ű� ȯ���մϴ�.");
		auction.setDate();
		while(auction.getMenu()!=5) {
			auction.menu();
		}
	}
}
