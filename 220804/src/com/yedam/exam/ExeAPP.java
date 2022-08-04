package com.yedam.exam;

public class ExeAPP {
	public static void main(String[] args) {
		Payment simplePay = new SimplePayment(0.05);
		
	 // 다형성 : 하나의 부모를 가지고 오버라이딩 받아서 다양한 자식의 기능을 만들어 사용할 수 있는 것.
		
//		int online = simplePay.online(10000);
//		int offline = simplePay.offline(10000);
//		
//		simplePay.showInfo();
//		System.out.println("온라인 결제 금액 : " + online);
//		System.out.println("오프라인 결제 금액 : " + offline);
//		
//		Payment cardPay = new CardPayment(0.08);
//		
//		int onlie = cardPay.online(10000);
//		int offlie = cardPay.offline(10000);
//		
//		cardPay.showInfo();
//		System.out.println("온라인 결제 금액 : " + online);
//		System.out.println("오프라인 결제 금액 : " + offline);

		
		//실행 클래스 생성자 호출 
		new MapApp();
		
	}

}
