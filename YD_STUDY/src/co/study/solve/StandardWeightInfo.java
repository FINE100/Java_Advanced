package co.study.solve;

public class StandardWeightInfo extends Human {
	
	public double standardWeight;

	public StandardWeightInfo(String name, double height, double weight, double standardWeight) {
		super(name, height, weight);
		this.standardWeight = standardWeight;
	}

	public void getInformation(String name, double height, double weight, double standardWeight) {

		System.out.printf("이름 : %5S, 키 : %f, 몸무게 : %f, 표준몸무게 : %5f", name, height, weight, standardWeight);

	}

	public double getStandardWeight() {
		return (height - 100) * 0.9;

	}

}
