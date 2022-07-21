package co.study.ex;

public class Homework12 {

	public static void main(String[] args) {
		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// *
		// **
		// ***
		// ****
		// *****

		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
