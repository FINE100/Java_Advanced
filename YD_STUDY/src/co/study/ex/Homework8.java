package co.study.ex;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		// 문제4) 변수 val의 값이 양수일 경우엔 변수 값을, 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int val = scn.nextInt();
		int intResult = (val>0) ? val : 0; 
			System.out.printf("결과는 %d 입니다.%n" , intResult);
			
			
			
/* 교수님 풀이
 * int var = -2;
 * int var = var>0 ? var : 0; 
 * 
 * 
 * //이렇게 긴 조건문을 위의 한주로 줄일 수 있음.
 *  	if(var>0){
 * 		System.out.printf(var);
 * 		} else {
 * 			System.out.println(0);
 * 		}
 * 
 *  // 삼항 연산자를 메소드로 리턴해서 쓸 수도 있다.
 * 		public int exam() { 
 *  		return var<0 > var : 0 ;
 *  	 }
 * 
 * 
 * 
 * 
 * 
 */
			
	
				
	/* 문제 5) 다음과 같이 두 개의 정수가 주어졌을 경우 
	   두 정수 중에서 음수가 있다면 'One of a or b is negative number'를,
	   만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요. */ 
				int a = 10;
				int b = -8;
				String strResult = (a<0||b<0)? "One of a or b is negative number" : "both a and b are zero or more";
				System.out.printf("판별결과는 %s입니다.",strResult);

				

	}
}

