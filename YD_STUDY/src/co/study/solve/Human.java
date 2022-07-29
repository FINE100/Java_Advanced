package co.study.solve;

public class Human {
	// 필드
	private String name;
	private double height;
	private double weight;

	// 생성자
	public Human() {
	}

	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 메소드

	public void getInformation() {
		System.out.printf("이름 : %5S, 키 : %.1f, 몸무게 : %.1f ", name, height, weight);
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}
