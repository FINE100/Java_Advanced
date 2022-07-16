package edu.jungsuck;

public class For_example2 {

	public static void main(String[] args) {
		
		// i = 1,2,3,4,5의 내용을 반복
		for (int o = 1; o <= 5; o++) {
			// System.out.println("******");
			for (int p = 1; p <= 5; p++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a = 1; a <= 5; a++) {
			// System.out.println("******");
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();

		}
		// 별찍기 응용
		for (int o = 1; o <= 5; o++) {
			// System.out.println("******");
			for (int p = 5; p >= o; p--) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		
	}

}
