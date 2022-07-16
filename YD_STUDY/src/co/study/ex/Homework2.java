package co.study.ex;
/* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
출력예시) int a = 10; 의 경우 "10, int"로 출력. */

public class Homework2 {

	public static void main(String[] args) {

		//3-1) byte var1 = 128;
		int var1 = 128;
		System.out.printf("%d, int\n", var1); // byte 타입 : -128 ~ 127까지 표현 가능 > int로 변환
		
		
		//3-2) char var2 = "B";
		String var2 = "B";
		System.out.printf("%s, String\n", var2); // char : 문자 (' ') >  " " 은 문자열이므로 String 변환

		//3-3) String var3 = 44032;
		int var3 = 44032;
		System.out.printf("%d, int\n", var3); // String : 문자열 > int : 정수 변환

		//3-4) int var4 = 100,000,000,000; // int 약 21억(2,147,483,647)까지 표현 가능, 그 이상은 정수는 long 
		long var4 = 100000000000L;
		System.out.printf("%d, long\n", var4);  

		//3-5) float var5 = 43.93106;
		double var5 = 43.93106;						
        System.out.printf("%.5f, double\n", var5); // float의 2배 > double 

		//3-6) long var6 = 301.3;
		double var6 = 301.3;
		System.out.printf("%.1f, double\n", var6); // 소수점(실수)의 기본 표현 값은 double  

	
	}

}
