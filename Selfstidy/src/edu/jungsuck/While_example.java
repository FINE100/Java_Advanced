package edu.jungsuck;

import java.util.Scanner;

public class While_example {

	public static void main(String[] args) {
		int num = 0, sum = 0 ;
		System.out.println("숫자를 입력하세요 >>");
		
		Scanner scn = new Scanner(System.in);
		String tmp = scn.nextLine();
		num = Integer.parseInt(tmp); //입력받은 문자열(tmp) 형변환
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 더함
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;
		}
		System.out.println("각자리 수의 합 : "+sum);
		

	}

}
