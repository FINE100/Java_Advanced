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

	}
}