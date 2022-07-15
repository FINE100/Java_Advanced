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

		String id = scn.nextLine();				//문자열(String) 타입으로 id를 키보드 입력 받음
		String strPwd = scn.nextLine();		    //문자열(String) 타입으로 strpwd를 키보드 입력받음

		int pw = Integer.parseInt(strPwd);		//문자열 > 정수(int)타입으로 변환. Integer.parseInt

		if (id.equals("yedam")) {						// if~ id가 yedam과 일치할 때   
														// String 은 참조타입으로 변수.equals(문자열)로 비교 
			if (pw == 1234) {							// int는 기본타입 변수이므로 값을 가짐. ==로 비교 
				System.out.println("로그인 성공~~~!!!");
			} else {
				System.out.println("로그인 실패입니다!");	// 이중 if 구문 이용하여 id가 yedam 이면서 
			}											// 비밀번호 일치, 불일치 경우 나눠줌 
		} else {
			System.out.println("아이디를 다시 확인하세요");   // id가 yedam이 아닐 경우도 포함
		}
	}

}
