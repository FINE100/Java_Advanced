package com.yedam.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//QUIZ	
//로또 생성 및 관리
//1. 중복되지 않은 번호가 6개 출력된다.
//2. 한장당 총 1~5줄 생성된다.
//3. 한 줄당 금액은 천원이며, 입력한 금액만큼 생성한다.
//4. 구매 금액, 생성된 로또 번호를 출력한다.
//5. 5장씩 끊어서 출력할 것

public class LottoApp2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		;
		List<int[]> lotto = new ArrayList<>();
		boolean run = true;
		int menu = 0;
		int money = 0;

		while (menu != 99) {
			System.out.println("메뉴를 선택해주세요.\n");
			System.out.println("1. 로또생성 | 2. 로또조회 | 99. 프로그램 종료");

			menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.println("금액을 투입해주세요.");

				money = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < (money / 1000); i++) {
					int[] lottoNo  = new int[6];
					
				}

				System.out.println("번호 출력 완료\n");

			case 2:

			}

		}

	}
}
