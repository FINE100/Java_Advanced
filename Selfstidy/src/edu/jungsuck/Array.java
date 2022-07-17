package edu.jungsuck;

public class Array {

	public static void main(String[] args) {
//		int[] score;		     	// 배열을 선언(배열을 다루기 위한 참조변수 선언)
//		score = new int[5];         // 배열을 생성(실제 저장공간을 생성)
		
		int [] score = new int[5];  //배열의 선언과 생성을 동시에
		score[3] = 100;
		
		System.out.println("score[0] = " +score[0]);
		System.out.println("score[1] = " +score[1]);
		System.out.println("score[2] = " +score[2]);
		System.out.println("score[3] = " +score[3]);
		System.out.println("score[4] = " +score[4]);   // 0부터 시작이라 인덱스는 0, 1, 2, 3, 4 (5개)
		
		int value = score[3];
		System.out.println("value = "+value);			// score[3]의 값 100 출력

	}

}
