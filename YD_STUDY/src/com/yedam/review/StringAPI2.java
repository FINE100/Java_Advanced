package com.yedam.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringAPI2 {

	public static void main(String[] args) {
		// 1. 단어 입력
		// 2. 대, 소문자 변환
		// 3. 단어의 총 길이
		// 4. 단어 자르기
		// 5. 단어 자르기2

		Scanner scn = new Scanner(System.in);

		int MenuNo = 0;
		List<String> list = new ArrayList<>();

		while (MenuNo != 99) {
			System.out.println("기능을 선택해주세요.");
			System.out.println(" 1. 단어 입력 | 2. 대, 소문자 변환 | 3. 단어의 총 길이 | 4. 단어 자르기 | 5. 단어 자르기 2 " + "| 99. 프로그램 종료");

			System.out.println("입력>");

			// -> nextLine = String + Enter
			// -> nextLine 은 Enter 기준으로 값 인식
			// -> nextInt() => 5 + Enter

			// int = nextInt() => 5 + Enter => 5만 가져감
			// int = nextLine() => Enter => Enter 값이 남아 오류 발생
			MenuNo = Integer.parseInt(scn.nextLine());

			switch (MenuNo) {
			case 1:
				while (true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌려주세요.");
					String word = scn.nextLine();
					if (word.equals("q")) {
						break; // 넣어주지 않으면 while 문 안에서 true로 계속 돌고 있음.
					}
					list.add(word);
				}
				for (String str : list) { // 내가 넣은 단어 확인. 향상된 for문.
					System.out.println(str + " ");
				}
				break;

			case 2:
				if (list == null || list.size() == 0) { // 입력받은 값이 없는 경우 알려주기 위해. (예외처리) >> 넣어주면 완성도 up
					System.out.println("단어가 등록되지 않았습니다.");
					return;
				}
				System.out.println(" 1. 대문자 | 2. 소문자 ");
				int menu = Integer.parseInt(scn.nextLine());
				if (menu == 1) {
					for (String str : list) {
						System.out.println(str.toUpperCase() + " "); // list에 담긴 값이 모두 대문자로 출력됨
					}
				} else if (menu == 2) {
					for (String str : list) {
						System.out.println(str.toLowerCase() + " ");// list에 담긴 값이 모두 소문자로 출력됨
					}
				}

				break;

			case 3:
				StringBuilder sb = new StringBuilder();

				for (int i = 0; i < list.size(); i++) {
					sb.append(list.get(i)); // 문자열 합침
				}

				System.out.println("입력한 문자의 총 길이 : " + sb.length() + "입니다. ");
				break;

			case 4:
				System.out.println("자르고 싶은 단어의 인덱스를 입력하세요.");
				int i = 0;
				for (String str : list) { // 단어 인덱스를 모르기 때문에 찾기 위해 for문 씀
					System.out.println(i + "번째 단어 : " + str);
					i++;
				}

				System.out.println("입력 > ");
				int idx = Integer.parseInt(scn.nextLine());
				
				String word = list.get(idx);
				//인덱스 받아와서 단어에 가운데부터 끝까지 자르기.
				//String.substring(숫자) => 넣은 인덱스부터 끝까지 잘라옴. 
				//
				// 1. word.length()/2 => 단어 길이의 절반. 
				// 2. Math.round(word.length()/2) => 단어의 한 가운데의 인덱스 가져옴 
				// 3. word.substring(Math.round(word.length()/2)) => 단어의 가운데부터 끝까지.
				
				System.out.println(word.substring(Math.round(word.length()/2)));
				
				break;

			case 5:
				// 구분자 기준으로 자르기 (예. aaa/bbbb => / 기준 자르기), 배열로 만들어짐.
				System.out.println("단어 입력 > ");
				String str = scn.nextLine();
				
				System.out.println("입력하신 단어 : " + str);
				System.out.println("구분자 입력 >");
				String splits = scn.nextLine();
				
				String[] token = str.split(splits);
				
				for(String str2 : token) {
					System.out.println(str2);
				}
				
				//split() /, , \\*
				
				break;
			}
			
			break;

		}

	}

}
