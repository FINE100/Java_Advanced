package co.study.solve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CultureApp {

	public static void main(String[] args) {
		Culture movie = new Movie("추격자", 7, 5);
		movie.setTotalScore(4);
		movie.setTotalScore(5);
		movie.setTotalScore(3);
		movie.setTotalScore(5);
		movie.setTotalScore(4);

		movie.getInformation();
		System.out.println("==================================");

		Culture perfor = new Performance("지킬앤하이드", 9, 10);
		perfor.setTotalScore(5);
		perfor.setTotalScore(5);
		perfor.setTotalScore(3);
		perfor.setTotalScore(4);
		perfor.setTotalScore(2);
		perfor.setTotalScore(2);

		perfor.getInformation();
		System.out.println("==================================");

	}
}
//		Scanner scn = new Scanner(System.in);
//		boolean run = true;
//		Culture c1 = new Movie();
//		Culture c2 = new Performance();
//		int[] cntC = null;
//		int[] cntP = null;
//		List<Culture>m1 = new ArrayList<>();
//
//		System.out.println("환영합니다. CULTURE APP 입니다.");
//
//		while (run) {
//
//			System.out.println("================================================");
//			System.out.println("1. 영화 입력 2. 연극 입력 3. 점수 입력 4. 출력 5. 종료 ");
//			System.out.println("================================================");
//
//			int selectNo = Integer.parseInt(scn.nextLine());
//
//			if (selectNo == 1) {
//				// ((Movie)c1).getGenreM()
//				System.out.print("제목을 입력하시오 > ");
//				String cTitle = scn.nextLine();
//				System.out.print("감독 수를 입력하시오 > ");
//				int directorNo = Integer.parseInt(scn.nextLine());
//				System.out.print("배우 수를 입력하시오 > ");
//				int actorNo = Integer.parseInt(scn.nextLine());
//
//				if (selectNo == 1) {
//					c1 = new Movie(cTitle, directorNo, actorNo);
//					m1.add(c1);
//				} else {
//					c2 = new Performance(cTitle, directorNo, actorNo);
//					m1.add(c2);
//				}
//				
//			} else if (selectNo == 3) {
//				while (true) {
//					System.out.println("1.영화 점수 2. 연극 점수 3. 종료");
//					System.out.println("원하는 메뉴를 선택해주세요 >");
//
//					int selectNo2 = Integer.parseInt(scn.nextLine());
//					if (selectNo2 == 1) {
//						System.out.println("영화 점수 입력>");
//						c1.score = Integer.parseInt(scn.nextLine());
//						break;
//					} else if (selectNo2 == 2) {
//						System.out.println("연극 점수 입력>");
//						c2.score = Integer.parseInt(scn.nextLine());
//						break;
//					} else {
//						System.out.println("본 메뉴로 돌아갑니다.");
//						break;
//					}
//				}
//			} else if (selectNo == 4) {
//
//				while (true) {
//					System.out.println("원하는 메뉴를 선택해주세요 >");
//					System.out.println("1.영화 보기 2. 연극 보기 3. 종료");
//
//					int selectNo3 = Integer.parseInt(scn.nextLine());
//					if (selectNo3 == 1) {
//						c1.setTotalScore(c1.score);
//
//						System.out.println(c1.getGrade());
//						c1.getInformation();
//
//					} else if (selectNo3 == 2) {
//						c2.setTotalScore(c1.score);
//
//						System.out.println(c2.getGrade());
//						c2.getInformation();
//
//					} else {
//						System.out.println("본 메뉴로 돌아갑니다.");
//						break;
//					}
//				}
//
//			} else {
//				
//				//
////				System.out.println("프로그램을 종료합니다!");
////				break;
//			}
//
//		}
//	}
//}
