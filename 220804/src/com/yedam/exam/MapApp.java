package com.yedam.exam;

import java.util.HashMap;
import java.util.Scanner;

public class MapApp {
	// HashMap<k,v> 형태
	HashMap<String, String> map = new HashMap<>();
	Scanner scn = new Scanner(System.in);
	String menuNo = " ";

	// 스레드 : 프로그램 일꾼, 프로세스 순서대로 돌아가게 해줌.
	public MapApp() {
		run(); // 먼저 만들어주고 기능 추가해주러 감

	}

	private void run() {
		// menuNo = "99" => TRUE 
		// menuNo.equals("99") => TRUE
		// !menuNo.equals("99") => false
		// boolean a = true
		// !a = false 		
		while(!menuNo.equals("99")) { // 99가 아닐때 돌아갈 수 있도록 사용.
			System.out.println("****************************************************************************");
			System.out.println("1. 단어등록 | 2. 단어 전체 조회 | 3. 단어 검색 | 4. 단어 수정 "
					+ "5. 단어 삭제" + "99. 종료");
			System.out.println("****************************************************************************");
			System.out.println("입력 >");
			menuNo = scn.nextLine();
			
			// 단어등록
			if(menuNo.equals("1")) {
				String word = "";
				//반복문 통해서 계속 등록할 수 있게 기능 만들어줌
				while(true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					System.out.println("입력 > ");
					word = scn.nextLine();
					if(word.equals("q")) { // q입력시 멈출 수 있도록 기능 추가 
						break;
					}
					System.out.println("뜻 입력>");
					String mean = scn.nextLine();
					map.put(word, mean); // 단어와 뜻을 넣을 수 있도록 하는 기능. map의 put 
				}
				
			} 
			// 단어 전체 조회
			else if(menuNo.equals("2")) {
				if(map.size() == 0) {
					System.out.println("등록된 단어가 없습니다."); // map 등록 0일 시 안내.
				} else {
					System.out.println(" ********* 예담 단어장 **********");
					//1. 향상된 for 문을 이용하여 key 가져옴
					//2. 가져온 key를 활용하여 value 가져옴 
					for(String key : map.keySet()) { // map.keySet => 배열에 있는 값을 하나씩 가져와서 key에 넣어줌 
						String value = map.get(key); // map.get(key) => 데이터 가져오게 되어 있음
						System.out.println("단어 : " + key + "\n 뜻 : " + value);
						
					}
				}
				
			} 
			// 단어 검색
			else if(menuNo.equals("3")) {
				System.out.println("단어 입력 >");
				String key = scn.nextLine();
				if(map.containsKey(key)) { //map.containsKey(key) => key가 map 안에 존재하는지 확인 (true/ false)
					String value = map.get(key);
					System.out.println("단어 : " + key + "\n 뜻 : " + value);
				}else {
					System.out.println("등록되지 않은 단어입니다.");
				}
			}
			// 단어 수정
			else if(menuNo.equals("4")) {
				System.out.println("수정 단어 입력>");
				String key = scn.nextLine();
				if(map.containsKey(key)) {
					System.out.println("수정할 뜻 > ");
					String value = scn.nextLine();
					map.put(key, value); // 바뀐 value를 넣으면 마지막 입력값으로 자동으로 덮어써짐. 
				} else {
					System.out.println("등록되지 않은 단어입니다.");
				}
			
			}
			// 단어 삭제
			else if(menuNo.equals("5")) {
				System.out.println("1. 한 건 삭제 | 2. 전체 삭제 ");
				System.out.println("입력 > ");
				String menu = scn.nextLine();
				// 한 건 삭제
				if(menu.equals("1")) {
					System.out.println("삭제 단어 입력 > "); // 어떤 걸 삭제할지 파악.
					String key = scn.nextLine();
					map.remove(key); //map.remove(key) => 내가 원하는 key 값을 삭제함.
					
					if(!map.containsKey(key)) { // 조회했을 때 없다면 (! 연산자) 
						System.out.println("삭제 완료");
					}else {
						System.out.println("삭제되지 않았습니다. 관리자에게 문의하세요.");
					}
					
				}
				// 전체 삭제
				else if(menu.equals("2")) {
					//map에 있는 데이터 전체 삭제
					map.clear();
					if(map.size () == 0) {
						System.out.println("전체 삭제 완료");
					} else {
						System.out.println("삭제가 되지 않았습니다. 관리자에게 문의하세요.");
					}
				}
					
			}
			
		}
		
	}
	
}
