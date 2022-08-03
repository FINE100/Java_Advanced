package com.yedam.review;

import java.sql.Date;
import java.util.Scanner;

public class StringAPI {


	public static void main(String[] args) {
	
		
		// 1) String의 이해
		
		String a= "aaa"; // a의 주소값이 담겨있음
			
		String b = "bbb"; // b의 주소값이 담겨있음
		String c = "aaa"; // a와 동일한 주소값이 됨
		
		String d = new String("aaa"); // a와 다른 주소값이 됨. 새로운 주소값 생성. (new) 
		
		if( a == d )   			// 주소값 비교
		if(a.equals(d));		// 데이터값 비교
		
		
		
		//2) StringBuilder() - buffer를 이용하여 문자열 저장, 한 메모리 안에 다 저장
		
		// 100번지
		String A = "aaa";		
		//"aaaabbb" 101번지 > 메모리 주소값이 변경되면서 값이 생성
		A = A + "bbb";
	
		
		StringBuilder sb = new StringBuilder(); 
		//100번지 
		sb.append("aaa");
		//100번지
		sb.append("bb"); // 같은 메모리 주소 안에 값을 다 넣을 수 있음
		
		
// 주민등록번호에서 데이터 추출하기

// 주민등록번호를 통한 나이 구하기
// 6자리 - 7 자리  -> Scnner 데이터 ( 예. 000000 - 1234567 )
//               -> 나이 구하시오.
//                -> 91212 -> 1999 (범위 : 1924~2023까지)
//	              ->  981212-1578987 -> ~살
//		          ->  010228-4785475 -> ~살
//		          ->  000815-3857432 -> ~살
		
	Scanner scn = new Scanner(System.in);
	
//	int age = 0; 
//	String birth = scn.nextLine();
//	System.out.println("생년월일를 입력하세요. >>");
//	
//	age = 
//	
//	// 조건 : 예) 991212 -> 1999 (범위 : 1924~2023까지)
//	
//	if(24 <= birth && birth <= 99) {
//		birth + 1990;
//	}
//	
	

		
		
		
		
		
		
		
		
		
		
		

	}

}
