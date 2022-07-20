package co.study.ex;

public class Homework13 {

	public static void main(String[] args) {
		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
				// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
				// 2 X 1 = 2
				// 2 X 2 = 4
				// 2 X 3 = 6
		
		for(int i=2; i<=9 ; i++) {
			System.out.println("===== "+i+"단 =====");
			for(int j=1; j<=9 ; j++) {
				System.out.println(i +" X "+ j +" = " +(i*j));	 
				
			}
			
		}

	}

}
