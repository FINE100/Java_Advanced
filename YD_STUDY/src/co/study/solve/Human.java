package co.study.solve;
/* Human <- StandardWeightInfo <- ObesityInfo <-BMI
 * Human 조건 
 * 필드 : 이름, 키 ,몸무게 
 * 생성자 이용 값 초기화  
 * 메소드 
 * - public void getInformation() : 이름, 키, 몸무게
 */

public class Human {
	// 필드 (앞에 아무것도 없으면 default)
	String name; 
	double tall;
	double weight;

	// 생성자
	public Human(String name, double tall, double weight) {
		this.name = name;
		this.tall = tall;
		this.weight = weight;
	}
	
	// 메소드
	
	public void getInformation() {
		System.out.println ("이름 : " + name + "키 : " + tall + "몸무게 : " +weight);
	}
	
}
	
	
	
	
	
	
//필드	
//	private String name;
//	private double height;
//	private double weight;
//
//	// 생성자
//	public Human() {
//	}
//
//	public Human(String name, double height, double weight) {
//		this.name = name;
//		this.height = height;
//		this.weight = weight;
//	}
//
//	// 메소드
//
//	public void getInformation() {
//		System.out.printf("이름 : %5S, 키 : %.1f, 몸무게 : %.1f ", name, height, weight);
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//
//	public double getWeight() {
//		return weight;
//	}
//
//}
