package com.yedam.review;

import java.time.LocalDate;
import java.util.Scanner;

/* 주민등록번호를 통한 나이 구하기
 *   6자리 - 7 자리  -> Scnner 데이터 ( 예. 000000 - 1234567 )
 *  -> 91212 -> 1999 (범위 : 1924~2023까지)
 * ->  981212-1578987 -> ~살
 *->  010228-4785475 -> ~살
 *->  000815-3857432 -> ~살
 */	
		

public class SpringAPI3 {

	public static void main(String[] args) {
		// 주민등록번호에서 데이터 추출하기


		  Scanner scn = new Scanner(System.in);
		  LocalDate now = LocalDate.now();
		  now.getYear();
		 
			int age = 0; 
			System.out.println("생년월일를 입력하세요(YYMMDD)>>");
			String personal = scn.nextLine();
			
			int birth = Integer.parseInt(personal.substring(0,2));
			System.out.println(birth);
			
			if(24 <= birth && birth <=99) {
				age = now.getYear() - (birth + 1900) + 1; 
			} else if(00 <= birth && birth <=22) {
				age = now.getYear() - (birth + 2000) + 1; 
			}
			System.out.println("현재 나이는 " + age + "살입니다.");
			}
}
