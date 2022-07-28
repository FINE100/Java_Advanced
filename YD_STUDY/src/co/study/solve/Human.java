package co.study.solve;

public class Human {
	//필드
	public String name;
	public double height;
	public double weight;
	
	//생성자
	public Human() {}
	
	//메소드
	
	public void getInformation(String name,double height,double weight) {
		System.out.printf("이름 : %5S, 키 : %f, 몸무게 : %f ", name, height, weight);
	}
	
	
}

