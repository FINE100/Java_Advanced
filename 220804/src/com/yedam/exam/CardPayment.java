package com.yedam.exam;

public class CardPayment implements Payment {
/* 1) 필드로 카드할인율(cardRatio)을 가진다.
 * 2) 생성자를 통해 매개변수로 값을 받아 필드를 초기화 한다.
 * 3) 아래의 실행코드와 실행결과를 참조하여 Payment 인터페이스 메서드를 오버라이딩 한다.
 */
	

	//필드
	public double cardRatio;
	
	//생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	//메소드	;
	@Override
	public int online(int price) {
		// 카드 대한 할인율 cardRatio
		// 온라인 결제에 대한 할인율 ONLINE_PAYMENT_RATIO
		// 카드 결제 할인율 + 온라인 결제 할인율 = ? 
		int pay = (int) (price - (price *(cardRatio +Payment.ONLINE_PAYMENT_RATIO)));
		return pay;
	}

	@Override
	public int offline(int price) {
		// 카드 대한 할인율 cardRatio
		// 온라인 결제에 대한 할인율 ONLINE_PAYMENT_RATIO
		// 카드 결제 할인율 + 오프라인 결제 할인율 = ? 
		int pay = (int) (price - (price *(cardRatio +Payment.OFFLINE_PAYMENT_RATIO)));
		return pay;
	}

	@Override
	public void showInfo() {
		System.out.println(" *** 카드로 결제 시 할인 정보 ");
		System.out.println("온라인 결제 시 총 할인율 : "+ (cardRatio + Payment.ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시  총 할인율 : " + (cardRatio + Payment.OFFLINE_PAYMENT_RATIO)); // 우선 더해야하는 것을 괄호로 표기해줌 


	}

}
