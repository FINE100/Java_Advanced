package edu.jungsuck;

public class For_example {

	public static void main(String[] args) {
//		int i; // i를 바깥으로 꺼내서 선언하면 for 블럭 바깥에서도 결과 출력 가능
//		for (i = 1; i <= 10; i++) {
//			System.out.println("i = " + i);
//
//		}
//		System.out.println(i);

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum += i;
			System.out.printf("1부터 %2d까지의 합 : %2d \n", i, sum);

		}
		for (int k = 2; k <= 9; k++) {
			System.out.println("******" + k + "단 *******");
			for (int m = 1; m <= 9; m++) {
				System.out.println(k + "*" + m + "=" + (k * m));
			}
		}
	}
}
