package com.yedam.exam;

public class SimplePayment implements Payment {

	/*- 필드로 간편결제 할인율(simplePaymentRatio)을 가진다.
	 *- 생성자를 통해 매개변수로 값을 받아 필드를 초기화 한다.
	 * - 아래의 실행코드와 실행결과를 참조하여 Payment 인터페이스 메서드를 오버라이딩 한다.  
	 */
		
		
		
		//필드
		public double simplePaymentRatio;
		
		// 생성자
		public SimplePayment(double simplePaymentRatio) {
			this.simplePaymentRatio = simplePaymentRatio;
		}
		
		// 메소드

		@Override
		public int online(int price) {
			// 간편결제에 대한 할인율 simplePaymentRatio
			// 온라인 결제에 대한 할인율 ONLINE_PAYMENT_RATIO
			// 간편 결제 할인율 + 온라인 결제 할인율 = ? 
			// price 금액에 해서 할인율 적용하고, 거기에 대한 가격을 표시 
			// 원가 - (원가 * 할인율) = 할인 후 금액 
			// 예) 10000 - (10000*0.1) = 9000
			// pirce - (price * simplePaymentRatio +  ONLINE_PAYMENT_RATIO) = 할인 후 금액
			int pay = (int) (price - (price * (simplePaymentRatio +  Payment.ONLINE_PAYMENT_RATIO))); // 연산식에 double 타입이 있어 오류 뜸. int로 형변환해줌.
			// 할인된 금액 반환
			return pay;
		}

		@Override
		public int offline(int price) {
			// 간편결제에 대한 할인율 simplePaymentRatio
			// 오프라인 결제에 대한 할인율 OFFLINE_PAYMENT_RATIO
			// 간편 결제 할인율 + 오프라인 결제 할인율 = ? 
			int pay = (int) (price - (price * (simplePaymentRatio +  Payment.OFFLINE_PAYMENT_RATIO))); // 연산식에 double 타입이 있어 오류 뜸. int로 형변환해줌.
			return pay;
		}

		@Override
		public void showInfo() {
			System.out.println(" *** 간편 결제 시 할인 정보 ");
			System.out.println("온라인 결제 시 총 할인율 : "+ (simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
			System.out.println("오프라인 결제시  총 할인율 : " + (simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO)); // 우선 더해야하는 것을 괄호로 표기해줌 

		}

	}
