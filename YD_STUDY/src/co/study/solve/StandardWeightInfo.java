package co.study.solve;
/* StandardWeightInfo 조건
 * Human 클래스 상송
 * 메소드 정의
 * - public void getInformation : 이름, 키, 몸무게, 표준체중
 * - public double getStandardWeight() : 표준 체중 
 *  ( 표준 체중 : ((Height - 100) * 0.9)
 */

public class StandardWeightInfo extends Human {

	// 필드

	// 생성자
	public StandardWeightInfo(String name, double tall, double weight) {
		super(name, tall, weight);

	}
		// 메소드
		
	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + ", 키 : " + tall + ", 몸무게 : " + weight + ", 표준체중 : " + getStandardWeight(tall));
		
	}
	
	public double getStandardWeight(double tall) { // 계속 사용하는 내용에 대해서는 따로 빼서 메소드로 만들어주는게 편함. (가용성)
		return (tall - 100) * 0.9;
	
	}
	

	

}

//	private double sw; // 표준체중
//
//	public StandardWeightInfo() {
//	}
//
//	public StandardWeightInfo(String name, double height, double weight) {
//		super(name, height, weight);
//	}
//
//	@Override
//	public void getInformation() {
//		super.getInformation();
//		System.out.println(", 표준체중 : " + this.sw);
//	}
//
//	public double getStandardWeight() {
//		sw = (getHeight() - 100) * 0.9;
//		return sw;
//
//	}
//
//}
