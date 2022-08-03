package co.study.ex;

import java.util.Scanner;

public class Homework18 {
	// co.study.ex 에 동일명 풀이 있음

	// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			boolean run = true;
			int prdCnt = 0;
			String[] product = null;
			int[] price = null;

			while (run) {
				System.out.println("----------------------------------------------------");
				System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
				System.out.println("----------------------------------------------------");
				System.out.println(" 선택 >>");

				int selectNo = Integer.parseInt(scn.nextLine()); // nextInt 숫자만 인식, enter 키 인식 못함

				if (selectNo == 1) {
					System.out.println("상품 수>");
					prdCnt = Integer.parseInt(scn.nextLine());
					product = new String[prdCnt];
					price = new int[prdCnt];

				} else if (selectNo == 2) {

					for (int i = 0; i < product.length; i++) {
						System.out.printf("상품명[%d번] >", i);
						product[i] = scn.nextLine();
						System.out.printf("가격입력[%d번] >", i);
						price[i] = Integer.parseInt(scn.nextLine());
					}

				} else if (selectNo == 3) {
					for (int i = 0; i < price.length; i++) {
						System.out.printf("상품명 [%s] : 가격 [%d] %n", product[i], price[i]);
					}

				} else if (selectNo == 4) {
					int max = price[0];
					int cnt = 0;
					int sum = 0; // 최대값, 합계, 평균 위한 변수
					for (int i = 0; i < price.length; i++) {
						cnt += price[i];

						if (price[i] > max) {
							max = price[i];

						}
						sum = cnt - max;
					}
					System.out.println("최고 가격 : " + max);
					System.out.println("최고 가격을 제외한 총합 : " + sum);

				} else if (selectNo == 5) {

					break;

				}
			}
			System.out.println("프로그램이 종료되었습니다.");

		}
	}
