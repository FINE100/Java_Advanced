package co.study.ex;
/* 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
출력예시) A278번지10.0 */

public class Homework4 {

	public static void main(String[] args) {
		
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		
		System.out.printf("%s%d%d%s%.1f",charValue,intValue1,intValue3,strValue,((double)intValue4));
		
	}

} // printf() 지시자 이용하면 값을 이어서 표현 가능 
