package edu.jungsuck;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세요");
		
		Scanner scn = new Scanner(System.in);
		int month = scn.nextInt(); // 화면에 입력 받은 숫자를 통해 계절을 출력
		
		switch(month) {
		case 3 : case 4 : case 5 : 
			System.out.println("현재의 계절은 봄입니다.");
			break;										//break 없으면 break 나타날떄까지 실행됨
		case 6 : case 7 : case 8 :
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default : // case 12 : case 1 : case 2 : 생략
			System.out.println("현재의 계절은 겨울입니다.");
						
		}

	} // end of main

}
