package co.study.solve;

public class Employee {

	// 필드
	private String name;
	private int salary;

	// 생성자
	
	public Employee() {}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}
	

	public int getSalary() {
		return salary;
	}


	public void getInformation() {
		System.out.println("이름 : "+name +  ", 연봉 : " + salary);
//		
	}

	public void print() {
		System.out.println("수퍼클래스");
	}

}
