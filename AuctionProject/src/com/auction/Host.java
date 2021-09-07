package com.auction;

import com.product.*;
import lombok.Data;
import java.util.*;

@Data
public class Host {
	private int[] p_num = new int[10];
	private String[] p_name = new String[10];
	private int[] p_price = new int[10];
	private int p_menu;
	Scanner input = new Scanner(System.in);

	First first = new First();
	Second second = new Second();
	Third third = new Third();
	Fourth fourth = new Fourth();
	Fifth fifth = new Fifth();
	Sixth sixth = new Sixth();
	Seventh seventh = new Seventh();
	Eighth eighth = new Eighth();
	Ninth ninth = new Ninth();
	Tenth tenth = new Tenth();

	public void rule() {
		System.out.println("\n호가는 10만원 부터 50만원 , 100만원 , 200만원 으로 올라갑니다.");
		System.out.println("경매 최고낙찰 가격은 2000만원이며 최고가에 다다르면 마지막에 입찰하신분이 최종낙찰되겠습니다.");
	}

	public void startAuction() {

		System.out.print("경매를 할 물품을 골라주세요 (0 은 종료) : ");
		switch (p_menu = input.nextInt()) {
		case 1:
			p_num[0] = startFirst(0);
			break;
		case 2:
			p_num[1] = startSecond(1);
			break;
		case 3:
			p_num[2] = startThird(2);
			break;
		case 4:
			p_num[3] = startFourth(3);
			break;
		case 5:
			p_num[4] = startFifth(4);
			break;
		case 6:
			p_num[5] = startSixth(5);
			break;
		case 7:
			p_num[6] = startSeventh(6);
			break;
		case 8:
			p_num[7] = startEighth(7);
			break;
		case 9:
			p_num[8] = startNinth(8);
			break;
		case 10:
			p_num[9] = startTenth(9);
			break;
		default:
			break;
		}
	}
	
	public int getMenu() {
		return p_menu;
	}

	public void AuctionInfo() {
		System.out.println("[1] " + first.getProduct());
		System.out.println("[2] " + second.getProduct());
		System.out.println("[3] " + third.getProduct());
		System.out.println("[4] " + fourth.getProduct());
		System.out.println("[5] " + fifth.getProduct());
		System.out.println("[6] " + sixth.getProduct());
		System.out.println("[7] " + seventh.getProduct());
		System.out.println("[8] " + eighth.getProduct());
		System.out.println("[9] " + ninth.getProduct());
		System.out.println("[10] " + tenth.getProduct());
	}

	public int startFirst(int p_num) {
		System.out.println();
		System.out.println(first.getProduct() + "의 경매를 시작합니다.");
		this.p_num[0] = first.buyProduct(p_num);
		p_name[0] = first.getProduct();
		p_price[0] = first.getPrice();

		return p_num = this.p_num[0];
	}

	public int startSecond(int p_num) {
		System.out.println();
		System.out.println(second.getProduct() + "의 경매를 시작합니다.");
		this.p_num[1] = second.buyProduct(p_num);
		p_name[1] = second.getProduct();
		p_price[1] = second.getPrice();

		return p_num = this.p_num[1];
	}

	public int startThird(int p_num) {
		System.out.println();
		System.out.println(third.getProduct() + "의 경매를 시작합니다.");
		this.p_num[2] = third.buyProduct(p_num);
		p_name[2] = third.getProduct();
		p_price[2] = third.getPrice();

		return p_num = this.p_num[2];
	}

	public int startFourth(int p_num) {
		System.out.println();
		System.out.println(fourth.getProduct() + "의 경매를 시작합니다.");
		this.p_num[3] = fourth.buyProduct(p_num);
		p_name[3] = fourth.getProduct();
		p_price[3] = fourth.getPrice();

		return p_num = this.p_num[3];
	}

	public int startFifth(int p_num) {
		System.out.println();
		System.out.println(fifth.getProduct() + "의 경매를 시작합니다.");
		this.p_num[4] = fifth.buyProduct(p_num);
		p_name[4] = fifth.getProduct();
		p_price[4] = fifth.getPrice();

		return p_num = this.p_num[4];
	}

	public int startSixth(int p_num) {
		System.out.println();
		System.out.println(sixth.getProduct() + "의 경매를 시작합니다.");
		this.p_num[5] = sixth.buyProduct(p_num);
		p_name[5] = sixth.getProduct();
		p_price[5] = sixth.getPrice();

		return p_num = this.p_num[5];
	}

	public int startSeventh(int p_num) {
		System.out.println();
		System.out.println(seventh.getProduct() + "의 경매를 시작합니다.");
		this.p_num[6] = seventh.buyProduct(p_num);
		p_name[6] = seventh.getProduct();
		p_price[6] = seventh.getPrice();

		return p_num = this.p_num[6];
	}

	public int startEighth(int p_num) {
		System.out.println();
		System.out.println(eighth.getProduct() + "의 경매를 시작합니다.");
		this.p_num[7] = eighth.buyProduct(p_num);
		p_name[7] = eighth.getProduct();
		p_price[7] = eighth.getPrice();

		return p_num = this.p_num[7];
	}

	public int startNinth(int p_num) {
		System.out.println();
		System.out.println(ninth.getProduct() + "의 경매를 시작합니다.");
		this.p_num[8] = ninth.buyProduct(p_num);
		p_name[8] = ninth.getProduct();
		p_price[8] = ninth.getPrice();

		return p_num = this.p_num[8];
	}

	public int startTenth(int p_num) {
		System.out.println();
		System.out.println(tenth.getProduct() + "의 경매를 시작합니다.");
		this.p_num[9] = tenth.buyProduct(p_num);
		p_name[9] = tenth.getProduct();
		p_price[9] = tenth.getPrice();

		return p_num = this.p_num[9];
	}
}
