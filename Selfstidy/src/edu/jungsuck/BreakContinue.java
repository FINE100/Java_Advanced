package edu.jungsuck;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		int menu = 0; 
		int num = 0;
		
		Scanner scn = new Scanner(System.in);
		
		Outer: // while문에 이름 붙임
		while(true) { //무한 반복문
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료 0)");
			
			String tmp = scn.nextLine();	//화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
//				System.out.println("프로그램을 종료합니다");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는0)");
				continue;
			}
			for (;;) { //무한반복문
				System.out.println("계산할 값을 입력하세요.(계산 종료 0, 전체 종료 99)");
				tmp = scn.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num ==0) 
					break;			//계산 종료. for문 벗어남
				
				if(num ==99)
					break Outer;   //전체 종료. for문과 while문 모두 벗어난다. 
				
				switch(menu) {
				case 1 :
					System.out.println("result = " + num * num);
				case 2 :
					System.out.println("result = " + Math.sqrt(num));
				case 3 : 
					System.out.println("result = " + Math.log(num));
				
				}
			} //for(;;)
		} // while의 끝
		System.out.println("프로그램이 종료되었습니다");
	} //main 의 끝
}
				
				
				
				
