package co.study.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Homework15 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		Scanner scn = new Scanner(System.in);
		
		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		
		// 교수님 풀이 (스캐너 넣어서 직접 입력하는 방법으로 요구하는 문제였음)
		System.out.println("인덱스 입력");
		int index = Integer.parseInt(scn.nextLine());
		arr1[index] = 1000;
		System.out.println("Q3. 수정된 배열 arr1은 " + Arrays.toString(arr1));	
		
		
//      내풀이 (예시로 이해 잘못함.)		
//		int tmp = 1000; 		// 변경하려는 값 1000을 tmp에 받음
//		arr1[3] = tmp;			// arr1[3] 값 50를 tmp에 넣음
//		tmp = arr1[3];			// tmp 값 1000을 arr1[3]에 넣음
//		System.out.println("Q3." + Arrays.toString(arr1)); // 배열 출력 (Array.toString > 배열 전체 출력)
//		
		
		

		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = arr1[0]; int min = arr1[0];
		
		for(int i = 1 ; i<arr1.length ; i++) {
			if(arr1[i]>max) { 
				max = arr1[i];
			}else if(arr1[i]<min) { 
 				min = arr1[i];
			}
		}
		System.out.printf("Q4. 최대값 %d, 최소값 %d", max, min);
	}

}
