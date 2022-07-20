package co.study.ex;

import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		System.out.println("x 값을 입력하세요");
		int x = scn.nextInt();
		
		System.out.println("y 값을 입력하세요");
		int y = scn.nextInt();
		
		if(x>0&&y>0) {
			System.out.println("제 1사분면");
		} else if (x<0&&y>0){
				System.out.println("제 2사분면");
			}else if(x<0&&y<0) {
				System.out.println("제3사분면");
		}else if(x>0&&y<0) {
			System.out.println("제4사분면");
		}else {
			System.out.println("시스템 종료");
		}
		

	}

}
