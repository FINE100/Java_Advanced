package com.yedam.review;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class StringAPI {

	public static void main(String[] args) {

		// 1) String의 이해

		String a = "aaa"; // a의 주소값이 담겨있음

		String b = "bbb"; // b의 주소값이 담겨있음
		String c = "aaa"; // a와 동일한 주소값이 됨

		String d = new String("aaa"); // a와 다른 주소값이 됨. 새로운 주소값 생성. (new)

		if (a == d) // 주소값 비교
			if (a.equals(d))
				; // 데이터값 비교

		// 2) StringBuilder() - buffer를 이용하여 문자열 저장, 한 메모리 안에 다 저장

		// 100번지
		String A = "aaa";
		// "aaaabbb" 101번지 > 메모리 주소값이 변경되면서 값이 생성
		A = A + "bbb";

		StringBuilder sb = new StringBuilder();
		// 100번지
		sb.append("aaa");
		// 100번지
		sb.append("bb"); // 같은 메모리 주소 안에 값을 다 넣을 수 있음
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb1== sb2 ? " + (sb1 == sb2)); // false

		System.out.println("sb.equals(sb2)?" + sb1.equals(sb2)); // false

		// StringBuffer의 내용을 String으로 변환한다.
		String s1 = sb.toString();
		String s2 = sb.toString();

		System.out.println("s1.equals(s2)" + s1.equals(s2)); // true

// 주민등록번호에서 데이터 추출하기

// 주민등록번호를 통한 나이 구하기
// 6자리 - 7 자리  -> Scnner 데이터 ( 예. 000000 - 1234567 )
//               -> 나이 구하시오.
//                -> 91212 -> 1999 (범위 : 1924~2022까지)
//	              ->  981212-1578987 -> ~살
//		          ->  010228-4785475 -> ~살
//		          ->  000815-3857432 -> ~살

		Scanner scn = new Scanner(System.in);
		
		LocalDate now = LocalDate.now(); // 현재 날짜 구하는 메소드
		now.getYear();// 년도만 볼 수 있는 메소드
		int age = 0;
		
		System.out.println("생년월일를 입력하세요(YYMMDD). >>"); //입력 포맷 안내해줘야 substring 제대로 할 수 있음~~!
		String personal = scn.nextLine();
		int birth = Integer.parseInt(personal.substring(0, 2)); // int 형변환할 때는 Integer 사용(***) 
		//System.out.println(birth);

		// 조건 :) 991212 -> 1999 (범위 : 1924~2023까지)
		
		if (24 <= birth && birth <= 99) { 
			age = now.getYear() - (birth + 1900) + 1; // 현재 년도 - (추출한 년도 + 1900) + 1; 
		} else if (00 <= birth && birth <= 22) {
			age = now.getYear() - (birth + 2000) + 1;
		}
		System.out.println("나이는 " + age + "입니다.");
	}

}