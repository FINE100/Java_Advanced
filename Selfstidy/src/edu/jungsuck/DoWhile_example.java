package edu.jungsuck;

import java.util.Scanner;

public class DoWhile_example {

	public static void main(String[] args) {
		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100) + 1; // 1~100 사이의 임의의 난수
		Scanner scn = new Scanner(System.in);

		do {
			System.out.println("1과 100사이의 정수를 입력하세요");
			input = scn.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			}
		} while (input != answer);			// do 실행문 실행 후, while 조건문이 true이면 반복, false이면 끝나므로
		System.out.println("정답입니다.");     // 일부러 false인 조건문을 넣어서 종료 시킴

	}

}
