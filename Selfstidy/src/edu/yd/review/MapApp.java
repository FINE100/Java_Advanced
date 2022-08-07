package edu.yd.review;

import java.util.HashMap;
import java.util.Scanner;

/* 사전 만들기
 * "1. 단어등록 | 2. 단어 전체 조회 | 3. 단어 검색 | 4. 단어 수정 "
					+ "5. 단어 삭제" + "99. 종료")
*/

public class MapApp {
	Scanner scn = new Scanner(System.in);
	HashMap<String, String> map = new HashMap<>();
	int menuNo;

	public MapApp() { // MapAPP 돌아가는 메소드
		run();
	}

	private void run() { // 실행시키는 메소드

		while (menuNo != 99) {

			System.out.println(" =======================================================");
			System.out.println("어서오세요. 내가 만드는 단어장! YD 단어 사전입니다.");
			System.out.println();
			System.out.println("1. 단어등록 | 2. 단어 전체 조회 | 3. 단어 검색 | 4. 단어 수정 " + "5. 단어 삭제 | 99. 종료");
			System.out.println(" =======================================================");
			System.out.println("입력 >> ");
			menuNo = Integer.parseInt(scn.nextLine());

			switch (menuNo) {

			// 단어등록
			case 1:
				String word = "";
				while(true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					System.out.println("입력 > ");
					word = scn.nextLine();
					if(word.equals("q")) { // q입력시 멈출 수 있도록 기능 추가 
						break;
					}
				
				System.out.println("뜻을 입력해주세요.>>");
				String mean = scn.nextLine();
				map.put(word, mean);
				}

			// 단어 전체 조회
			case 2:

				if (map.size() == 0) {
					System.out.println("조회할 단어가 없습니다.");
				} else {
					System.out.println(" ********* 예담 단어장 **********");
					for (String key : map.keySet()) {
						String value = map.get(key);
						System.out.println("단어 : " + key + ", 뜻 : " + value);

					}
				}

				break;
			// 단어 검색
			case 3:
				System.out.println("검색할 단어를 입력하세요");
				String key = scn.nextLine();
				if (map.containsKey(key)) {
					String value = map.get(key);
					System.out.println("단어 : " + key + "뜻 : " + value);
				} else {
					System.out.println("등록되지 않은 단어입니다.");
				}
				break;
			// 단어 수정
			case 4:
				System.out.println("수정할 단어 입력 >");
				String key1 = scn.nextLine();
				if (map.containsKey(key1)) {
					System.out.println("수정할 뜻 >");
					String value = scn.nextLine();
					map.put(key1, value);
				} else {
					System.out.println("등록되지 않은 단어입니다");
				}
				break;
			// 단어 삭제
			case 5:
				System.out.println("1. 한 건 삭제 | 2. 전체 삭제 ");
				System.out.println("입력 > ");
				String menu = scn.nextLine();
				// 한 건 삭제
				if (menu.equals("1")) {
					System.out.println("삭제 단어 입력 > "); // 어떤 걸 삭제할지 파악.
					String key2 = scn.nextLine();
					map.remove(key2); // map.remove(key) => 내가 원하는 key 값을 삭제함.

					if (!map.containsKey(key2)) { // 조회했을 때 없다면 (! 연산자)
						System.out.println("삭제 완료");
					} else {
						System.out.println("삭제되지 않았습니다. 관리자에게 문의하세요.");
					}

				}
				// 전체 삭제
				else if (menu.equals("2")) {
					// map에 있는 데이터 전체 삭제
					map.clear();
					if (map.size() == 0) {
						System.out.println("전체 삭제 완료");
					} else {
						System.out.println("삭제가 되지 않았습니다. 관리자에게 문의하세요.");
					}
				}

				break;

			// 종료
			default:
				System.out.println("시스템을 종료합니다.");
				menuNo = 99;
				break;
			}

		}

	}

}
