package co.study.ex;

//주어진 배열을 이용하여 다음 내용을 구현하세요.
public class Homework14 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) { // 배열의 길이(arr1.length 만큼) 탐색
			if (arr1[i] == 60) {				// 값이 60인 인덱스를 찾으면 
				System.out.println("Q1. " + (i+1) + "번째 값 : " + arr1[i]); // 출력
			}
		}
		System.out.println(); // 줄바꿈
		
		
		/* 교수님 풀이
		 * 
		 * 인덱스 찾아 값 출력 > 반복문 사용하기 
		 *  for(int i = 0 ; i < arr1.length; i++){
		 * 	 if(arr[i] == 60) {
		 *  	System.out.println((i+1) + "번째 위치입니다.");
		 *   	break;
		 * 			}
		 * 
		 */		
		
		
		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for (int i = 0; i < arr1.length; i++) { // 배열의 길이(arr1.length 만큼) 탐색
			if (arr1[i] != arr1[3]) {			// 배열 인덱스가 3인 곳을 제외
				System.out.println("Q2. arr1[" + i + "] = " + arr1[i]); // 출력
				
				/*
				 * for(int i = 0 ; i < arr1.length; i++){
				 * 	 if(arr!= arr1[3]) {
				 *  	System.out.println(arr1[i]);
				 *
				 * 			} 
				 * 
				 * 
				 */
			}
		}
	}
}



