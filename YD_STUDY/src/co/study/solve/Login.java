package co.study.solve;

/*
 * 문제1. 조건문 만들기 
 * 키보드로 아이디, 패스워드 [입력] 받아서 로그인하는 프로그램
 * 입력 조건 : 아이디 - 문자열(String) /  패스워드 - 정수형(String => int 변환)
 *
 * 아이디 yedam, 패스워드 1234 이라면 "로그인 성공"을 출력하고 
 * 그렇지 않으면 "로그인 실패"를 출력하세요. (조건문)   
 */

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("아이디를 로그인하세요");
		String id = scn.nextLine();

		System.out.println("패스워드를 로그인하세요");
		String pw = scn.nextLine();
		int pwInt = Integer.parseInt(pw);

		if (id.equals("yedam")) {
			if (pwInt == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드 실패");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 오류");
		}
	}

}
