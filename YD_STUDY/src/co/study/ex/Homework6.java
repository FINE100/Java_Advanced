package co.study.ex;

public class Homework6 {

	public static void main(String[] args) {
		// 문제1) 아래와 같이 각 변수를 초기화하였을 때 각 문제에 맞게 구현하세요.
		int x = -5;
		int y = 10;
		int result = 0;

		// 1-1) 부호연산자를 이용하여 변수 x의 값을 양수로 출력하세요. 단, 변수 x의 값은 변하지 말아야한다.
		result = -x; // 변수에 바로 +/- 붙여서 양수<-> 음수 할 수 있음
		System.out.printf("x : %d, result : %d\n", x, result);

		// 1-2) 변수 x의 값을 증가시킨 후 변수 y의 값과 더한 다음 변수 y의 값을 감소시키는 연산식을 한줄로 작성하세요.
		result = ++x + y--; // 전위식은 먼저 증가후 연산, 후위식은 연산 후 값을 증감함
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);

		// 1-3) 변수 x와 y의 값을 더한 값이 5가 되도록 증감연산자를 사용하여 연산식을 한줄로 작성하세요.
		result = x-- + y++; // 후위식 이용시 연산(+) 먼저하고 이후에 값 증감 됨.
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);

	}

}
