package com.yedam.review;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductPage {




	public static void main(String[] args) {
	
		// co.eud.ex의 Homework18의 교수님 풀이
		
// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.

// 내용 분석 미리 하기 
// 1. Product Class 생각 -> 배열에 있는 데이터 비교, 연산 -> 프로그램
// 2. Product -> amount(수), price(가격) -> 필드
// 3. Product[] proArr; -> 배열 이용 think 
// 4. 각 인덱스 호출 :  최고 가격 제품 골라내기, 모든 제품 합 - 최고 가격
// 5. 코딩 
		
		
// 1) 메뉴는 다음과 같이 구성하세요.
// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		
// 상품 수 = 배열의 사이즈이자 product 객체 숫자		
		
// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
// 3) 제품별 가격을 출력하세요.
// 출력예시, "상품명 : 가격"
// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
	
	Scanner scn = new Scanner(System.in);		
	// 클래스 타입의 배열 사용
	Product[] pro = null; // 얼마가 들어올지 모르므로 null로 초기선언;
	
	
	//List로 변환 >> 변환해서도 풀기 
	// List<Product> list = new ArrayList<Product>();
	List<Product> list = new ArrayList<>();	
	
	//while 순환을 위해 선언 
	boolean flag = true;
	
	while(flag) {
		System.out.println(" 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
		System.out.println("입력>");
		
		int menuNo = Integer.parseInt(scn.nextLine());		
		
		switch(menuNo) {
		case 1 :
			System.out.println("상품 수 입력 >");
			int count = Integer.parseInt(scn.nextLine()); 
			pro = new Product[count]; // 상품 수 = 배열의 사이즈이자 product 객체 숫자 						
			break;
		case 2 : 
			for(int i = 0; i<pro.length; i++) {
				// pro[i]번째의 객체를 가지고 옴. Product pro = new Product(); 를 불러오는 것과 동일.
				
			    pro[i] = new Product(); // 기본 생성자만 있을 때 
				
				System.out.println("상품명 입력 >");
				String name = scn.nextLine();
				pro[i].setName(name);
				
				System.out.println("상품 가격 입력 >");
				int price = Integer.parseInt(scn.nextLine());
				pro[i].setPrice(i);
				
				System.out.println("상품 수량 입력 >");
				int amount = Integer.parseInt(scn.nextLine());
				pro[i].setAmount(amount);
			}
			break;			
			
		case 3 :
			  // 배열타입으로 만들어진 변수
			 // Product 객체
			  
			for(Product product : pro) { // 향상된 for 문 : for( 배열 타입으로 만들어진 변수 : 배열 ) 
				System.out.println("상품명 : " + product.getName() + 
						"상품 가격 : " + product.getPrice());				
			}
			
			break;
		case 4 :
			// 최고 가격을 가진 상품 
			// 최고 가격을 제외한 상품 가격의 합 
			
			//최고 가격을 비교하기 위한 변수
			int maxPro = 0;					
			// 총 합계를 구하기 위한 변수 
			int sum = 0;
			for(int i = 0; i<pro.length; i++) {
				// 최고 가격 구하기 위함.
				if(pro[i].getPrice( ) > maxPro) {
					maxPro = pro[i].getPrice();					
				}				
				sum += pro[i].getPrice();
			}
				sum -= maxPro;
				System.out.println("최고 가격을 뺀 상품 가격의 합 : " + sum);
				
			break;
			
		case 5 :
			System.out.println("프로그램 종료");
			flag = false; // 거짓일 시 종료 될 수 있도록 조건 추가 
			break;
		
		
		}
	}
	
		

	}

}

	

