package co.study.solve;

/*
 * 문제. 문자형(String) strNum1, strnum2을 키보드로 입력받아
 * 정수형(int) num1, num2로 변환 후 
 * result 1, result2 , result3, result4에 
 * 덧셈, 뺄셈, 곱셈, 나눗셈 결과를 담아 출력해보세요
 *  
 * 출력 예) 29 - 4의 결과 25
 */

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		String strNum1 = scn.nextLine();	  // 문자열 strNum1 값은 키보드로 입력 받아옴
		int num1 = Integer.parseInt(strNum1); // 문자열 strNum1 -> 정수(int) num1으로 형변환 

		String strNum2 = scn.nextLine();      // 문자열 strNum2 값은 키보드로 입력 받아옴
		int num2 = Integer.parseInt(strNum2); // 문자열 strNum1 -> 정수(int) num1으로 형변환 
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4= num1 / num2;				// 정수타입으로 변형 후 사칙연산 
		
		
		System.out.println("두 수의 덧셈 값은 " + result1);
		System.out.println("두 수의 뺄셈 값은 " + result2);
		System.out.println("두 수의 곱셈 값은 " + result3);
		System.out.println("두 수의 나눗셈 값은 " + result4);  //화면에 출력
		
	}

}