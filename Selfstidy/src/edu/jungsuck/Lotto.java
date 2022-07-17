package edu.jungsuck;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// index : 0~44(45개)
		int[] ball = new int[45]; // 45개의 정수값 저장하기 위해 공간 만듦

		// 배열의 요소에 1~45의 값을 저장한다.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // ball[0] = 1 이 저장됨
			
		} System.out.println(Arrays.toString(ball));


		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값 저장
		// 0번째부터 5번쨰 요소까지 모두 6개만 바꾼다 ( 6개 숫자 추첨이므로 [7]부터는 자리 바꿔도 의미 X )

		int tmp = 0; // 두 값을 바꾸는 데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어 저장할 변수

		for (int i = 0; i < 6; i++) { // 0~5까지 (6개) 자리 값만 돌림
			j = (int) (Math.random() * 45); // 0~44 범위의 임의의 값 뽑기
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}

		// 배열 ball의 앞에서부터 6개 요소를 출력한다.
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);

	}
}
