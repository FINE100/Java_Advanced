package co.study.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Homework16 {

	public static void main(String[] args) {
		/*
		 * 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		 */

//		int [] arr = { 3, 9, 11,15, 18, 20, 21, 24, 30, 32}; // 양의 정수 10개 선언
//		for(int i =0 ; i <arr.length; i++) { // 배열 길이만큼 돌면서 탐색
//			if(arr[i] % 3 == 0) {			// 인덱스의 값이 3의 배수일 경우 조건 
//				System.out.println(arr[i]); // 해당 조건 출력
		
		
		// 직접 입력 받아 푸는 방법

		Scanner scn = new Scanner(System.in);
		int[] arr = new int[10];

		System.out.println("원하는 숫자 10개를 입력하세요. (1~100)");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] 번째 값 입력>");
			arr[i] = scn.nextInt();
		}								// 반복문으로 배열 저장. 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {				// 저장된 배열 중에서 3의 배수 찾기
				System.out.print(arr[i]+ " "); // 3의 배수 출력

			}
		}
	}

}
