package co.study.ex;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제

		Scanner scn = new Scanner(System.in);
		System.out.println("원하시는 연도를 입력해주세요.");
		int year = scn.nextInt();

		if (year % 4 == 0) {

			if (year % 100 != 0 || year % 400 != 0) { // 논리 연산자를 이용하면 식을 좀더 간겨라게 할 수 있다.
				System.out.println("입력한 연도인 " + year + "년은 윤년입니다.");
			}

		} else {
			System.out.println("입력한 연도인 " + year + "년은 윤년이 아닙니다.");

		}
	}
}

/*
 * 처음에 생각 했던 코드 co.study.ex;
 * 
 * import java.util.Scanner;
 * 
 * public class Homework10 {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner scn = new Scanner(System.in); System.out.println("원하시는 연도를 입력해주세요.");
 * int year = scn.nextInt();
 * 
 * if (year % 4 == 0) { if (year % 100 != 0){ System.out.println("입력한 연도인 " +
 * year + "년은 윤년입니다."); }else if( year % 400 != 0){
 * System.out.println("입력한 연도인 " + year + "년은 윤년입니다."); }
 * 
 * } else { System.out.println("입력한 연도인 " + year + "년은 윤년이 아닙니다.");
 * 
 * } else { System.out.println("입력한 연도인 " + year + "년은 윤년이 아닙니다."); } }
 * 
 * }
 * 
 * 
 * 
 */
