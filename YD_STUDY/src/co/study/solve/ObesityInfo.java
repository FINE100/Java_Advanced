package co.study.solve;
/* ObesityInfo 조건
 * 1) StandardWeightInfo 상속
 * 2) 메소드 정의
 *  - public void getInormation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
 *  - public double getObesity() : 비만도
 *    비만도 : (Weight - 표준 체중) / 표준체중 * 100 
 */

public class ObesityInfo extends StandardWeightInfo {
	// 필드

	// 생성자
	public ObesityInfo(String name, double tall, double weight) {
		super(name, tall, weight);

	}

	// 메소드

	public void getInformation() {

		System.out.println("이름 : " + name + ", 키 : " + tall + ", 몸무게 : " + weight + ", 비만도 :" + getObesity(weight, tall) + "입니다.");
		
		bmi();
		
		
		
//		if(getObesity(weight, tall) <10) System.out.println("정상입니다.");
//		else if(10<=getObesity(weight, tall) && getObesity(weight, tall)<20) System.out.println("과체중입니다.");
//		else System.out.println("비만입니다.");
//		
		

	}

	public double getObesity(double weight, double tall) {
		return ((weight - super.getStandardWeight(tall)) / super.getStandardWeight(tall)) * 100;
	}
	
	public void bmi () {
		if(getObesity(weight, tall) <10) 
			System.out.println("정상입니다.");
		else if(10<=getObesity(weight, tall) && getObesity(weight, tall)<20) 
			System.out.println("과체중입니다.");
		else System.out.println("비만입니다.");
		
	}
	
	
	
	
	
	


}

//	// 필드
//	public double ob; // 비만도
//
//	// 생성자
//
//	public ObesityInfo() {}
//
//	public ObesityInfo(String name, double height, double weight) {
//		super(name, height, weight);
//
//	}
//
//	// 메서드
//
//	public void getInormation() // 이름, 키, 몸무게와 비만도를 출력하는 기능
//	{
//		System.out.printf("이름 : %5S, 키 : %f, 몸무게 : %.1f ", getName(), getHeight(), getWeight());
//		System.out.printf(", 비만도는 %.1f 입니다", ob);
//
//		
////		
////		if(biman <10) System.out.println("정상입니다.");
////		else if(10<=biman && biman<20) System.out.println("과체중입니다.");
////		else System.out.println("비만입니다.");
//	}
//
//
//
//	public double getObesity() {
//		ob = getWeight() - getStandardWeight() / getStandardWeight() * 100;
//		return ob;
//	}
//
//}
