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
		this.name = name;
		this.salary = salary;
		
    }
	public void print() {
		System.out.println("수퍼클래스");
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + "]";
	}
	
	
	
	}



