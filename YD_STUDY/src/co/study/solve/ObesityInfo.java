package co.study.solve;

public class ObesityInfo extends StandardWeightInfo {
	
	//필드
	public double obesity;
	
	//생성자
	public ObesityInfo(String name, double height, double weight, double standardWeight, double obesity ) {
		super(name, height, weight,standardWeight);
		this.obesity = obesity;
		
	}
	

	//메서드
	public void getInformation(String name, double height, double weight, double obesity) // 이름, 키, 몸무게와 비만도를 출력하는 기능
	{	System.out.printf("이름 : %5S, 키 : %f, 몸무게 : %f, 비만도 : %5f", name, height, obesity);
	}

	

	public double getObesity(double weight) // 비만도를 구하는 기능 ( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	{	double obesity = (weight - 100) * 0.9;
		return obesity;
	}

}
