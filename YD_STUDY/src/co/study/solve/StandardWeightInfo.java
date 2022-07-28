package co.study.solve;

public class StandardWeightInfo extends Human {
	
	public double standardWeight;
	
	public StandardWeightInfo() {}
	
	public void getInformation(String name, double height, double standardWeight) // 이름, 키, 몸무게와 표준체중을 출력하는 기능
	{ System.out.printf("이름 : %5S, 키 : %f, 표준몸무게 : %5f", name, height, standardWeight);
	}
	
	
	//public double getStandardWeight(double height)
	{ 
		
	}
}
