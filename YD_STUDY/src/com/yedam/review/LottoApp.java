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

	Scanner scn = new Scanner(System.in);
		
		int menu = 0;
		
		List<int[]> list = new ArrayList<>();
		
		public LottoApp() {
//			run();
		}	
}

		
//	private void run() {
		
//		while (menu != 99) {
//			menuInfo();
//			menu = Integer.parseInt(scn.nextLine());
//
//		switch (menu) {
//
//			case 1:
//				System.out.println("금액을 투입해주세요");				
//				money = Integer.parseInt(scn.nextLine());
//				System.out.println("번호 출력 완료");
//				break;
//
//			case 2:
//				System.out.println("구매한 금액 " + money);
//			  // 금액에 따른 출력 횟수. ?????
//			  
//			    
//				
//					
//					System.out.println(randomNo);
//
//				}
//				
//			case 99 : 
//				System.out.println("프로그램 종료");
//				flag = false;
//			}
//		}
//	}
//}
//private void showInfo() {
//	System.out.println("구매한 금액 >" +(list.size()*1000)+"원");
//	
//	for(int i =0 ; i< list.size(); i++) {
//		// 1번, 2번
//		System.out.print((i%5+1)+ "번>");
//		//로또 번호 출력
//		for(int j = 0 ; j < 6; j++) {
//			System.out.println(list.get(i)[j]+ " ");
//		}
//		
//		System.out.println();
//		// &&, &
//	
//		if((i+1)!=0 && (i+1)%5 == 0){
//			System.out.println("--------------------------------");
//		}
//	}	
//		
//	}
//
//
//private void makeNumber () {
//	int[] lottoNo = new int[6];
//	for (int i = 0; i < 6; i++) {
//	int randomNo = (int) (Math.random() * 45) + 1; // 임의의 번호 출력 
//	
//	// 첫번째 값은 중복 체크할 필요 없음.
//	if (i > 0) {
//		
//						//j=0, i번째까지, (ex) i = 3 (index = 0,1,2)
//		for (int j = 0; j < i; j++) {
//			// (예) 배열에 있는 값 : 30, 40, 20
//			// (예) randomNo : 30 			
//			if (lottoNo[j] == randomNo) {
//				i -= 1;   // 다음 인덱스로 넘어가는 값을 -1해서 다시 동일한 인덱스 값 찾을 수 있도록 해줌. 
//						//(3번째 인덱스 중복 -> 4번째 -1 -> 3번째 다시 찾기)	
//				
//				System.out.println("중복제거!");
//				break;
//			}else if((j+1)==i) {
//				lottoNo[i] = randomNo;
//			}
//		}
//		lottoNo[i] = randomNo;
//	} else {
//		lottoNo[i] = randomNo;
//	}
//	}
////	return lottoNo;
//}
//}
