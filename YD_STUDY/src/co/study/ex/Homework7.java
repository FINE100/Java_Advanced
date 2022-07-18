package co.study.ex;

public class Homework7 {
public static void main(String[] args) {
	// 문제2) 아래와 같이 각 변수를 초기화하였을 때 다음 결과를 차례대로 false 와 true로 출력하도록 수정하세요.
			int m = 10;
			int n = 5;

			System.out.println( ( m*2 != n*4 ) && ( n<=5 ) );		// && : 둘 다 true 일떄만 => true
			System.out.println( ( m/2 >= 5) || ( n%2 < 1) ); 		// || : 둘 중 하나만 ture 라도 => true
			
			// 문제3) 각 연산식을 대입 연산자 하나로 구성된 연산식으로 수정하세요.
			int val = 0;
			//val = val + 10;
			//val = val - 5;		
			//val = val * 3;
			//val = val / 5;
			
			val = (10 -5) * 3 / 5; 
			
			System.out.println(val);
			
			
	
}
}
