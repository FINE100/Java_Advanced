package co.study.ex;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {
		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.

		 Scanner scn = new Scanner(System.in);
		 
		 System.out.println("가위,바위,보 중 입력해주세요");
		 
		 String rcp = scn.nextLine(); // 가위, 바위, 보 입력 받는 스캐너 사용
		 
		 switch(rcp) { // switch 조건문 : true, fasle 아님. 문자열, 문자, 정수, 상수 가능. 한번만 작용.
		 case "가위" : 
			 System.out.println("이기기 위해선 바위를 내야합니다."); break; // 결과값 출력후 멈추기 위해 break;
		 case "바위" :
			 System.out.println("이기기 위해선 보를 내야합니다.");break; // 결과값 출력후 멈추기 위해 break;
		 case "보" :
			 System.out.println("이기기 위해선 가위를 내야합니다.");break; // 결과값 출력후 멈추기 위해 break;
		 }
		 
	}

}
