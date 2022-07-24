package edu.jungsuck.objcet;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.heigth = " + Card.height); 
		//클래스 변수(static 변수)는 객체 생성 없이 '클래스이름.클래스변수'로 직접 사용 가능
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;// 인스턴스 변수 값 변경
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4; // 인스턴스 변수 값 변경
		
		System.out.println("c1은 " +c1.kind+ ", " +c1.number+"이며, "+" 크기는 ("+ c1.width +", "+c1.height+")");
		System.out.println("c2은 " +c2.kind+ ", " +c2.number+"이며, "+" 크기는 ("+ c2.width +", "+c2.height+")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");	
		c1.width = 50;
		c1.height = 80; 
		
		// 클래스 변수는 하나만 변경해도 c1값이 c2에 반영됨 (같은 저장 공간을 참조하기 때문. 항상 값이 같음.)
		// 인스턴스 변수로 오해하지 않도록 Card.width, Card.height로 쓰는게 좋다. 
		
		System.out.println("c1은 " +c1.kind+ ", " +c1.number+"이며, "+" 크기는 ("+ c1.width +", "+c1.height+")");
		System.out.println("c2은 " +c2.kind+ ", " +c2.number+"이며, "+" 크기는 ("+ c2.width +", "+c2.height+")");
		
	
	}
}
	class Card{
		String kind;
		int number; 				// 인스턴스 변수
		static int width = 100;
		static int height = 250;    // 클래스 변수 (값을 통일해서 사용할 떄)
	}


