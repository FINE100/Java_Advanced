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

public class LottoApp {

	Scanner sc = new Scanner(System.in);

	int menu = 0;

	List<int[]> list = new ArrayList<>();

	public LottoApp() {
		run();
	}

	// private : 캡슐화, 정보은닉 (메소드 안에서만 실행)
	private void run() {

		while (menu != 99) {
			// 메뉴실행 
			menuInfo();
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				makeLotto();
				break;
			case 2:
				showInfo();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

	private void menuInfo() {
		System.out.println("메뉴를 선택해주세요.\n");
		System.out.println("1. 로또생성 2. 로또조회 99. 프로그램 종료");
	}

	private void makeLotto() {

		System.out.println("금액을 투입해주세요.");

		int money;

		money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < (money / 1000); i++) {
			list.add(makeNumber());
		}

		System.out.println("번호 출력 완료\n");
	}

	private void showInfo() {

		System.out.println("구매 한 금액> " + (list.size() * 1000) + "원");

		for (int i = 0; i < list.size(); i++) {
			// 1번, 2번
			System.out.print((i % 5 + 1) + "번>");
			// 로또 번호 출력
			for (int j = 0; j < 6; j++) {
				System.out.print(list.get(i)[j] + " ");
			}

			System.out.println();
			// &&, &
			// i=0, i % 5 == 0
			if ((i + 1) % 5 == 0) {
				System.out.println("-------------------------------------");
			}
		}
	}

	private int[] makeNumber() {
		
		int[] lottoNo = new int[6];

		for (int i = 0; i < 6; i++) {
			
			// int randomNo = (int) (Math.random() * 45) + 1;
			lottoNo[i] = (int)(Math.random() * 45) + 1;			

			//첫번째 값은 중복체크 할 필요 없음.	
			// i = 4
			if (i > 0) { // 지워도 돌아감 
				// j =0~3, i =4
				// lottoNo[0] <=> lottoNo[4]
				// lottoNo[1] <=> lottoNo[4]
				// lottoNo[2] <=> lottoNo[4]
				// lottoNo[3] <=> lottoNo[4]	
				// lottoNo[3] -> lottoNo[4] 덮어쓰기 
				for (int j = 0; j < i; j++) {				
					
					if (lottoNo[j] == lottoNo[i]) {
						i -= 1;
						System.out.println("중복제거!");
				
					}
				}
			}
		}
		
		
		return lottoNo;
	}
}
