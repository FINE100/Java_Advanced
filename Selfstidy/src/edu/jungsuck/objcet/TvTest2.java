package edu.jungsuck.objcet;

class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv(); // Tv t1; t1 = new Tv();를 한문장으로 표현
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널은 " +t1.channel + "입니다."); 
		System.out.println("t2의 채널은 " +t2.channel + "입니다.");
		
		t1.channel = 7; // channel의 값을 7로 한다
		System.out.println("t1의 채널은 " +t1.channel + "입니다.");
		System.out.println("t2의 채널은 " +t2.channel + "입니다.");
		
		}
	} // t1과 t2는 다른 인스턴스로 다른 값을 가짐 -> 결과값 다름 