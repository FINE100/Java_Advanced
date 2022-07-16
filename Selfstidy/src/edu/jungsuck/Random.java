package edu.jungsuck;

public class Random {

	public static void main(String[] args) {
		// 괄호 {} 안의 내용을 20번 반복한다
		// Q. 1~10까지의 난수 임의 출력
		// Q2. -5 ~ 5 사이의 난수 임의 출력
		for(int i=0; i<=20; i++) {
		//	System.out.println(Math.random()); // 0.0 <=x <1.0
		//	System.out.println(Math.random()*10); // 0.0 <=x <10.0
			System.out.println((int)(Math.random()*10)+1); // 1 <=x <11
			System.out.println((int)(Math.random()*11)-5); // -5 <=x <6
		}

	}

}
