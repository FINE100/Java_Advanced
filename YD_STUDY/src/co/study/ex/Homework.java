package co.study.ex;
/* 
 * 문제1. 정수형 변수 2개 선언후, 각각 37과 91로 값 초기화, 변수 출력
 * 문제2. 문제 1번의 변수 이용하여 사칙연산 출력
 */
public class Homework {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;		// 정수형 변수 선언 

		num1 = 37;
		num2 = 91;			// 37, 91로 초기화
		
		System.out.printf("num1 : %d, num2: %d%n", num1, num2); // num1, num2 출력
		System.out.println();
		
		System.out.printf("91 + 37 = %d%n", (num2+num1));
		System.out.printf("91 - 37 = %d%n", (num2-num1));
		System.out.printf("91 * 37 = %d%n", (num2*num1));
		System.out.printf("91 / 37 = %d%n", (num2/num1));		// 사칙연산 출력

	}

}

/* 강사님 풀이
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
