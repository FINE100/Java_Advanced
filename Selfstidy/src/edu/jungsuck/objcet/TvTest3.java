package edu.jungsuck.objcet;

public class TvTest3 {

	public static void main(String[] args) {
		Tv t1 = new Tv(); // Tv t1; t1 = new Tv();를 한문장으로 표현
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널은 " +t1.channel + "입니다."); 
		System.out.println("t2의 채널은 " +t2.channel + "입니다.");
		
		t2 = t1; 		// t1이 저장하고 있는 값(주소)을 t2에 저장한다.
		t1.channel = 7; // channel 값을 7로 한다
		System.out.println("t1의 채널은 " +t1.channel + "입니다.");
		System.out.println("t2의 채널은 " +t2.channel + "입니다."); 
		
		// t2가 가지고 있던 값은 잃어버림. t1에 저장되어있던 값이 t2에도 저장. 
		// t2 역시 t1이 참조하고 있는 인스턴스 같이 참조함. (t2의 본래값은 가비지컬렉터에 의해 자동 삭제됨)
		// t1과 t2가 같은 인스턴스를 가리키고 있기 떄문에 같은 결과값 출력됨
		
	}

}
