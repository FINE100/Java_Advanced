package co.study.solve;

public class StandardWeightInfo extends Human {

	private double sw; // 표준체중

	public StandardWeightInfo() {
	}

	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(", 표준체중 : " + this.sw);
	}

	public double getStandardWeight() {
		sw = (getHeight() - 100) * 0.9;
		return sw;

	}

}
