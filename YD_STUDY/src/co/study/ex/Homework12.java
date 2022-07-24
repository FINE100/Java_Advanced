package co.study.ex;

public class Homework12 {

	public static void main(String[] args) {
		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// * 					i = 1, j=  1
		// **					i = 2, j = 2
		// ***					i = 3, j = 3
		// ****					i = 4, j = 4
		// *****				i = 5, j = 5

		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(" "); // j 값 찍은 후, 줄 바꾸어 찍을 수 있도록 넣어줌
		}

	}

}
