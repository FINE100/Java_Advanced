package edu.jungsuck;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100, 95, 80, 70, 60}; 이렇게도 가능
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		char[] charArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1; // 1~10까지의 숫자 순서대로 배열
		}

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1; // 1~10까지의 숫자 무작위로 배열
		}

		// 배열된 값들을 출력한다
		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");

		}

		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(charArr));
		System.out.println(iArr3);						// 변수 주소값 나옴
		System.out.println(charArr);					// char은 예외적으로 정상 출력
		
	}

}
