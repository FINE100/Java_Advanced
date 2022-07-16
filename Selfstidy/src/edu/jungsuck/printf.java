package edu.jungsuck;

public class printf {
	public static void main(String[] args) {
		
		
		System.out.printf("[%5d]%n", 10);			//전체 5자리 출력 (빈공간은 공백)		
		System.out.printf("[%-5d]%n", 10);			// 왼쪽정렬하여 전체 5자리 출력 
		System.out.printf("[%05d]%n", 10);			// 빈자리 0으로 채우고 총 5자리 출력
		
		System.out.printf("[%5d]%n", 1234567);		//지정한 자리보다 출력할 값의 자리수가 더 많은 경우 그대로 출력됨
				
		
		System.out.printf("[%s]%n", "www.chobocode.com");		// 문자열 출력
		System.out.printf("[%20s]%n", "www.chobocode.com");		// 전체 20자리 출력 (빈공간은 공백으로 나옴)
		System.out.printf("[%-20s]%n", "www.chobocode.com");	// 왼쪽정렬하여 전체 20자리 출력(빈공간은 공백)
		System.out.printf("[%.10s]%n", "www.chobocode.com");	// 앞에서부터 10자리 잘라서 출력
		
		
		
	}

}
