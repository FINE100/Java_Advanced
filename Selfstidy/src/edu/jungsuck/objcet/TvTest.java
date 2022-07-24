package edu.jungsuck.objcet;
/* 클래스 개념 공부
 * 
 */

class Tv { // TV의 속성 (멤버변수)
	String color;	// 색상
	boolean power; 	// 전원상태(on / off)
	int channel;    // 채널
	
	void power () {power = !power;}  // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {channel ++;}   // TV의 채널 높이는 기능을 하는 메서드
	void channelDown() {channel --;} // TV의 채널 낮추는 기능을 하는 메서드
}

class TvTest {
	public static void main(String arge[]) {
	Tv t; 				//TV 인스턴스 참조하기 위해 변수 t 선언
	t = new Tv(); 		// TV 인스턴스 생성한다. (생성된 객체 주소값이 t에 저장됨)
	t.channel = 7;		// TV 인스턴스의 멤버변수 channel의 값을 7로 설정.
	t.channelDown();	//TV 인스턴스의 메서드 호출. 참조변수. 메서드() 형태로 기능 사용
	System.out.println("현재 채널은 " +t.channel + "입니다.");
	}
}
