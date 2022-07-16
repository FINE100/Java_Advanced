package edu.jungsuck;

public class Mathround {
	public static void main(String[] args) {

		double pi = 3.141592;
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi * 1000) / 1000); // 1000으로 나눌 경우 int라 결과값이 정수로 나옴
		System.out.println(Math.round(pi * 1000) / 1000.0);   		
	}
}
