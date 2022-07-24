package co.study.ex;
/*
 * 문제) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 
 * 최고 점수 및 평균 점수를 구하는 프로그램입니다. 
 * 실행결과를 보고, 알맞게 작성해보세요.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Homework17 {

	public static void main(String[] args) {
		
		boolean run = true;	//while 절 사용하기 위해 선언
		int[] score = null; // 점수 목록 만들기 위해 배열로 선언
		int studentNum = 0; // 학생수 받을 변수
		Scanner scn = new Scanner(System.in); // 입력 받기 위한 스캐너

		while (run) { // 조건이 참인동안 수행할 내용 넣음. 내용 반복될 수 있도록 사용.
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택>"); // 메뉴 내용 보여주기 위해서  

			int selectNo = scn.nextInt(); // 메뉴 번호 입력 받아서 기능 실행

			if (selectNo == 1) { // 학생수 ( = 배열 길이) 입력
				System.out.println("학생수>");
				studentNum = scn.nextInt(); //학생 수 직접 입력 받기 위해 스캐너 사용 
				score = new int[studentNum]; // 입력 받은 학생수(studentNum)을 배열 길이로 초기화
			}

			else if (selectNo == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.printf("score[%d] >", i);
					score[i] = scn.nextInt();			// 입력 받은 배열의 길이만큼 점수 입력 받음
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("score["+i+"] = "+ score[i]); // 입력된 점수 리스트 출력
				}

			} else if (selectNo == 4) {
				int max = score[0]; int cnt = 0; double avg = 0; // 최대값, 합계, 평균 위한 변수
				for(int i = 0; i <score.length;i++) {
					cnt += score[i];						//입력받은 배열 값들 누적해서 더해줌
					if(score[i]>max) {
						max = score[i];						//max(score[0])과 배열 값들 비교해서 찾아냄
					
				} avg = (double)cnt / score.length;	 // 누적합계 구한후(for문 종료) 배열 길이로 나눠 평균 구함 
				}									// cnt는 int 이므로 avg에 맞게 형변환
					
				System.out.println("최고 점수 : " + max);
				System.out.printf("평균 점수 : %.1f " , avg); // 출력

			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;								//프로그램 종료 위해 break; (while문 밖으로 나감)
			}
		}
		System.out.println("종료");	//종료(while문 밖으로 나갔는지) 확인 위해 메세지 다시 출력 시킴
	}// end of main
} 
