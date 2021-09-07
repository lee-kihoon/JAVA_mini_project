package com.auction;


public class Auction {
	public static void main(String[] args) {
		AuctionMenu auction=new AuctionMenu();
		
		System.out.println("경매 프로그램에 오신걸 환영합니다.");
		auction.setDate();
		while(auction.getMenu()!=5) {
			auction.menu();
		}
	}
}
