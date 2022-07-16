package edu.jungsuck;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';

		System.out.println("점수를 입력하세요>");

		Scanner scn = new Scanner(System.in);
		score = scn.nextInt();

		System.out.printf("당신의 점수는 %d 점수입니다\n", score);

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은%c%c입니다.%n", grade, opt);
	}

}
