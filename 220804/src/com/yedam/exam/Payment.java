package com.yedam.exam;
/* CardPayment 클래스
 * SimplePayment 클래스 연관
 */

public interface Payment {
	/* 상수 필드 
	 * 1) 온라인 결제 할인율 (ONLINE_PAYMENT_RATIO), 5%
	 * 2) 오프라인 결제 할인율 (OFFLINE_PAYMENT_RATIO), 3%
	 */
	
	// 온라인 결제 할인율
	public static final double ONLINE_PAYMENT_RATIO = 0.05; // static 모든 메서드에서 사용할 수 있도록.
	
	// 오프라인 결제 할인율
	public static final double OFFLINE_PAYMENT_RATIO = 0.03;
	
	
	/* 추상 메서드
	 * 1) 온라인 결제 메서드 시그니처 : public int online(int price)
	 * 2) 오프라인 결제 메서드 시그니처 : public int offline(int price)
	 * 3) 결제 정보 출력 메서드 시그니처 : public void showInfo()
	 */
	
	// 추상 메서드
	//public abstract int online(int price);
	
	public int online(int price);   // 인터페이스에서는 abstract 표기 하지 않아도 추상 메서드로 봄. 
	public int offline(int price); 			 //  당연히 오버라이딩해서 사용해야하기 때문에.
	public void showInfo();
}
