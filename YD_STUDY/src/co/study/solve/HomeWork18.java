package co.study.solve;

import java.util.Scanner;

public class HomeWork18 {

	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"	
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

			boolean run = true;
			Scanner scn = new Scanner(System.in);

			while (run) {
				System.out.println("----------------------------------------------------");
				System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
				System.out.println("----------------------------------------------------");
				System.out.println(" 선택 >>");

				int selectNo = Integer.parseInt(scn.nextLine()); // nextInt 숫자만 인식, enter 키 인식 못함

				if (selectNo == 1) {
					System.out.println("상품 수>");
				
				} else if (selectNo == 2) {

					
						
					}

				else if (selectNo == 3) {
					}

				 else if (selectNo == 4) {
				 }
			}
	}
}
	


