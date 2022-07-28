package co.study.solve;

public class Employee {
	
	//필드
	public String name;
	public int salary;
	
	//생성자
	public Employee() {
		
	}

	// 메소드
	public void getInformation(String name, int salary) {
		System.out.printf("이름 : %5S, 연봉 : %d", name, salary);
		
    }
	public void print() {
		System.out.println("수퍼클래스");
	}

}	
	
	
	



